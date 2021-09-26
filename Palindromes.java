package basics;
import java.util.*;

public class Palindromes {
	String r="";
	
   void palindrome(String s) {
	   for (int i=s.length() -1; i>=0; i--) {
		   r += s.charAt(i);
		   
	   }
	   System.out.println(r);
	   if(s.equals(r)) {
		   System.out.println("Palindrome");
	   }
	   else {
		   System.out.println("Not a Palindrome");
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();
		Palindromes p = new Palindromes();
		p.palindrome(s);
	}

}
