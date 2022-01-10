/**
 * lớp mô tả thông tin địa chỉ của ai đó
 *
 * @author Branium Academy
 * * @website: https://braniumacademy.net
 */
public class Address {
    // các thuộc tính:
    private String number;       // số nhà
    private String lane;         // ngõ
    private String road;         // tên đường
    private String village;      // tên xóm
    private String wards;        // phường/xã
    private String district;     // quận/huyện
    private String city;         // thành phố

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

    // phương thức khởi tạo 1 tham số
    public Address(String number) {
        this.number = number;
    }

    // phương thức khởi tạo 2 tham số
    public Address(String number, String lane) {
        this(number); // gọi constructor 1 tham số
        this.lane = lane;
    }

    // phương thức khởi tạo 3 tham số
    public Address(String number, String lane, String road) {
        this(number, lane); // gọi constructor 2 tham số
        this.road = road;
    }

    // phương thức khởi tạo 4 tham số
    public Address(String number, String lane,
                   String road, String village) {
        this(number, lane, road); // gọi constructor 3 tham số
        this.village = village;
    }

    // phương thức khởi tạo 5 tham số
    public Address(String number, String lane,
                   String road, String village, String wards) {
        this(number, lane, road, village); // gọi constructor 4 tham số
        this.wards = wards;
    }

    // phương thức khởi tạo 6 tham số
    public Address(String number, String lane,
                   String road, String village,
                   String wards, String district) {
        this(number, lane, road, village, wards); // gọi constructor 5 tham số
        this.district = district;
    }

    // phương thức khởi tạo 7 tham số
    public Address(String number, String lane,
                   String road, String village,
                   String wards, String district, String city) {
        // gọi constructor 6 tham số
        this(number, lane, road, village, wards, district);
        this.city = city;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getWards() {
        return wards;
    }

    public void setWards(String wards) {
        this.wards = wards;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // phương thức trả về thông tin đầy đủ của địa chỉ
    public String fullAddress() {
        String address = "";
        if (!number.isEmpty()) {
            address += "Số " + number;
        }
        if (!lane.isEmpty()) {
            address += " ngõ " + lane;
        }
        if (!road.isEmpty()) {
            address += " đường " + road;
        }
        if (!village.isEmpty()) {
            address += " thôn/xóm " + village;
        }
        if (!wards.isEmpty()) {
            address += " xã/phường " + wards;
        }
        if (!district.isEmpty()) {
            address += " quận/huyện " + district;
        }
        if (!city.isEmpty()) {
            address += " tỉnh/thành phố " + city;
        }
        return address;
    }
}
