package basics;

public class ArrayConcepts {

	public static void main(String[] args) {
		String[] s= {"Dinesh","Vamsi","Kisshan","Santhosh"};
		int[] a = {1,2,3,4,5};
		System.out.println(s[0]); //Printing element in particular index
		System.out.println(a[1]);
		
		s[1] = "Venkata Vamsi";   //changing the element in a index
		System.out.println(s[1]);
		
		System.out.println(a.length);  // length 
		
		// printing elements in array
		System.out.println("Elements in String Array");
		for (int i=0; i<s.length ;i++) {
		System.out.println(s[i]);
		}
	}

}
