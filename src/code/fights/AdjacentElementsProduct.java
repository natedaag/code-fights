package code.fights;

public class AdjacentElementsProduct {

	public static void main(String[] args) {		
		int[] inputArray = {3, 6, -2, -5, 7, 3};
		adjacentElementsProduct(inputArray);
	}

	static int adjacentElementsProduct(int[] inputArray) {
		int tempProd;// to hold the test product until we find which one is largest
		int product = 0;// to hold the largest product
		for (int i = 1; i < inputArray.length; i++){
			// need a way to stop k at array.length - 1
			int j = inputArray[i];
			int k = inputArray[j - 1];
			if (j < inputArray.length - 2){
				tempProd = j * k;
				if(tempProd > product){
					tempProd = product;
				}
			}
		}
		System.out.print(product);
		return product;
	}


}
