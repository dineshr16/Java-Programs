package basics;
import java.util.*;


public class Factorial {
	int result=1;
	void facto(int n) {
		while(n!=0) {
		   
		   result = n*result;
		   n = n-1;
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		in.close();
		Factorial f= new Factorial();
		f.facto(n);
	}

}
