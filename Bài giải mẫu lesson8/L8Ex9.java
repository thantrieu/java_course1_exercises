/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L8Ex9 {
    public static void main(String[] args) {
        // độ dài ba cạnh tam giác:
        var a = 60;
        var b = 80;
        var c = 60;
        // tính p:
        var p = 0.5 * (a + b + c);
        // tính diện tích:
        var area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Diện tích tam giác = " + area);
        // Diện tích tam giác = 1788.8543819998317
    }
}
// code xong ấn Ctrl Alt L để format code