package edu.westga.cs1302.lab1.model;

import java.util.ArrayList;

/** Stores information for a bill.
 * 
 * @author CS 1302
 * @version Fall 2024
 */
public class Bill {
	private ArrayList<BillItem> items;
	
	public static final double TAX_MULTIPLIER = 0.1;
	public static final double TIP_MULTIPLIER = 0.2;
	public static final double SUBTOTAL = 0.0;
	
	
	/** Create a new empty Bill
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	public Bill() {
		this.items = new ArrayList<BillItem>();
	}
	
	/** Adds the item to the bill
	 * 
	 * @precondition item != null
	 * @postcondition item is added to the list of items in the bill
	 * 
	 * @param item the item to be added to the bill
	 */
	public void addItem(BillItem item) {
		if (item == null) {
			throw new IllegalArgumentException("item must not be null.");
		}
		this.items.add(item);
	}
	
	/** Return a String containing the list of bill items and total for the bill.
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return a String containing the list of bill items and total for the bill
	 */
	public String getText() {
		String text = "ITEMS" + System.lineSeparator();
		double subTotal = SUBTOTAL;
		for (BillItem item : this.items) {
			text += item.getName() + " - " + item.getAmount() + System.lineSeparator();
			subTotal += item.getAmount();
		}
		
		text += System.lineSeparator();
		text += "SUBTOTAL - $" + this.decimalForamtter(subTotal) + System.lineSeparator();
		double tax = subTotal * TAX_MULTIPLIER;
		double tip = subTotal * TIP_MULTIPLIER;
		text += "TAX - $" + this.decimalForamtter(tax) + System.lineSeparator();
		text += "TIP - $" + this.decimalForamtter(tip) + System.lineSeparator();
		text += "TOTAL - $" + this.decimalForamtter(subTotal + tip + tax);
		
		return text;
	}
	
	private String decimalForamtter(double amount) {
		return String.format("%.2f", amount);
	}

}
