package session17;

public class DataConversionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Welcome";// cannot convert to int.
		
		//String to int
		
		/*String s1 = "10";
		String s2 = "20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));*/
		
		//String to double.
		/*String s1 = "10.34";
		String s2 = "20.35";
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));*/
		
		///String to boolean.
		
//		String s1 = "2345";// other than true it will give false.
//		System.out.println(Boolean.parseBoolean(s1));
		
//		int double,bool,char---->> String
		int a = 10;
		double d = 23.23;
		boolean b = false;
		char c = 'd';
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(d));
		
	}

}
