package test;

public class StringManupulation {

	public static void main(String[] args) {

		
		String str="the rate of Love of Life";
		String str2="the Rate of Love of Life";
		
		
		System.out.println(str.indexOf("Love"));
		System.out.println(str.indexOf('L',str.indexOf('L')+1));
		System.out.println(str.charAt(17));
		System.out.println(str.indexOf("Love"));
		
		String[]str1=str.split(" ");
		
		for(int i=0;i<str1.length;i++) {
			System.out.println(str1[i]);
		}
		String Name="  Lipsa Das   ";
		System.out.println(Name.trim());
		String Things="Things";
		System.out.println(Things.concat("s"));
		
		System.out.println("***************************");
		String X="Lipsa";
		String Y="Das";
		int a=10;
		int b=20;
		System.out.println(X+Y);
		System.out.println(a+b);
		System.out.println(X+Y+a+b);
		System.out.println(X+Y+(a+b));
		System.out.println(a+b+X+Y);
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
	}

}
