import java.util.Scanner;

public class FriendlyNumbers {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 1; i <= t; i++) {
            var a = scanner.nextInt();
            var b = scanner.nextInt();
            var result = checkFriendlyNumber(a, b) && checkFriendlyNumber(b, a);
            var resultString = result ? "YES" : "NO";
            System.out.println("Test " + i + ": " + resultString);
        }
    }

    private static boolean checkFriendlyNumber(int m, int n) {
        if(m < 2) {
            return false;
        }
        int sum = sumDivisor(m);
        return sum == n;
    }

    private static int sumDivisor(int m) {
        int sum = 1;
        int bound = (int)Math.sqrt(m);
        for (int i = 2; i <= bound; i++) {
            if(m % i == 0) {
                if(m / i == i) {
                    sum += i;
                } else {
                    sum += i;
                    sum += m / i;
                }
            }
        }
        return sum;
    }

}
