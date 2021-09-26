package basics;
import java.util.*;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		in.close();
		int gcd;
		if(num1 >= num2) {
		 gcd = num1%num2;
		 System.out.println("GCD of " + num1 +"," + num2 + "," + "is :" + gcd );
		}
		else {
			gcd = num2%num1;
			System.out.println("GCD of " + num1 +"," + num2 + "," + "is :" + gcd );
		}
		
	}

}
