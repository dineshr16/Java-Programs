package basics;

import java.util.Scanner;

public class Fib {

	int temp;
	void fib(int num1, int num2, int n){
		for(int i=0;i<n;i++) {
			temp = num1 + num2;
			num1 =num2;
			num2 =temp;
			System.out.println(temp);
		}
	}
}
class TestCasess {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int n= in.nextInt();
		int num1= in.nextInt();
		int num2 = in.nextInt();
		in.close();
		Fibo f = new Fibo();
		f.fib(num1, num2,n);
		
	}

}


