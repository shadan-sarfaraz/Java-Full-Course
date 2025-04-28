package session12polymorphism_overloading_encapsulation;

public class AdderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder add = new Adder();
		add.sum();//1
		add.sum(10,23);//2
		add.sum(10.4,443);//4
		add.sum(34.34,34423);//3
		add.sum(123,23,45);//5
	}

}
