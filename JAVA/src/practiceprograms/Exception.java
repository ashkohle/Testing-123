package practiceprograms;

public class Exception {
public static void main(String[] args ) {
	int a = 20;
	int b = 0;
	int c=0;
	int[] d = {10,20,30,60,56};
	System.out.println("start");
	try {
	  c = a/b;
	  System.out.println(d[12]);
	}
	catch(ArithmeticException  e ) {
		System.out.println("alternativecode");
	b= 2;
	c=a/b;

	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("IndexOutOfBound");
	}
	
           System.out.println(c);
           System.out.println(d[4]);
}
           
}