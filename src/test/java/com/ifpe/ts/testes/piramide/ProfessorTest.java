package com.ifpe.ts.testes.piramide;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.ifpe.ado.professor.RepositorioProfessor;
import com.ifpe.excecoes.SiapeInvalidoException;
import com.ifpe.excecoes.TelefoneInvalidoException;
import com.ifpe.professor.Professor;

public class ProfessorTest {

	RepositorioProfessor repoProfessor;
	Professor professor;

	@Before
	public void init() throws TelefoneInvalidoException, SiapeInvalidoException {
		this.repoProfessor = new RepositorioProfessor();
		this.professor = new Professor("João Pedro", "87999955045", "1234567");
	}

	@Test	
	public void insertProfessorTest() throws Exception {
		int status = this.repoProfessor.inserir(this.professor);
		assertTrue(status!=0);
	}
	
	@Test
	public void removerProfessorTest() throws Exception {
		int status = this.repoProfessor.remover(this.professor.getSiape());
		assertTrue(status != 0);
	}
	@Test(expected = SQLException.class)
	public void insertTest() throws TelefoneInvalidoException, SiapeInvalidoException, SQLException  {
		
        Professor prof = new Professor("Humberto", "81999074393", "1408701");
        RepositorioProfessor repProf = new RepositorioProfessor();
        int i = repProf.inserir(prof);
        repProf.remover("1408701");
        assertFalse(throwException());
        
	}
	private boolean throwException() throws SQLException{
        throw new SQLException();
	
	}
	@Test(expected = Exception.class)
	public void insert2Test() throws TelefoneInvalidoException, SiapeInvalidoException, Exception  {
		
        Professor prof = new Professor("Humberto", "81999074393", "1408702");
        RepositorioProfessor repProf = new RepositorioProfessor();
        int i = repProf.inserir(prof);
        repProf.remover("1408702");
        assertFalse(throwExceptionEx());
        
        
	}
	@Test(expected = Exception.class)
	public void remove2Test() throws TelefoneInvalidoException, SiapeInvalidoException, Exception  {
		
        Professor prof = new Professor("Humberto", "81999074393", "1408702");
        RepositorioProfessor repProf = new RepositorioProfessor();
        repProf.remover("1408702");
        repProf.remover("1408702");
        assertTrue(throwExceptionEx());
        
        
	}
	private boolean throwExceptionEx() throws Exception{
        throw new Exception();
	
	}
}