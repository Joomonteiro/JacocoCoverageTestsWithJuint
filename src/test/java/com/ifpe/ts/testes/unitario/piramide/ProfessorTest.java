package com.ifpe.ts.testes.unitario.piramide;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.ifpe.excecoes.SiapeInvalidoException;
import com.ifpe.excecoes.TelefoneInvalidoException;
import com.ifpe.professor.Professor;

public class ProfessorTest {
	Professor professor;
	Professor professor2;

	@Before
	public void init() throws TelefoneInvalidoException, SiapeInvalidoException {
		this.professor = new Professor("João Pedro", "87981325692", "1234567");
		this.professor2 = new Professor();
	}
	
	@Test(expected=TelefoneInvalidoException.class )
	public void telefoneInvalidoExceptionTest() throws TelefoneInvalidoException, SiapeInvalidoException {
		this.professor = new Professor("João Pedro", "ABC81236589", "1234567");
	}
	
	@Test(expected=SiapeInvalidoException.class )
	public void siapeInvalidoExceptionTest() throws TelefoneInvalidoException, SiapeInvalidoException {
		this.professor = new Professor("João Pedro", "87981236589", "123");
	}
	
	@Test
	public void setNomeTest() {
		this.professor.setNome("José da Silva Junior");
		assertTrue(this.professor.getNome().equals("José da Silva Junior"));
	}
	
	@Test
	public void setTelefoneTest() {
		this.professor.setTelefone("87999563269");
		assertTrue(this.professor.getTelefone().equals("87999563269"));
	}
	
	@Test
	public void setsiapeTest() {
		this.professor.setSiape("ABCDEFG");
		assertTrue(this.professor.getSiape().equals("ABCDEFG"));
	}
	 
}
