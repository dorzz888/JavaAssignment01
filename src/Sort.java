import java.awt.datatransfer.Transferable;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Sort {
    public static int countInput;
    public static int x;

    public static Scanner s = new Scanner(System.in);

    //Check if Array's lngth is more than 3
    public static boolean NumberOfElements(int x) {
        if (x > 3) {
            return true;
        }
        return false;
    }

    //Ask user  Array's length and it's Elements
    public static int[] GetNumbers() {
        int x = 1;
        while (!NumberOfElements(countInput)) {
            System.out.println("Enter Number of Elements: ");
            countInput = s.nextInt();
            if (countInput <= 3) {
                System.out.println("Array should have more than 3 elements!");
            }
            x++;
        }
        int arr[] = new int[countInput];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < countInput; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        return arr;
    }

    //Sort Array in Ascending Order
    public static void SortingAsc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
    }

    // Sort Array in Descending Order
    public static void SortingDesc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }

        }
    }

    // Print Array as [x, x, x, x]
    public static String PrintArr(int[] arr) {

        String x = Arrays.toString(arr);
        return x;
        /*System.out.print("\nSorted Array: ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1]);*/
    }

    //Check if countinput is equal to array's length
    public static boolean CheckArrayLength(int[] arr) {
        if (arr.length < countInput && arr.length > countInput) {
            return false;
        }
        return true;
    }
}
