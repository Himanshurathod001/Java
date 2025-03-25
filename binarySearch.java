public class binarySearch {
    int binary(int arr[], int target) {
        int st = 0;
        int end = arr.length - 1; // Fixed: Removed incorrect parentheses

        while (st <= end) {
            int mid = (st + end) / 2;

            if (target > arr[mid]) {
                st = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid; // Target found at index `mid`
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        binarySearch obj = new binarySearch(); // Fixed: Created an object
        int result = obj.binary(arr, 7); // Fixed: Call `binary()` using object

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
