
public class Tester {
	public static void main(String[] args) {

	ATM WF = new ATM();
	
	WF.openAccount (012);
	
	WF.openAccount (013, 100.0);
	//check to see if balances work and if intialization is correct
	System.out.println(WF.checkBalance(012)); //should be 0.0
	
	System.out.println(WF.checkBalance (013)); // should be 100.0
	
	}
}
