import java.util.HashMap;

public class Account {
	private double deposit;
	private int idNumber;

	public Account (int i){
		 idNumber= i;
         deposit = 0.0;
	}
	public Account (int j, double d ) {
		idNumber=j;
		deposit = d;

		
	
	}

public double getDeposit() {
	return deposit;
}
public void setDeposit(double d) {
	deposit = deposit + d;
}
public int getIdNumber() {
	return idNumber;
}

}
