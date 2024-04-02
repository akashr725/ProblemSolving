public class reverseString {

    public static void swap(char s[], int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

    public static void ReverseString(char s[], int i) {

        if (i == s.length / 2)
            return;

        swap(s, i, s.length - i - 1);
        ReverseString(s, i + 1);

    }

    public static void main(String[] args) {

        char str[] = "abcdefg".toCharArray();

        ReverseString(str, 0);

        System.out.println(String.valueOf(str));

    }
}
