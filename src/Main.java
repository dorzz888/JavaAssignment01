import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {


    public static void main(String[] args) {
        // write your code here

        // Uncomment to pass command line arguments
        /*int[] x = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            x[i] = Integer.parseInt(args[i]);
        }
        Sort.SortingAsc(x);
        String arr = Sort.PrintArr(x);
        System.out.println("Sorted Array: " + arr);*/

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
