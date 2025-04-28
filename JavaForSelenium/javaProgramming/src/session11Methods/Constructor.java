package session11Methods;

public class Constructor {
	int x;
	int y;
	Constructor()  //default constructor
	{
		 x=100;
		 y=200;
	}
	Constructor(int a,int b) //Parameterized constructor
	{
		x=a;
		y=b;
	}
	void sum() {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
//		Constructor cd = new Constructor();
		Constructor cd = new Constructor(100,2000);
		cd.sum();
	}
}
