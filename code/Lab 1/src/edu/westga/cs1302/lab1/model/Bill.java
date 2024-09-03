package edu.westga.cs1302.lab1.model;

import java.util.ArrayList;

/** Stores information for a bill.
 * 
 * @author CS 1302
 * @version Fall 2024
 */
public class Bill {
	
	public static final double TAX_MULTIPLIER = 0.1;
	public static final double TIP_MULTIPLIER = 0.2;
	
	private ArrayList<BillItem> items;

	/** Create a new empty Bill
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	public Bill() {
		this.items = new ArrayList<BillItem>();
	}
	
	/**Returns items in the Bill
	 * @return the items
	 */
	public ArrayList<BillItem> getItems() {
		return this.items;
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

}
