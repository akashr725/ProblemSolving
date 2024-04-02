import java.util.Scanner;

class Pattern {
    /*
     * 1
     * 2 3
     * 3 4 5
     * 4 5 6 7
     * 
     */

    public void paTTern1() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            // int value =row; // print pattern with extra variable
            for (int col = 1; col <= row; col++) {
                // System.out.print(value + " ");
                // value++;
                System.out.print(row + col - 1 + " "); // print pattern without extra variable
            }
            System.out.println();
        }

    }

    /*
     * 1
     * 2 1
     * 3 2 1
     * 4 3 2 1
     * 
     */

    public void paTTern2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i - j + 1 + " ");
            }
            System.out.println();
        }

    }

    /*
     * A A A
     * B B B
     * C C C
     * D D D
     */
    public void paTTern3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }

    }

    /*
     * A B C
     * D E F
     * G H I
     */

    public void paTTern4() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i <= n; i = i + 1) {
            for (int j = 1; j <= n; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }

    }

    /*
     * A B C
     * B C D
     * C D E
     */

    public void paTTern5() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch;
        for (int i = 1; i <= n; i = i + 1) {
            for (int j = 1; j <= n; j++) {
                ch = (char) ('A' + i + j - 2);
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    }

    /*
     * A
     * B B
     * C C C
     */
    public void paTTern6() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i <= n; i = i + 1) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }

    }

    /*
     * A
     * B C
     * D E F
     */
    public void paTTern7() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i <= n; i = i + 1) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }

    }

    /*
     * 4
     * 3 4
     * 2 3 4
     * 1 2 3 4
     */
    public void paTTern8() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i = i + 1) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n - i + j + " ");
            }
            System.out.println();
        }

    }

    /*
     * D
     * C D
     * B C D
     * A B C D
     */
    public void paTTern9() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i = i + 1) {
            for (int j = 1; j <= i; j++) {
                char ch = (char) ('A' + n - i + j - 1);
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    }

    public void paTTern10() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i = i + 1) {

            // this is for space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // this is for *
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void paTTern11() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i = i + 1) {

            // this is for space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // this is for 1st triangle
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // this is for 2nd triangle
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }

            System.out.println();
        }

    }

    public void paTTern12() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            for (int k = i - 1; k >= 1; k--) {
                System.out.print("*");
            }

            for (int m = 1; m <= i - 1; m++) {
                System.out.print("*");
            }

            for (int l = n - i + 1; l >= 1; l--) {
                System.out.print(l);
            }

            System.out.println();
        }
    }

    public void paTTern13() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                value += 1;
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pattern().paTTern13();

    }
}