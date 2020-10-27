public class Address {
    // các thuộc tính:
    public String number;       // số nhà
    public String lane;         // ngõ
    public String road;         // tên đường
    public String village;      // tên xóm
    public String wards;        // phường/xã
    public String district;     // quận/huyện
    public String city;         // thành phố

    // phương thức khởi tạo mặc định:
    public Address() {
        number = "";
        lane = "";
        road = "";
        village = "";
        wards = "";
        district = "";
        city = "";
    }

    // phương thức khởi tạo 2 tham số
    public Address(String district, String city) {
        this.district = district;
        this.city = city;
    }

    // phương thức trả về thông tin đầy đủ của địa chỉ
    public String fullAddress() {
        String address = "";
        if(!number.isEmpty()) {
            address += "Số " + number;
        }
        if(!lane.isEmpty()) {
            address += " ngõ " + lane;
        }
        if(!road.isEmpty()) {
            address += " đường " + road;
        }
        if(!village.isEmpty()) {
            address += " thôn/xóm " + village;
        }
        if(!wards.isEmpty()) {
            address += " xã/phường " + wards;
        }
        if(!district.isEmpty()) {
            address += " quận/huyện " + district;
        }
        if(!city.isEmpty()) {
            address += " tỉnh/thành phố " + city;
        }
        return address;
    }
}
