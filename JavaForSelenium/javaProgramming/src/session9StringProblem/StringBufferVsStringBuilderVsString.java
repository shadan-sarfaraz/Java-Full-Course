package session9StringProblem;

public class StringBufferVsStringBuilderVsString {

	public static void main(String[] args) {
		// String is mutable object change will no do any impact on string
		//we have to store changes in other variable to show the changes.
		/* String s = "Welcome";
		System.out.println(s);
		s.concat(" to java");
		System.out.println(s); */
		
		//StringBuffer = mutable Changes will be happen on main object.
		/*StringBuffer s = new StringBuffer("Welcom");
		System.out.println(s);
		s.append(" to java");
		System.out.println(s);*/
		
		//StringBuilder = mutable Changes will be happen on main object.
		StringBuilder s = new StringBuilder("Welcom");
		System.out.println(s);
		s.append(" to java");
		System.out.println(s);

	}

}
