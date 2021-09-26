package basics;
import java.util.*;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.nextLine();
		in.close();
		
		int vowels =0; 
		int consonants = 0;
		int space = 0;
		for(int i=0; i < s.length();i++) {
			 char ch = s.charAt(i);
			 if (ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' || ch =='A' || ch =='E'|| ch =='O' || ch =='I' || ch =='U') {
				 vowels = vowels + 1;
			 }
			 else if (ch == ' ') {
				 space = space +1;
			 }
			 else {
				 consonants = consonants +1;
			 }
				
			}
		System.out.println("Vowels = " + vowels + " Consonants = " + consonants + " Spaces = " + space);
		}

	}


