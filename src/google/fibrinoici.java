package google;

import java.io.InputStream;
import java.util.Scanner;

public class fibrinoici {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
    System.out.println("print the number of fibrrinoci series");
    int k=s.nextInt();
    int x=0;
    int	y=1;
    System.out.println("*");
    ///System.out.println(x);
       
    for (int i = 1; i <k ; i++) {
		if(i%3==0) {
			y=x-y;
		int z=x+y;
		//System.out.print(z);
		for (int j = 0; j <z ; j++) {
			System.out.print("*");
		}
		System.out.println("");
		y=z;
		continue;
		}
		
       	x=x+y;
	  // System.out.println(x); 	
	   	for (int j = 0; j <x ; j++) {
	   		System.out.print("*");
	  		}
	   	System.out.println("");
	   	   
	}
    int z=11;
    String q; 
    q= String.valueOf(z);
    System.out.println(q);
}
}
