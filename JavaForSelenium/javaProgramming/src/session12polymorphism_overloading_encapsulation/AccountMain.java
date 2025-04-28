package session12polymorphism_overloading_encapsulation;

public class AccountMain {
public static void main(String[] args) {
		Account acc = new Account();
		acc.setAccountNO(31414);
		acc.setName("shadan");
		acc.setBalance(2343526423.0);
		System.out.println(acc.getAccountNO());
		System.out.println(acc.getName());
		System.out.println(acc.getBalance());
	}
	
	
}
