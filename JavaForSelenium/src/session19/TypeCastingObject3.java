package session19;

public class TypeCastingObject3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//Ex1:
//		Object o = new String("Welcome");
//		StringBuffer sb = (StringBuffer) o; //Rule1 - Yes Rule2 - Yes Rule3 - Failed
//		
//		//Ex2:
//		String s = new String("Welcome");
//		StringBuffer sb = (StringBuffer) s; // Rule1 - Failed
//		
		//Ex3
//		Object o = new String("welcome");
//		StringBuffer sb = (StringBuffer) o; //Rule1 - Yes Rule2 - Yes Rule3 - Failed
		
		//Ex4:
//		Object o = new String("welcome");
//		StringBuffer sb = (String) o; //Rule1 - Yes Rule2 - Failed
		
		//Ex5:
//		String s = new String("welcome");
//		StringBuffer sb = (String) s; //Rule1 - Yes Rule2 - Failed
		
		
		//Ex6:
//		Object o = new String("welcome");
//		StringBuffer sb = (StringBuffer) o; //Rule1 - Yes Rule2 - Yes Rule3 - Failed
		
		//Ex7:
		Object o = new String("welcome");
		String s = (String) o; //Rule1 - Yes Rule2 - Yes Rule3 - Pass


	}

}
