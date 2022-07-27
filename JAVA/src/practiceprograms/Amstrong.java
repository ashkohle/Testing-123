package practiceprograms;

public class Amstrong {
	public static void main(String[] args) {
		int no = 135;
		int sum=0;
		int rem;
		int a = no;		
		
		
		while(no!=0) {
			rem = no%10;
			sum = sum+(rem*rem*rem);
			no=no/10;}
		if(a==sum) {
			System.out.println("a is  amstrong no");}
			else {
				System.out.println("a isnotstrongno");
			
		}
	System.out.println("gitup is ready");
}}
