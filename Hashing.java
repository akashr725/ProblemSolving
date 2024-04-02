import java.util.Arrays;

public class Hashing {
    public static void charHash() {
        String s = "abcdacbdgfcd";
        int hash[] = new int[256];
        Arrays.fill(hash, 0);
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }
        char arr[] = { 'a', 'b', 'c', 'd', 'f', 'g', 'h' };
        int n = arr.length;
        int i = 0;
        while (n != 0) {
            System.out.println(hash[arr[i]]);
            i++;
            n--;
        }
    }

    public static void numberHash() {
        int arr[] = { 1, 3, 5, 1, 3, 4, 5, 3 };
        int count[] = { 1, 3, 5, 4, 7, 9 }; // count every element of this array in arr[]
        int hash[] = new int[10];
        Arrays.fill(hash, 0);
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;
        }
        int n = count.length;
        int i = 0;
        while (n != 0) {
            System.out.println(hash[count[i]]);
            i++;
            n--;
        }

    }

    public static void main(String[] args) {

        Hashing.charHash();

    }
}
