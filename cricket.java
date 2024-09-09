import java.util.Scanner;

public class cricket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print the array elements
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Find the smallest and greatest elements
        int smallest = arr[0];
        int greatest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > greatest) {
                greatest = arr[i];
            }
        }

        // Print the smallest and greatest elements
        System.out.println("Smallest element: " + smallest);
        System.out.println("Greatest element: " + greatest);

        scanner.close();
    }
}
