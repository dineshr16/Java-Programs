package basics;
import java.util.*;
public class ArrayGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		in.close();
		int n1=a.length;
		for(int i=0;i<n1;i++) {
			int index=a[i]%n;
			a[index]+=n1;
		}
		int count=0;
		for(int i=0;i<n;i++) {
			if((a[i]/n1) >= 2) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}

}
