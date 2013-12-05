import java.util.Scanner;

public class Register {
	
	int option = 0;
	float oneBill = 0;
	float sumTotal = 100;
	private Scanner getInt;
	
	//constructor  
	public Register(){	
		
	}
	
	// keeps track of amount in this till 
	private float dailyTotal(){
		return sumTotal = (sumTotal + oneBill);
	}
	
	// prints out to get next action
	public void getOption(){
		System.out.println("Enter desired option: ");
		System.out.println("[1] for new cart.");
		System.out.println("[2] for daily total.");
		System.out.print("[3] to exit: ");
		getInt = new Scanner(System.in);
		option = getInt.nextInt();
		doAction();
	}
	
	// executes the response from getOption() 
	private void doAction(){
		if (option == 1) {
			// creates an individual cart by invoking Items class
			float tallyItems = 0;
			float makeChange = 0;
			Items myItems = new Items();
			myItems.printReceipt(tallyItems, makeChange);
			oneBill = myItems.totalBill;
			dailyTotal();
			getOption();
		}
		else if (option == 2) {
			System.out.println("This register has taken in $" + (sumTotal-100) + " today.");
			System.out.println("");
			getOption();
		}
		else if (option == 3) {
			System.out.println("See you tomorrow.");
		}
	}
}