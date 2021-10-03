package javaprogram1;

import java.util.Scanner;

public class repeatingstring {

	public static void main(String[] args) {
		System.out.println("enter the number of elements to be compared");
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String[] b = a.split(" ");
		
		System.out.println(b[0]);
		/*for (int k = 0; k < b.length; k++) {
		int count=0;		
		for (int m = b.length-1; m >= 0; m--) {
		if(b[k] == b[m]) {
		count++;	
		}
		}
		
		
		System.out.println("the count of "+b[k]+"is"+ count);
		}*/
	}

}
