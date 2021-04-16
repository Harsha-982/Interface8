package This;

public class DemoCall { 
	int a,b;
	int c;
	DemoCall(int a,int b){
		//this(a,b,c);
		this.a=a;
		this.b=b;
		
	}
	DemoCall(int a,int b, int c){
		//this.c=c; constructor call should always be first in constructor
		this(a,b); // calling the above constructor
		this.c=40;
	}
	void sum() {
		System.out.println(a+b+c);
	}
}
class  Calling{
	public static void main(String[] args) {
		DemoCall dc= new DemoCall(10,20);// invokes DemoCall with two parameters ...
		DemoCall dc1= new DemoCall(10,20,30);//invokes parameter with three classes...
		dc.sum();
		dc1.sum();
	}
}

	

