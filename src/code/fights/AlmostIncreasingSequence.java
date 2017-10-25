package code.fights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlmostIncreasingSequence {

  public static void main(String[] args) {
    int[] sequence = {1, 3, 2, 1};
    almostIncreasingSequence(sequence);
  }
  static boolean almostIncreasingSequence(int[] sequence) {
    
    List list = new ArrayList<>(Arrays.asList(sequence));
    boolean sequential = false;
    for(int i = 0; i < sequence.length - 2; i++){
      if(sequence[i] > sequence[i + 1]){
      list.remove(sequence[i]);
      sequential = true;
      } else {
      sequential = false;
      }
    }
    System.out.print(sequential);
    return sequential;
  }


}
