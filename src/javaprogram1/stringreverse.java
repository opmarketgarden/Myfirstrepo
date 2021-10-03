package javaprogram1;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class stringreverse {
public static void main(String[] args) {
	
	String a = "hi how are you";
	
	String b[]=a.split("",a.length());
	String c[]=a.split("");
	String d[]=new String[c.length];
	
	for (String string : b) {
		System.out.print(string);
	}
	System.out.println("");
	for (String string : c) {
	System.out.println(string);	
	}
	int j=c.length-1;	
	for (int i = 0; i < c.length; i++) {
	d[i]=c[j];	
	j--;
	}
    System.out.println("");
	for (String string : d) {
	System.out.print(string);	
	}
}
}