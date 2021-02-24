import java.util.*;
class Main {
  public static void main(String[] args) {
    // part 1 q1
    int[] array = new int[3];
    try {
      for (int i = 0; i < 4; ++i) {
        array[i]=i;
        System.out.println(array[i]);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Oops, we went too far, better go back to 0!");
    }finally{
      System.out.println("this program is over");
    }
//part 2 (q5)

  }
}