import java.io.PrintWriter;
import java.util.*;

class Main {
  public static void main(String[] args) throws Exception {
    // part 1 q1
    int[] array = new int[3];
    try {
      for (int i = 0; i < 4; ++i) {
        array[i] = i;
        System.out.println(array[i]);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Oops, we went too far, better go back to 0!");
    } finally {
      System.out.println("this program is over");
    }
    // part 2 (q5)
    int x = 0;
    double sum = 0;
    int numberOfNumbers=0;
    PrintWriter valueOutput=new PrintWriter("outFile.txt");
    Scanner valueInput = new Scanner(System.in);
     double[] valueHolder = new double[9];
     double numberEntry=0;
    try {
      for (int v = 0; v < 9; ++v) {
        System.out.println("Enter a number, q to quit.");
        String entrada = valueInput.next();
        if (entrada.equals("q")) {
          break;
        } else {
          x = 0;
        }
        numberEntry = Double.parseDouble(entrada);
        valueHolder[v]=numberEntry;
      }


    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("you've entered too many values.");
    } catch (NumberFormatException e) {
      System.out.println("you're supposed to only enter numbers. big brain 9000.");

    }
    finally{
      for(double element:valueHolder){
        sum = sum + element;
        numberOfNumbers++;
        valueOutput.println("value: "+element);
        valueOutput.println("at element: "+numberOfNumbers);
        valueOutput.println("running sum= "+sum);

      }
      valueOutput.close();
    }
  }
}
