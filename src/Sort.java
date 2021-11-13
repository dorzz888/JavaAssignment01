import java.awt.datatransfer.Transferable;
import java.util.Scanner;

public class Sort {
    public static int countInput;
    public static int x;

    public static Scanner s = new Scanner(System.in);

    public static int[] GetNumbers() {

        System.out.println("Number of Elements: ");
        countInput = s.nextInt();

        int arr[] = new int[countInput];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < countInput; i++) {
            arr[i] = s.nextInt();
        }

        s.close();
        System.out.println("Unsorted Array: ");
        for (int i : arr) {
            System.out.print(i + ",");
        }
        return arr;

    }

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

    public static void PrintArr(int[] arr) {

        System.out.print("\nSorted Array: ");
        for (int i = 0; i < countInput - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[countInput - 1]);
    }

    public static boolean CheckArrayLength(int[] arr) {
        if (arr.length < countInput && arr.length > countInput) {
            return false;
        }
        return true;
    }
}
