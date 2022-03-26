package com.ifpe.ts.testes.piramide;

import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.sql.Timestamp;

import org.junit.Before;
import org.junit.Test;

import com.ifpe.ado.emprestimo.RepositorioEmprestimo;
import com.ifpe.ado.item.RepositorioItem;
import com.ifpe.emprestimo.ControladorEmprestimo;
import com.ifpe.emprestimo.Emprestimo;
import com.ifpe.excecoes.SiapeInvalidoException;
import com.ifpe.excecoes.TelefoneInvalidoException;
import com.ifpe.item.ControladorItem;
import com.ifpe.item.Item;

public class ControladorItemTest {
	ControladorItem contrItem;
	Item item;

	@Before
	public void init() throws TelefoneInvalidoException, SiapeInvalidoException {
		this.contrItem = new ControladorItem();
		this.item = new Item("123456", "Notebook");
	}

	@Test	
	public void insertitemTest() throws Exception {
		int status = this.contrItem.inserir(this.item);
		assertTrue(status!=0);
	}
	
	@Test
	public void removeritemTest() throws Exception {
		int status = this.contrItem.remover(this.item.getCodigoItem());
		assertTrue(status != 0);
	}


}
