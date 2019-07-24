package table;

public class printStarts {
	public void printPattern1(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
		System.out.println(" ");
		}
	}
	public void printPattern2(int num) {
		for(int i=1;i<=num;i++) {
			//loop for the space it goes like 
			for(int j=1;j<=num-i;j++) {
				System.out.print(" ");
			}
			//loop for the *
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
