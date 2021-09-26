package basics;
import java.util.*;
public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int r = in.nextInt();
		System.out.println("Enter the number of columns : ");
		int c = in.nextInt();
		int [][] a = new int[r][c];
		System.out.println("Enter the elements one by one : ");
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[0].length;j++) {
				a[i][j] = in.nextInt();
			}
		}
		in.close();
		
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+ " ");
				
			}
		
		System.out.println("");
		}
		int sum=0;
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[0].length;j++) {
				sum = sum + a[i][j];
				
			}
		
		
		}
		System.out.println("Sum of Elements in Array is = "+sum);
	}

}
