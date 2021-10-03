
public class ascending_order {
public static void main(String[] args) {

int a[]= {1505,2,103,4005,5};	
int b[] = new int[a.length];
int max=0;
int max1 = 0;
for (int i = 0; i < a.length; i++) {
if(a[i]>max) {
max=a[i];
}
}
for (int i = 1; i < a.length; i++) {
if(a[i]!=max) {
b[i]=a[i];
}
}
System.out.println(b.length);
/*for(int k=0;k<b.length;k++) {
if(b[k]>max1) {
max1=b[k];	
}
}
System.out.println(max1);
}
*/
}
}