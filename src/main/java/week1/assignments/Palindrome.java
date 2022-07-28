package week1.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value = "madam";
		String revValue = "";
		
	    
	    int valueLength = value.length();

	    for (int i = (valueLength - 1); i >=0; --i) {
	      revValue = revValue + value.charAt(i);
	    }

	    if (value.toLowerCase().equals(revValue.toLowerCase())) {
	      System.out.println(value + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(value + " is not a Palindrome String.");
	    }

	}
}
