package code.fights;

public class CheckPalindrome {

	public static void main(String[] args) {
		checkPalindrome("a");
	}
	
	static boolean checkPalindrome(String inputString) {
		String str;
		str = new StringBuilder(inputString).reverse().toString();
		if(inputString.equals(str)){
			System.out.print("true");
			return true;
		} else {
		  System.out.print("false");
		return false;
		}
	}
}
