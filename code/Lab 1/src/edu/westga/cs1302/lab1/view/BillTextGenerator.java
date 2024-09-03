package edu.westga.cs1302.lab1.view;

import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;

/** Generates text for the Bill class.
 * 
 * @author JS
 * @version Fall 2024
 */
public class BillTextGenerator {

	/** Return a String containing the list of bill items and total for the bill.
	 * 
	 * @precondition none
	 * @postcondition none
	 * @param bill the bill to generate text for
	 * 
	 * @return a String containing the list of bill items and total for the bill
	 */
	public String generateBillText(Bill bill) {
		String text = "ITEMS" + System.lineSeparator();
		double subTotal = 0.0;
		for (BillItem item : bill.getItems()) {
			text += item.getName() + " - " + this.decimalForamtter(item.getAmount()) + System.lineSeparator();
			subTotal += item.getAmount();
		}
		
		text += System.lineSeparator();
		text += "SUBTOTAL - $" + this.decimalForamtter(subTotal) + System.lineSeparator();
		double tax = subTotal * Bill.TAX_MULTIPLIER;
		double tip = subTotal * Bill.TAX_MULTIPLIER;
		text += "TAX - $" + this.decimalForamtter(tax) + System.lineSeparator();
		text += "TIP - $" + this.decimalForamtter(tip) + System.lineSeparator();
		text += "TOTAL - $" + this.decimalForamtter(subTotal + tip + tax);
		
		return text;
	}
	
	private String decimalForamtter(double amount) {
		return String.format("%.2f", amount);
	}
	
}
