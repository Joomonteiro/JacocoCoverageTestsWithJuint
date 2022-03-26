package com.ifpe.ts.testes.piramide;

import static org.junit.Assert.assertTrue;

import java.sql.Timestamp;

import org.junit.Before;
import org.junit.Test;

import com.ifpe.ado.emprestimo.RepositorioEmprestimo;
import com.ifpe.ado.item.RepositorioItem;
import com.ifpe.ado.professor.RepositorioProfessor;
import com.ifpe.emprestimo.Emprestimo;
import com.ifpe.excecoes.SiapeInvalidoException;
import com.ifpe.excecoes.TelefoneInvalidoException;
import com.ifpe.facade.Facade;
import com.ifpe.item.Item;
import com.ifpe.professor.Professor;

public class FacadeTest {
	Facade facade;
	Professor professor;
	Professor professor2;
	Item item;
	Item item2;
	Emprestimo emp;
	Timestamp ts;
	RepositorioEmprestimo repEmprestimo;
	
	@Before
	public void init() throws TelefoneInvalidoException, SiapeInvalidoException {
		this.facade = new Facade();
		this.professor = new Professor("João Pedro", "87999955045", "1234567");
		this.professor2 = new Professor("João Pedro", "87999955045", "1234568");
		this.item = new Item("123458", "Notebook");
		this.item2 = new Item("123459", "Notebook");
		this.ts = new Timestamp(System.currentTimeMillis());
		this.emp = new Emprestimo("1234568", this.item2.getCodigoItem(), ts.toString());
		this.repEmprestimo = new RepositorioEmprestimo();
	}
	
	@Test	
	public void insertProfessorTest() throws Exception {
		int status = this.facade.inserirProfessor(this.professor);
		assertTrue(status!=0);
	}
	
	@Test
	public void removerProfessorTest() throws Exception {
		int status = this.facade.removerProfessor(this.professor.getSiape());
		assertTrue(status != 0);
	}
	
	@Test	
	public void insertitemTest() throws Exception {
		int status = this.facade.inserirItem(this.item);
		assertTrue(status!=0);
	}
	
	@Test
	public void removeritemTest() throws Exception {
		int status = this.facade.removerItem(this.item.getCodigoItem());
		assertTrue(status != 0);
	}
	
//	@Test
//	public void insertempTest() throws Exception {
//		this.facade.inserirItem(this.item2);
//		this.facade.inserirProfessor(this.professor2);
//		int status = this.facade.inserirEmprestimo(emp);
//		assertTrue(status!=0);
//	}
//
//	@Test
//	public void removeempTest() throws Exception {
//		int id = this.repEmprestimo.retornaUltimo();
//		int status = this.facade.removerEmprestimo(id);
//		this.facade.removerItem(this.item2.getCodigoItem());
//		this.facade.removerProfessor(this.professor2.getSiape());
//		assertTrue(status!=0);
//	}
	
	
	
	
}
