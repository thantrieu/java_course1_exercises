/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

/*
    Sử dụng công thức toán học lượng giác trong tam giác để giải:
    - cạnh kề x = huyền * cos(x)
    - cạnh đối x = huyền * sin(x)
 */

public class L8Ex10 {
    public static void main(String[] args) {
        var c = 100; // cạnh huyền
        var alpha = 35; // góc alpha
        // tìm cạnh đối góc alpha
        var a = c * Math.sin(Math.toRadians(alpha));
        // tìm cạnh kề góc alpha
        var b = c * Math.cos(Math.toRadians(alpha));
        // tính chu vi, diện tích của tam giác:
        var perimeter = a + b + c;
        var area = 0.5 * a * b;
        // hiện kết quả
        System.out.println("Chu vi tam giác = " + perimeter);
        System.out.println("Diện tích tam giác = " + area);
    }
}
// code xong ấn Ctrl Alt L để format code