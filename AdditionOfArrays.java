package basics;
import java.util.*;


public class AdditionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows for Array1 :");
		int r1 = in.nextInt();
		System.out.println("Enter the number of Columns for Array 1 :");
		int c1 = in.nextInt();
		int [][] a1 = new int[r1][c1];
		System.out.println("ENter the ELements one by one for Array1 : ");

		for (int i=0; i<a1.length; i++) {
			for (int j=0; j<a1[0].length ; j++) {
				a1[i][j] = in.nextInt();
			}
			
			
		}
		
		
		System.out.println("Enter the number of rows for Array2 :");
		int r2 = in.nextInt();
		System.out.println("Enter the number of Columns for Array 2 :");
		int c2 = in.nextInt();
		int [][] a2 = new int[r2][c2];
		System.out.println("ENter the ELements one by one for Array2 : ");
		for (int i=0; i<a1.length; i++) {
			for (int j=0; j<a1[0].length ; j++) {
				a2[i][j] = in.nextInt();
			}
			
			
		}
		in.close();

		for (int i=0; i<a1.length; i++) {
			for (int j=0; j<a1[0].length ; j++) {
				System.out.print(a1[i][j] + " ");
			}
			System.out.println("");
			
		}
		for (int i=0; i<a2.length; i++) {
			for (int j=0; j<a2[0].length ; j++) {
				System.out.print(a2[i][j] + " ");
			}
			System.out.println("");
			
		}
		int[][] sum = new int[r1][c1];
		for (int i1=0; i1<sum.length; i1++) {
			for (int j1=0; j1<sum[0].length ; j1++) {
				
						sum[i1][j1] = a1[i1][j1] + a2[i1][j1];
						System.out.print(sum[i1][j1] + " ");
					}
					System.out.println("");
					
			
			
		}
	
	}

}
