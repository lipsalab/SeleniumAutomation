package test;

public class RemoveSpecialChar {

	public static void main(String[] args) {

		
		String s="#$%^Lipsa*(*&^%14)(*&^%$02!@#$%^1997(*&^%$#";
		String S1=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(S1);
	}

}
