//Jelecia Milton

//COP2552.0M1

//The project provides the user with a GUI of an item mark-up calculator. 
//The user inputs the item number, description, price and mark-up percentage
//and is then provided with the new price (mark-up price) of the item.

package markup; 
import javax.swing.*;


/**
 This class creates a program that calculates the mark-up prices of store items. 
 */
public class Markup {

	
	/**
	 The program's starting point.
	 */
	public static void main(String[] args) {
		
		//Initialize the variables
		String itemNumber;			//holds the item number
		String itemDescription;		//holds the item description
		float currentPrice;			//holds the item's current price
		float percentageMarkup;		//holds the mark-up percentage
		float newPrice;				//holds the new price after mark-up
		
		
		itemNumber = JOptionPane.showInputDialog("Markup Calculator\n\nItem Number?");								//Input the item number
		itemDescription = JOptionPane.showInputDialog("Item " + itemNumber + " description?");						//Input the item description
		currentPrice = Float.parseFloat(JOptionPane.showInputDialog("Current price of item " + itemNumber + ":"));	//Input the price of the item
		percentageMarkup = Float.parseFloat(JOptionPane.showInputDialog("Enter the percent markup %:"));			//Input the mark-up percentage
		
		
		//Calculates the item's new price after mark-up
		newPrice = (currentPrice * (percentageMarkup/100)) + currentPrice;
		
		
		//Output the item number, description, current price and new price after mark-up
		JOptionPane.showMessageDialog(null, String.format("Item number: " + itemNumber + "\nItem description: " + itemDescription + "\nCurrent Price: $%.2f \n\nNew Price: $%.2f", currentPrice, newPrice));
				
				
	}

}
