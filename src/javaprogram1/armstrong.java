package javaprogram1;

import java.util.Scanner;

public class armstrong {
	
	public static void main(String[] args) {
		int a,q;
		Scanner s = new Scanner(System.in);
		/*System.out.println("enter the number");
        a= s.nextInt();
        q=a;*/
		for (int i = 0; i <=1000 ; i++) {
		a=i;	
		q=a;
        String b = null;
        b= b+a;
        int fa =0;        
        for (int i1=0;i1<b.length();i1++) {
		int c = a%10;
		fa= (c*c*c)+fa;
		a = a/10;
        }
        if(fa==q) {
        System.out.println("armstrong number"+fa);	
        }
        }
		}
}
