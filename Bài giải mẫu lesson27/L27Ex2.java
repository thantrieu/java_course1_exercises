/**
 * @author Branium Academy
 * @website: https://braniumacademy.net
 */
 
public class L27Ex2 {
    public static void main(String[] args) {
        Address myAddress = new Address();
        myAddress.city = "Hà Nội";
        myAddress.district = "Cầu Giấy";
        myAddress.number = "124B";
        myAddress.lane = "168";

        System.out.println("Địa chỉ của tôi là: " + myAddress.fullAddress());
    }
}
