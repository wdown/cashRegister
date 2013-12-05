import java.util.Scanner;

public class Items {
	public float totalBill = 0;
	float price[] = new float[99];
	int quantity[] = new int[99];
	private Scanner getFloat;
	private Scanner getInt;
	private Scanner getFloat2;

	// gets the price and quantity of each item in the cart
	public Items() {
		for (int j=0;j<99;j++) {
			System.out.print("Enter the cost of the item or '0' for the total: ");
			getFloat = new Scanner(System.in);
			price[(int) j] = getFloat.nextFloat();
			if ( price[(int) j] != 0) {
				System.out.print("Enter the quantity of the item: ");
				getInt = new Scanner(System.in);
				quantity[j] = getInt.nextInt();
			}
			else {
				break;
				}
			}
	}
	
	// keeps a running tally of the total cost for this cart
	public float tallyItems () {
			for (int i=0;i<99;i++){
				if (price[i] != 0) {
					totalBill = (price[i]*quantity[i]) + totalBill;
				}
			}
		return totalBill;
	}
	
	// calculates change due
	private float makeChange() {
		float amountPaid = 0;
		float change = 0;
		System.out.println("The total bill is: $" + tallyItems() );
		System.out.print("Amount paid: ");
		getFloat2 = new Scanner(System.in);
		amountPaid = getFloat2.nextFloat();	
		if ( amountPaid > totalBill){
			change = amountPaid - totalBill; 
		}
		return change;
	}
	
	// prints receipt, calls makeChange() to calculate change. 
	public void printReceipt (float tallyItems, float makeChange) {
		for (int i=0;i<99;i++) {
			if (price[i] != 0) {
				System.out.println("Item " + (i+1) + ": " + quantity[i] + " at $" + (price[i]) + ".");
			}
		}
		System.out.println("Your change is: $" + makeChange());
	}
}
