package code.fights;

public class DigitRootSort {

	public static void main(String[] args) {
		int[] input = {13, 4};
		digitRootSort(input);
	}
	
	static int[] digitRootSort(int[] a) {
	    int[] b = new int[a.length];
		int start; // takes the int from the array
		int workingRoot; // if it's 10-100, % 10
		int inPlace = 0;
		int digitSum = 0; // actual digit sum value
		int workingTen = 0; // starts to manipulate it. <10=ok. >10 mod  to get other digit
		for(int i = 0; i < a.length; i++){
			start = a[i];
			if (start < 10){
				inPlace = start;
				System.out.println(inPlace);
			}
			if(start >= 10 && start < 100){
				workingTen = start / 10;
				workingRoot = start % 10;
				digitSum = workingTen + workingRoot;
				System.out.println(digitSum);
			}
			
		}
				
		return b;
	}



	

}











