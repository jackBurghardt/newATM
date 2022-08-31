
public class Tester {
	public static void main(String[] args) {

	ATM WF = new ATM();
	
	WF.openAccount (012);
	
	WF.openAccount (013, 100.0);
	//check to see if balances work and if initialization is correct
	System.out.println(WF.checkBalance(012)); //should be 0.0
	
	System.out.println(WF.checkBalance (013)); // should be 100.0
	
	//check if deposit works
	WF.depositMoney(012, 100);
	WF.depositMoney(002, 0);//shouldn't deposit money
	
	System.out.println(WF.checkBalance(012)); // should be 100
	
	WF.withdrawMoney (012, 10);
	System.out.println(WF.checkBalance(012));//
	
	WF.withdrawMoney(012, -100);//shouldn't withdraw
	
	WF.withdrawMoney(012, 99); //shouldn't withdraw
	System.out.println(WF.checkBalance(012));
	
	//check rounding 
	WF.withdrawMoney(012, 20.2);
	System.out.println(WF.checkBalance(012)); // Should be 69.8 
	}
}
