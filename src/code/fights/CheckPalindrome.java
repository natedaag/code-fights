package code.fights;

public class CheckPalindrome {

	public static void main(String[] args) {
		checkPalindrome("5aa5aa5");
	}
	
	static boolean checkPalindrome(String inputString) {
		boolean isPalindrome = false;
		
		
		
		String str;
		str = new StringBuilder(inputString).reverse().toString();
		if(inputString.equals(str)){
			System.out.print("true");
			isPalindrome = true;
		} else {
		  System.out.print("false");
		isPalindrome = false;
		}
		
		return isPalindrome;
	}
}
