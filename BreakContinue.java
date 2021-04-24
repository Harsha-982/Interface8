package SelectIterTruncate;

public class BreakContinue {
	public static void main(String[] args) {
		l1:{
			System.out.println("start program");
			for(int iter=0;iter<5;iter++) {
				if(iter>1) {
					System.out.println(iter);
					break l1; 							//skips loop
				}
				}
			}
		System.out.println("out side label");
		l2:{
			for(int iter=0;iter<5;iter++) {
				if(iter>1) {
					System.out.println(iter);
					continue;						// skips an iteration
//					System.out.println("don't terminate"); this cant be reachable
				}
			}
		}
	}
	
}
