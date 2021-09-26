package basics;
import java.util.*;

public class LargestPrime {
	int large;
	public void large(int n) {
		
		int i=1;
		for(int j=2;j<=n;j++) {
			if(j==n) {
				i=n;
				break;
			}
			if(n%j==0) {
				n--;
			}
		}
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		LargestPrime l=new LargestPrime();
		l.large(n);
	}

}
