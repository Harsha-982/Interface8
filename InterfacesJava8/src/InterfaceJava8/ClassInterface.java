package InterfaceJava8;

interface I{
	static void m1() {
		System.out.println("overriding m1");
	}
	default void m2() {
		System.out.println("overriding m2");
	}
}

public class ClassInterface implements I{
	public static void main(String[] args) {
		I.m1(); //only way to static call
//	below 3 are invalid expressions because static methods of ineterface are not avialable in class 
		//m1.();
		//ClassInterface.m1();
		ClassInterface m= new ClassInterface();
		//m.m1();
// where are default methods can be implememted in class
		m.m2();
	}
}
