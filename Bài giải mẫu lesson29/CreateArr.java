public class CreateArr {
    public static void main(String[] args) {
        int[] numbers = createNumbers(10);
        var other = numbers;
        for (var item : numbers) {
            System.out.println(item);
        }
    }

    private static int[] createNumbers(int n) {
        var numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }
}
