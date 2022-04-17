import java.util.Scanner;

public class Exercises11 {
    public static void main(String[] args) {
        // Yêu cầu: chuẩn hóa họ và tên. Biết rằng họ và tên có nhiều từ phân tách nhau bởi
        // 1 dấu cách.
        System.out.println("Nhập vào Họ và tên: ");
        String name = new Scanner(System.in).nextLine();// "lÊ tRần văN viNh"
        // kết quả: Lê Trần Văn Vinh

        // các bước thực hiện:
        // B1: Viết thường các kí tự trong mỗi từ
        // B2: Tách các từ trong câu tại vị trí có dấu cách
        // B3: Chuyển các kí tự trong từ đó sang mảng kí tự
        // B4: Viết hoa chữ cái đầu từ
        // B5: Thêm các từ vào chuỗi đích(kết quả)
        // B6: In ra kết quả

        var result = solve(name);
        // b6:
        System.out.println(result);
    }

    private static String solve(String name) {
        // b1 + b2
        var words = name.toLowerCase().split("\\s+");
        StringBuilder builder = new StringBuilder();
        for(var item : words ) {
            var characters = item.toCharArray();
            // b4
            characters[0] = Character.toUpperCase(characters[0]);
            // b5:
            builder.append(new String(characters));
            builder.append(" ");
        }
        return builder.toString().trim();
    }
}
