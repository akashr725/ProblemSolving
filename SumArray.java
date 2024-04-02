public class SumArray {

    // Sum of array using recursion

    public static int tSome(int arr[], int i, int size) {
        if (size == 0)
            return 0;
        if (i == size - 1) {
            return arr[i];
        }

        int ans = arr[i] + tSome(arr, i + 1, size);

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 4, 3, 9, 10 };
        int size = arr.length;

        int ans = tSome(arr, 0, size);

        System.out.println("Total sum of array is : " + ans);
    }
}
