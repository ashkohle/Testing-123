package practiceprograms;

public class Exception2 {
	public static void main(String[] args ) {
		int a = 20;
		int b = 2;
		int c=0;
		int[] d = {10,20,30,60,56};
		System.out.println("start");
		try {
		  c = a/b;
		  System.out.println(d[2]);
		}
		catch(ArithmeticException  e ) {
			
			System.out.println("alternativecode");
			System.out.println("catch is excuted");
		}
		finally {
			System.out.println("excution of finslly block");
		}
	
	           System.out.println("end");
	          
	} 
}