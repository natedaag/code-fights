package code.fights;

public class CheckPalindrome {

	public static void main(String[] args) {
		checkPalindrome("aabac");
	}
	
	static boolean checkPalindrome(String inputString) {
		String str = null;
		str = new StringBuilder(inputString).reverse().toString();
		if(inputString.equals(str)){
			System.out.print(str);
			return true;
		} else {
		return false;
		}
	}
}
