package com.ifpe.ts.testes.piramide;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.ifpe.ado.item.RepositorioItem;
import com.ifpe.excecoes.SiapeInvalidoException;
import com.ifpe.excecoes.TelefoneInvalidoException;
import com.ifpe.item.Item;

public class ItemTest {
	
	RepositorioItem repItem;
	Item item;

	@Before
	public void init() throws TelefoneInvalidoException, SiapeInvalidoException {
		this.repItem = new RepositorioItem();
		this.item = new Item("123456", "Notebook");
	}

	@Test	
	public void insertitemTest() throws Exception {
		int status = this.repItem.inserir(this.item);
		assertTrue(status!=0);
	}
	
	@Test
	public void removeritemTest() throws Exception {
		int status = this.repItem.remover(this.item.getCodigoItem());
		assertTrue(status != 0);
	}
	
	

}
