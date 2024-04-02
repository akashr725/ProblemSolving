public class binarySearch {
    // binary search using recursion
    public static boolean SearchElement(int arr[], int start, int end, int k) {

        // base case
        if (start > end)
            return false;

        int mid = start + (end - start) / 2;
        // base case 2
        if (arr[mid] == k)
            return true;
        if (arr[mid] < k) {
            return SearchElement(arr, mid + 1, end, k);
        } else {
            return SearchElement(arr, start, mid - 1, k);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 9, 10 };
        int size = arr.length;
        int key = 11;

        boolean ans = SearchElement(arr, 0, size - 1, key);
        if (ans) {
            System.out.println("Found...");
        } else {
            System.out.println("Not Found...");
        }
    }
}
