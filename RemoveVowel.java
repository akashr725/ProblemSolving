public class RemoveVowel {
    public static void main(String[] args) {

        String s = "Navinau";
        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();
        StringBuilder s3 = new StringBuilder();
        System.out.println(s1);
        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) == 'A' || s1.charAt(i) == 'E' || s1.charAt(i) == 'I' ||
                    s1.charAt(i) == 'O' || s1.charAt(i) == 'U' || s1.charAt(i) == 'a' || s1.charAt(i) == 'e' ||
                    s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {
                s1.deleteCharAt(i);
            } else {
                break;
            }

        }
        s1.reverse();
        System.out.println(s1.toString());

    }

}
