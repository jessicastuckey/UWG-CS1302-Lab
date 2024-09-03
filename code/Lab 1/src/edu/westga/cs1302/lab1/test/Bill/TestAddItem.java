package edu.westga.cs1302.lab1.test.Bill;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;

public class TestAddItem {
		
		@Test
		public void testAddOneItem() {
		Bill bill = new Bill();
		BillItem item = new BillItem("apple", 2.00);
		
		bill.addItem(item);
		ArrayList<BillItem> result = bill.getItems();
		
		assertTrue(result.contains(item));
		}
		
		@Test
		public void testItemIsNull() {
		Bill bill = new Bill();
		assertThrows (IllegalArgumentException.class, () -> {
			bill.addItem(null);
			});
		}
		
		@Test
		public void testAddMultipleItems() {
		Bill bill = new Bill();
		BillItem item = new BillItem("apple", 2.00);
		BillItem item2 = new BillItem("pear", 2.50);
		BillItem item3 = new BillItem("banana", 1.00);
			
		bill.addItem(item);
		bill.addItem(item2);
		bill.addItem(item3);
		ArrayList<BillItem> result = bill.getItems();
			
		assertTrue(result.contains(item));
		assertTrue(result.contains(item2));
		assertTrue(result.contains(item3));
		}
		
}

