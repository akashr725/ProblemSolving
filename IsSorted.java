public class IsSorted {

    // check array is sorted or not using recursion

    public static boolean IsSorted(int[] arr, int size) {

        if (size == 0 || size == 1)
            return true;
        if (arr[size - 1] > arr[size - 2]) {
            return false;
        } else {
            boolean ans = IsSorted(arr, size - 1);

            return ans;
        }

    }

    public static void main(String[] args) {

        int arr[] = { 2, 5, 40, 23, 45, 57 };
        int size = arr.length;

        boolean ans = IsSorted(arr, size);

        if (ans) {
            System.out.println("Array is Sorted...");
        } else {
            System.out.println("Array is not Sorted...");
        }

    }
}
