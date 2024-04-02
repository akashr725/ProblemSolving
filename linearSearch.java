public class linearSearch {

    // linearsearch using recursion
    public static boolean SearchElement(int arr[], int size, int k) {
        if (size == 0)
            return false;
        if (arr[size - 1] == k) {
            return true;
        } else {
            return SearchElement(arr, size - 1, k);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 4, 3, 9, 10 };
        int size = arr.length;
        int key = 44;

        boolean ans = SearchElement(arr, size, key);
        if (ans) {
            System.out.println("Found...");
        } else {
            System.out.println("Not Found...");
        }
    }
}
