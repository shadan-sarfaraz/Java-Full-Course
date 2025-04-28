package session19;
	class Animal{}

	class Dog extends Animal{}
	class Cat extends Animal{}
public class TypeCastingObject2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Rule 1 : Conversion is valid or not (A b = C d)-->see notes
		//The type 'd' and 'c' must have some relationship (either parent to child or child to parent)
		
			//Animal an = new Dog();
			//Cat ct = (Cat) an;//valid as per rule 1
		
			//Dog dg = new Dog();
			//Cat ct = (Cat) dg;//Invalid as per rule 1
		
		//Rule2 : assignment is valid or not (A b = C d)
		//'C' must be either same or child of 'A'
		
			//Animal an = new Dog();
			//Cat ct = (Cat) an;//valid as per rule2
				
			//Animal an = new Dog();
			//Cat ct = (Dog) an;//Invalid as per rule2
		
		//Rule3 :  (A b = C d)
		//The underlying object type of 'd' must be either same or child of 'c'.
		
			//Animal an = new Dog();
			//Cat ct = (Cat) an; //Invalid as per rule3
			
			//Rule 1, Rule2, Rule3
			Animal an = new Dog();
			Dog dg = (Dog) an; // Rule1-Yes Rule2-Yes Rule3-Yes
			
		
	}

}
 