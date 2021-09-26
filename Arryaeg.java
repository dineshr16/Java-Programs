package basics;

import java.util.Arrays;
import java.util.Collections;

public class Arryaeg {
	void sort() {
		int [] a = {5,2,7,6};
		Arrays.sort(a);
		int sum=0;
		for(int i=0;i<a.length-1;i++) {
		sum=a[i]+a[i+1];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arryaeg ar = new Arryaeg();
		ar.sort();
	
		

	}

}
