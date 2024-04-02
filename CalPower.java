import java.util.Scanner;

public class CalPower {
    public static int Power(int x, int y) {

        // 1st base case
        if (y == 0)
            return 1;
        if (y == 1)
            return x;

        // calculate y/2
        int ans = Power(x, y / 2);

        // for even power

        if (y % 2 == 0) {

            return ans * ans;
        } else {

            return x * ans * ans;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int ans = Power(x, y); // here we calculate power of x^y

        System.out.println(" Power of x^y= " + ans);
    }
}
