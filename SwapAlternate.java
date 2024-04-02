public class SwapAlternate {
    public static void main(String[] args) {
        int arr[] = { 4, 1, 8, 2, 11 }; // op-{1,4,2,8,11}
        int temp;
        for (int i = 0; i < arr.length; i = i + 2) {
            if (i + 1 < arr.length) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
