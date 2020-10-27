/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class lL18Ex20 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000000; i <= 9999999; i++) {
            // nếu i thỏa mãn: thuận nghịch, không chứa 8, tổng chữ số chia hết cho 9
            if (isRevert(i) && !isContain8(i) && isDivBy9(i)) {
                System.out.print(i + " "); // in i ra
                count++;
                if (count % 10 == 0) { // nếu đếm thấy đạt 10 phần tử
                    count = 0; // reset biến đếm
                    System.out.println(); // in xuống dòng
                }
            }
        }
    }

    // phương thức kiểm tra n có chứa số 8 không
    public static boolean isContain8(int n) {
        while (n > 0) {
            if (n % 10 == 8) {
                return true; // có
            }
            n /= 10;
        }
        return false; // không
    }

    // phương thức kiểm tra số thuận nghịch
    public static boolean isRevert(int n) {
        int m = n;
        int rev = 0;
        while (m > 0) { // tiến hành đảo số m
            rev = rev * 10 + m % 10;
            m /= 10;
        }
        return rev == n;
    }

    // phương thức kiểm tra tổng các chữ số có chia hết cho 9
    public static boolean isDivBy9(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum % 9 == 0;
    }
}
