package edu.westga.cs1302.lab1.test.BillItem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import edu.westga.cs1302.lab1.model.BillItem;

public class TestConstructor {

	
	@Test
	public void testWhenNameIsNull() {
	
	assertThrows (IllegalArgumentException.class, () -> {
		new BillItem(null, 2.00);
		});
	}
	
	@Test
	public void testWhenAmountIsNull() {
	
	assertThrows (IllegalArgumentException.class, () -> {
		new BillItem("apple", -1.00);
		});
	}
	
	@Test
	public void testCreatingAnItem() {
		BillItem item = new BillItem("apple", 2.00);
		
		assertEquals("apple", item.getName());
		assertEquals(2.00, item.getAmount(), 0.01);
	}
	
}


