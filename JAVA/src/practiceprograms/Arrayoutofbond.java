package practiceprograms;

public class Arrayoutofbond {
	public static void main(String[] args ) {
		int a = 20;
		int b = 2;
		
		int[] d = {10,20,30,60,56};
		System.out.println("start");
		try {
		  int c = a/b;
		  System.out.println(d[11]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("alternativecode");
			System.out.println(d[4]);
			System.out.println("catch is excuted");
		}
		finally {
			System.out.println("excution of finally block");
		}
		System.out.println(d[2]);
	           System.out.println("end");
	          
	} 
}
