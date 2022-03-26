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
//public class ControladorEmprestimoTest {
//	
//	RepositorioEmprestimo repEmprestimo;
//	ControladorEmprestimo controlador;
//	Emprestimo emp;
//	Timestamp ts;
//	RepositorioItem repoItem;
//	Item item;
//	
//	@Before
//	public void init() throws TelefoneInvalidoException, SiapeInvalidoException {
//		this.controlador = new ControladorEmprestimo();
//		this.repoItem = new RepositorioItem();
//		this.item =  new Item("0635946", "Computador");
//		this.repEmprestimo = new RepositorioEmprestimo();
//		this.ts = new Timestamp(System.currentTimeMillis());
//		this.emp = new Emprestimo("123ds23", this.item.getCodigoItem(), ts.toString());
//		
//	}
//	
//	@Test
//	public void inserirEmpContTest() {
//		
//		this.repoItem.inserir(item);
//		int status = this.controlador.inserir(emp);
//		assertTrue(status!=0);
//	}
//	
//	@Test
//	public void removerEmpContTest() throws SQLException {
//		int id = this.repEmprestimo.retornaUltimo();
//		int status = this.controlador.remover(id);
//		this.repoItem.remover(this.item.getCodigoItem());
//		assertTrue(status!=0);
//	}
//
//}
