package practiceprograms;

public class Star123space {
	public static void main(String[] args) {
		int count=0;
		 int space = 5;
		for(int i=1; i<=5; i++) {
			for(int a=1; a<=space;a++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				
				count = count+1;
				System.out.print(count+" ");
			}
			System.out.println();
			space--;
		}
	}
	}
	