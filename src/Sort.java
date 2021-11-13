import java.util.Scanner;

public class Sort {
    private static int countInput;
    private static int x;

    public static Scanner s = new Scanner(System.in);

    public static int[] GetNumbers(int n) {

        System.out.println("Number of Elements: ");
        countInput = s.nextInt();

        int arr[] = new int[countInput];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < countInput; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        return arr;

    }

    public static void Sorting(int[] arr) {
        for (int i = 0; i < countInput; i++) {
            for (int j = i + 1; j < countInput; j++) {
                if (arr[i] > arr[j]) {
                    x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }

        }
    }
}
