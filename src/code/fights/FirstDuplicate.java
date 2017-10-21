package code.fights;

public class FirstDuplicate {
  static int[] a = {2, 3, 3, 1, 5, 2};
  public static void main(String[] args) {
    firstDuplicate(a);
  }
  
  static int firstDuplicate(int[] a) {
    java.util.Set<Integer> set = new java.util.HashSet<>();
    for (int value : a){
        if(set.contains(value)){
          System.out.print(value);
            return value;
        } else {
            set.add(value);
        }
    }
    return -1;
  }
}
