package session12polymorphism_overloading_encapsulation;

public class Box {
	double width,hight,depth;
	Box(){
		width=hight=depth=0;
	}
	Box(double w,double h,double d){
		width = w;
		hight = h;
		depth = d;
	}
	Box(double l){
		width=hight=depth=l;
	}
	double volume() {
		return width*hight*depth;
	}
}
