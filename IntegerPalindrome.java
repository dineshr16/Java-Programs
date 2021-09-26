package basics;
import java.util.*;


public class IntegerPalindrome {
	 int digit, reverse =0;
		void Palindrome(int n) {
			int temp=n;
			while(n>0) {
			digit = n%10;
			reverse = reverse *10 + digit;
			n=n/10;
			}
			System.out.println(reverse);
			if(reverse == temp) {
				System.out.println("Palindrome");
			}
			else {
				System.out.println("Not a Palindrome");
			}
			
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		IntegerPalindrome p = new IntegerPalindrome();
		p.Palindrome(n);

	}

}
