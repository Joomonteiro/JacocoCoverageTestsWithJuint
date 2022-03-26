//package com.ifpe.ts.testes.piramide;
//
//import static org.junit.Assert.assertTrue;
//
//import java.sql.Date;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.sql.Timestamp;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import com.ifpe.ado.emprestimo.IRepositorioEmprestimo;
//import com.ifpe.ado.emprestimo.RepositorioEmprestimo;
//import com.ifpe.ado.item.RepositorioItem;
//import com.ifpe.ado.professor.RepositorioProfessor;
//import com.ifpe.emprestimo.ControladorEmprestimo;
//import com.ifpe.emprestimo.Emprestimo;
//import com.ifpe.excecoes.SiapeInvalidoException;
//import com.ifpe.excecoes.TelefoneInvalidoException;
//import com.ifpe.item.Item;
//import com.ifpe.professor.Professor;
//
//public class EmprestimoTest {
//	
//	RepositorioEmprestimo repEmprestimo;
//	RepositorioProfessor  repoProfesspor;
//	ControladorEmprestimo controlador;
//	Emprestimo emp;
//	Professor prof;
//	Timestamp ts;
//	RepositorioItem repoItem;
//	Item item;
//	
//	@Before
//	public void init() throws TelefoneInvalidoException, SiapeInvalidoException {
//		this.repoItem = new RepositorioItem();
//		this.repoProfesspor = new RepositorioProfessor();
//		this.prof = new Professor("João", "81999074393", "123as7");
//		this.item =  new Item("0635940", "Computador");
//		this.repoItem.inserir(this.item);
//		this.repEmprestimo = new RepositorioEmprestimo();
//		this.ts = new Timestamp(System.currentTimeMillis());
//		this.emp = new Emprestimo("123as7", this.item.getCodigoItem(), ts.toString());
//	}
//	
//	@Test
//	public void insertempTest() throws Exception {
//		repoProfesspor.inserir(prof);
//		int status = this.repEmprestimo.efetuarEmprestimo(emp);
//		
//		assertTrue(status!=0);
//	}
//
//	@Test
//	public void removeempTest() throws Exception {
//		int id = this.repEmprestimo.retornaUltimo();
//		int status = this.repEmprestimo.removerEmprestimo(id);
//		this.repoItem.remover(this.item.getCodigoItem());
//		this.repoProfesspor.remover("12345762");
//		assertTrue(status!=0);
//	}
//	
//}
