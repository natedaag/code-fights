package code.fights;

public class AdjacentElementsProduct {

	public static void main(String[] args) {		
		int[] inputArray = {3, 6, -2, -5, 7, 3};
		adjacentElementsProduct(inputArray);
	}

	static int adjacentElementsProduct(int[] inputArray) {
		int tempProd;
		int product = Integer.MIN_VALUE;
		for (int i = 1; i < inputArray.length; i++){
		  tempProd = inputArray[i] * inputArray[i - 1];
				if(tempProd > product){
					product = tempProd;
				}
			}
		System.out.print(product);
		return product;
	}


}
