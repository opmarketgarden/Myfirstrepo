
public class test1 {
public static void main(String[] args) {
	String str = "abc ddv kkr msc";
    String[] s2 = str.split("\s",4);
    String a = null;
    for (int i = 0; i < s2.length; i++) {
	a = s2[i]+"||";
	System.out.print(a);
	if(i==3) 
	break;	
	
	}
	
	
	
}
}