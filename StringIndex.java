package basics;

public class StringIndex {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String s = "javaworld";
		//System.out.println("Length:"+s.length());  //length\
		//System.out.println("Uppercase:"+s.toUpperCase());
		//System.out.println("Lowercase:"+s.toLowerCase());
		//System.out.println("Finding a word:" + s.indexOf("a"));
		/*String c = "hello";
		int sum = s.length() + c.length();
		System.out.println(sum);
		String firstLetter = s.substring(0, 1);
	    String remainingLetters = s.substring(1, s.length());

	    // change the first letter to uppercase
	    firstLetter = firstLetter.toUpperCase();

	    // join the two substrings
	   // s = firstLetter + remainingLetters;
	    //System.out.println(s);
	    
	    System.out.println(s.charAt(1));*/
		int start = 3;
        int end = 7;
        String s1 = s.substring(start,end);
        System.out.println(s1);
		
	
	}

}
