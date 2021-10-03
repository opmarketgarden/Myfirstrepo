package javaprogram1;

import java.util.LinkedHashSet;
import java.util.Scanner;



public class Repeatingnumbers {
	
	public static void main(String[] args) {
	
	LinkedHashSet<String> a = new LinkedHashSet<>();	
	System.out.println("enter the number of elements to be compared");
	Scanner s = new Scanner(System.in);
	int number = s.nextInt();
	int n[] = new int[number];
	System.out.println("enter the numbers");
	for (int i = 0; i < n.length; i++) {
	n[i] = s.nextInt();	
	}
	for (int k = 0; k < n.length; k++) {
	int count=0;		
	for (int m = n.length-1; m >= 0; m--) {
	if(n[k]==n[m]) {
	count++;	
	}
	}
	a.add("The count of "+n[k]+"is"+count);
	}
	System.out.println(a.size());
	for (String i :a) {
	System.out.println(i);	
	}
}
}