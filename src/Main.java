import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {


    public static void main(String[] args) {

        // write your code here
        try {
            int[] userArr = Sort.GetNumbers();
            System.out.println("Unsorted Array: " + Arrays.toString(userArr));
            Sort.SortingAsc(userArr);

            String x = Sort.PrintArr(userArr);
            System.out.println("Sorted Array: " + x);

            //System.out.println(Sort.CheckArrayLength(userArr));

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input!");
        }
    }
}
