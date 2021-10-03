package javaprogram1;

import java.util.ArrayList;
import java.util.List;



public class palindrome_numbers {
public static void main(String[] args) {

	int count = 0;		
for (int i =10; i <=200; i++) {
String a="";
String b="";
String c="";
String d=""+i;
for (int j = 0; j <d.length(); j++) {

a= a+(i%10);
b= b+(i/10);
c= a+b;
}
if(c.equalsIgnoreCase(d)) {

System.out.println(c);
count = count  +1;

}
}
System.out.println(count);

}	
}


