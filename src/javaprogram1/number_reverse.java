package javaprogram1;

import java.util.Scanner;

public class number_reverse {
public static void main(String[] args) {


System.out.println("enters the number");
Scanner s = new Scanner(System.in);
String a=s.nextLine();
String b1[] = a.split("");	
String c[] = new String[b1.length];
int j=b1.length-1;
for (int i = 0; i < b1.length; i++) {
c[i] = b1[j]	;
j--;
}	

for (String string : c) {
System.out.print(string);	
}
/*int b;
Scanner s = new Scanner(System.in);
System.out.println("enter the count of numbers to be comparred");
b=s.nextInt();
int a[] = new int[b];
System.out.println("enter the numbers to be reversed");
for (int i = 0; i < b; i++) {
a[i] =	s.nextInt();
}
*/
}
}
