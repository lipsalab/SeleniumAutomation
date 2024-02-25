package test;

public class MissingNumInArray {

	public static void main(String[] args) {

		
		int [] A= {1,2,3,4,5,6,8,9,10};
		int Sum=0;
		for(int i=0;i<A.length;i++) {
			Sum=Sum+A[i];	
		}
		System.out.println(Sum); 
		int Sum1=0;
		for(int j=0;j<=10;j++) {
			Sum1=Sum1+j;
			
		}
		System.out.println(Sum1);
		System.out.println("Missing Num is :::"+(Sum1-Sum));
	}
	

}
