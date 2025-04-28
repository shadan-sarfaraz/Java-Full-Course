package session11Methods;

public class Student {
	int sid;
	String sname;
	char sgrade;
	void printStudentData() {
		System.out.println(sid+ " "+ sname + " "+sgrade);
	}
	void studentData(int id, String name, char grade) {
		sid = id;
		sname = name;
		sgrade = grade;
	}
	Student(int id, String name, char grade){
		sid = id;
		sname = name;
		sgrade = grade;
	}
}
