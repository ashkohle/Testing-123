package practiceprograms;

public class Secondlargestelement {   //thirdlargestvalue
public static void main(String[] args) {
	int []a= {23,28,78,98};

	int temp;
	for(int i =0;i<a.length; i++) {
		for(int j=i+1; j<a.length; j++) {
			 if(a[i]<a[j]) {
				 temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
			 }
		}	
		}
	
	System.out.println("print second largest no" +a[1]);     //change in index only
}

}