package basics;
import java.util.*;

public class SquareRoot {
	
	void squareroot(int num)
	{   double i;
		double sr = num/2;
		do {
			i=sr;
			sr=(i+(num/i))/2;
			
		}while((i-sr)!=0 );
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num= in.nextInt();
		in.close();
		SquareRoot r = new SquareRoot();
		r.squareroot(num);
	}

}
