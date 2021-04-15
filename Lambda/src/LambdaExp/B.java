package LambdaExp;

@FunctionalInterface
interface A{
	void harsha();
}
/*public class IL implements A{

	@Override
	public void harsha() {
		System.out.println("hello");
		
	}
	
}*/
@FunctionalInterface
interface C{
	void sum();
}
public class B{
	public static void main(String[] args) {
		A obj=()-> System.out.println("hello");// above block is replace by this line
		obj.harsha();
		C obj1=()-> System.out.println("harsha");// one more block must be written if no "LB"
		obj1.sum();
	}
}
