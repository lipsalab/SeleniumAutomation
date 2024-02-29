package test;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {

		
		String[] name= {"Java","Selenium","Python","Ruby","Python","Selenium"};
//		for(int i=0;i<name.length;i++) {
//			for(int j=0;j<i;j++) {
//				if(name[i].equals(name[j])) {
//					System.out.println(name[i]);
//				}
//			}
//		}
		
		Set<String>store=new HashSet<String>();
		for(String n: name) {
			if(store.add(n)==false) {
				System.out.println(n);
			}
		}
	}

}
