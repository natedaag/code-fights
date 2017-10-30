package code.fights;

public class AlmostIncreasingSequence {

  public static void main(String[] args) {
    int[] array = {3, 2, 1};
    almostIncreasingSequence(array);
  }
  
  static boolean almostIncreasingSequence(int[] sequence) {
	    boolean flag = true;
	    int seq1 = 0 ;
	    int seq2 = 0;
	    for(int i = 0; i < sequence.length - 1; i++){
	        if(sequence[i]>=sequence[i+1]){
	        	seq1++;
	    }
	    for(int k = 0; k < sequence.length - 2; k++){
	        if(sequence[k] >= sequence[k + 2]){
	        	seq2++;
	        }
	    }
	    if(seq1+seq2>2){
	    	flag=false;
	    }
	}
		return flag;
  }
//	    boolean sequential = true;
//	    for(int i = 0; i < sequence.length - 1; i++) {
//	        if(sequence[i] >= sequence[i + 1]) {
//	            if(sequential) {
//	                if(i != 0 && i != sequence.length-2) {
//	                    if(sequence[i + 1] <= sequence[i - 1]) {
//	                        if(sequence[i + 2] <= sequence[i]) {
//	                            return false;
//	                        }
//	                        i++;
//	                    }
//	                }
//	                sequential = false;
//	            } else {
//	                return false;
//	            }
//	        }
//	    }
//	    return true;
//	    }


}
