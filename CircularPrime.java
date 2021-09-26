package basics;
import java.util.*;
import java.math.*;
public class CircularPrime {
	public void prime(int num) {
		int p=0;
		int r=num/2;
		for(int i=2;i<r;i++) {
			if(num%i==0) {
				 p=p+1;
				System.out.println(" Not Prime");
				break;
			}
			else {
				 p=p+0;
				continue;
			}
		}
		int sp,fp ;
		
		//System.out.println(count);
		
		int rnum;
		do {
			sp = num%10;
			fp = num/10;
		
			int count=0;
			while(num!=0) {
				num=num/10;
				count++;
			}
			
			
			rnum=sp*(int)Math.pow(10, count-1) + fp;
			System.out.println(rnum);
			if(p==0) {
			  System.out.println("Circular prime");
			
			}
			else if(p==1) {
				System.out.println("Not prime");
			}
			num=rnum;
		}while(num!=rnum);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Number: ");
		int num=in.nextInt();
		in.close();
		CircularPrime c= new CircularPrime();
		c.prime(num);
	}

}
