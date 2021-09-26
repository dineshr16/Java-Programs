package basics;
import java.util.*;

public class Xor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int size=in.nextInt();
		int[] a= new int[size];
		int[] b= new int[size];
		for(int i=0;i<size;i++) {
			a[i]=in.nextInt();
		}
		for(int i=0;i<size;i++) {
			b[i]=in.nextInt();
		}
		in.close();
		int a1=a.length;
		int b1=b.length;
		int c1=a1+b1;
		int[] c= new int[c1];
		for(int i=0;i<a1;i=i+1) {
			c[i]=a[i];
		}
		for(int i=0;i<b1;i=i+1) {
			c[a1+i]=b[i];
		}
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				int temp = 0;
				if(c[i]>c[j]) {
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		int cl=c.length;
		System.out.println(c[0]^c[cl-1]);
		

	}

}
