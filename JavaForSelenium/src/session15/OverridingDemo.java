package session15;

class Bank{
	double roi(){
		return 12;
	}
}
class ICICI extends Bank{
	
	double roi(){
		return 10.5;
	}
}
class HDFC extends Bank{
	double roi(){
		return 13.6;
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC r = new HDFC();
		System.out.println(r.roi());

	}

}
