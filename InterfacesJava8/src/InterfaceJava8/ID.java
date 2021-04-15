package InterfaceJava8;

interface ID {
	void sum();
	void subtract();
	default void multiple() {
		System.out.println("method implementation is done in interfaces by java8");
	}
}

class A implements ID{

	@Override
	public void sum() {
		System.out.println("Sum method gets overrided");
		
	}

	@Override
	public void subtract() {
		// TODO Auto-generated method stub
		System.out.println("subtract method gets overrided");
	}
	public static void main(String[] args) {
		ID id= new A();
		id.sum();
		id.subtract();
	}
}
