/**
 * @author Branium Academy
 * @website: https://braniumacademy.net
 */

public class L28Ex2 {
    public static void main(String[] args) {
        // tạo địa chỉ của một ai đó với số nhà của họ:
        Address address1 = new Address("120A");
        // tạo địa chỉ của một ai đó với số nhà, ngõ của họ:
        Address address2 = new Address("120A", "127");
        // tạo địa chỉ của một ai đó với số nhà, ngõ, tên đường:
        Address address3 = new Address("120A", "325", "Hoàng Diệu");
        // tạo địa chỉ của một ai đó với các thông tin khác nữa qua
        // các constructor khác:
        Address address4 = new Address("120A", "325",
                "Hoàng Diệu", "Trung Tâm");
        Address address5 = new Address("120A", "325",
                "Hoàng Diệu", "Trung Tâm", "Quang Minh");
        Address address6 = new Address("120A", "325",
                "Hoàng Diệu", "Trung Tâm",
                "Quang Minh", "Quận 70");
        Address address7 = new Address("120A", "325",
                "Hoàng Diệu", "Trung Tâm",
                "Quang Minh", "Quận 70", "Hồ Chí Minh");
    }
}
