package com.ifpe.ts.testes.unitario.piramide;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.ifpe.item.Item;

public class ItemTest {
	Item item;
	
	@Before
	public void init() {
		this.item = new Item("001023", "Data-show");
	}
	
	@Test
	public void setCodigoTest() {
		this.item.setCodigoItem("001123");
		assertTrue(this.item.getCodigoItem().equals("001123"));
	}
	
	@Test
	public void setTipoItemTest() {
		this.item.setTipoItem("Computador");
		assertTrue(this.item.getTipoItem().equals("Computador"));
	}

}
