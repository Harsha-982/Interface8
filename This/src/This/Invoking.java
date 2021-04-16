package This;

public class Invoking {
	Invoking(){
		this("next");// 4 
		System.out.println("default constructor in inherited class");
	}
	Invoking(String name){
		 System.out.println("parametrized constructor in inherited class ");//5 this statement gets  exeuted first and then default remaining 
	 }
}
class Derived extends Invoking{
	Derived(){
		this("next");// 2==>invokes parametrized derived class 
		System.out.println("default constructor in derived class");
	}
	Derived(String name){
		super(); // 3==> invokes default method in invoking class
		System.out.println("parametrized constructor in derived class");
	}
}
class Test{
	public static void main(String[] args) {
		Derived d= new Derived(); // 1==> invokes derived with no parameters.
	}// with just one instance all constructors can be called invoked...
}
