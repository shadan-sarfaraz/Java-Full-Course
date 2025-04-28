package session11Methods;

public class StudentMain {
	public static void main(String[] args) {
//		Student st = new Student();
		//using object reference variable
//		st.sid = 1;
//		st.sname = "shadan";
//		st.sgrade = 'A';
//		st.printStudentData();
		
		//using method
//		st.studentData(1, "shadan", 'A');
//		st.printStudentData();
		
		//using constructor
		Student st = new Student(1, "shadan", 'A');
		st.printStudentData();
	}
}
