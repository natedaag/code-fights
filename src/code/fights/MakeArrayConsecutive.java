package code.fights;

import java.util.Arrays;

public class MakeArrayConsecutive {

  public static void main(String[] args) {
    int[] statues = {6, 2, 3, 8};
    makeArrayConsecutive2(statues);
  }
  
  static int makeArrayConsecutive2(int[] statues) {
    int total;
    int missing;
    Arrays.sort(statues);
    total = statues[statues.length - 1] - statues[0]; 
    missing = total - statues.length + 1;
    System.out.print(missing);
    return missing;
  }
}
