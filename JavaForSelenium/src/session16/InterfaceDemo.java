package session16;

interface Shape{
	int length =10; // final & static
	int width = 20; // final & static
	
	void circle();//abstract method
	
	default void square() {
		System.out.println("this is square - default method");
	}
	
	static void rectangle() {
		System.out.println("this is rectangle - static method");
	}
}

	public class InterfaceDemo implements Shape{
		public void circle() {// we need to do it public because in interface abstract method are by default public so we cannot reduce the visibility of method means we have to make it public it is default method which is lower in visibility to implement something in it 
			System.out.println("this is circle - abstract method");
		}
			void triangle() {// we need to do it public because in interface abstract method are by default public so we cannot reduce the visibility of method means we have to make it public it is default method which is lower in visibility to implement something in it 
				System.out.println("this is triangle..");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//scenario 1
			InterfaceDemo idobj = new InterfaceDemo();
//			idobj.circle();// abstract
//			idobj.square();// default
//			Shape.rectangle();//static method can directly access from interface
			idobj.triangle();
			
			//scenario 2
			Shape sh = new InterfaceDemo();
			sh.circle();// abstract
			sh.square();// default
			Shape.rectangle();//static method can directly access from interface
			System.out.println(Shape.length*Shape.width);
//			sh.triangle(); // we cannot access
		}
			
//		}
	}
	
	
