import java.util.HashMap;

public class ATM {
	private HashMap<Integer, Double> mappy;
	private double deposit;
	private int idNumber;
	public ATM() {
		mappy = new HashMap <>();
	}
	
	public void openAccount (int i){
		mappy.put( i, 0.0);
	}
	public void openAccount (int i, double d){
		mappy.put( i, d);
	}
	
	
 public void closeAccount(int i) {
	for (int ac: mappy.keySet()) {
		if (ac == i) {
			if(mappy.get(i)== 0) {
				mappy.remove (ac);
			}
		}
	}
 }

 public double checkBalance(int i) {
	
	 
	 for (int ac: mappy.keySet()) {
			if (ac == i) {
				
double d= mappy.get(ac);
return  Math.round (d*100)/100.0;
			}
		}
	 return 0.0;
 }
 
 public boolean depositMoney (int i, double d) {
	 for (int ac: mappy.keySet()) {
		 if (ac == i ) {
			mappy.put(i, mappy.get(i) + d);
			 return true;
			 }
			}
	 
	 return false;
 }
 public boolean withdrawMoney (int i, double d) {
	if ( d <= 0) {
	return	false;
	}
	 
	 for (int ac: mappy.keySet()) {
	 if (ac== i) {
			double depo = mappy.get(i);
			if (d <= depo) {
				depo = depo -d;
				mappy.put(i, depo);
				return true;
			}
			else {
				return false;
			}
	 } 
		 }
	 return false;
			}
 
 
}


