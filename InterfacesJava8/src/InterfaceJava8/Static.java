package InterfaceJava8;

interface Static {
	public static void m1() {
		System.out.println("prints m1");
	}
}
interface Static1{
	public static void m2() {
		System.out.println("prints m2");
	}
}
interface StaticMain{
	public static void main(String[] args) {
		Static.m1();
		Static1.m2();
	}
}
