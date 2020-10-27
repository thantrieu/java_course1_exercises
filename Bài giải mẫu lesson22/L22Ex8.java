import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L22Ex8 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        var n = input.nextInt();
        var numbers = getNumbers(n, input); // gọi phương thức
        showResult(numbers);
    }

    // phương thức hiển thị kết quả
    private static void showResult(int[] numbers) {
        System.out.println("Phân tích từng số thành thừa số nguyên tố: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(splitToPrime(numbers[i]));
        }
    }

    /**
     * phương thức tách số n thành thừa số nguyên tố của nó
     *
     * @param number là giá trị cần tách
     * @return giá trị chuỗi kết quả sau phân tách
     */
    private static String splitToPrime(int number) {
        String res = number + " = ";
        int i = 2; // bắt đầu từ 2 - số nt nhỏ nhất
        while (number > 1) {
            if (number % i == 0) {
                res += i; // thêm i vào kết quả phân tích
                if (number != i) { // nếu i chưa phải phần tử ng.tố cuối cùng
                    res += "*"; // thêm dấu * vào kết qủa
                }
                number /= i; // giảm đi i lần
            } else { // nếu k chia hết thì
                i++; // tăng i lên
            }
        }
        return res;
    }

    /**
     * phương thức nhập vào danh sách các số nguyên
     *
     * @param n     số lượng giá trị cần nhập
     * @param input đối tượng của lớp Scanner
     * @return mảng các phần tử đã nhập vào
     */
    private static int[] getNumbers(int n, Scanner input) {
        var numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
}
