package test;

public class ReverseNumUsingStringBuffer {

	public static void main(String[] args) {

		
		long num=123456789;
		System.out.println(new StringBuffer(String.valueOf(num)).reverse());
	}

}
