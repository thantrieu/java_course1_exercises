public class L29Ex2 {
    public static void main(String[] args) {
        // thiết lập thông tin địa chỉ qua các getter/setter
        Address myAddress = new Address();
        myAddress.setCity("Hà Nội");
        myAddress.setDistrict("Cầu Giấy");
        myAddress.setNumber("124B");
        myAddress.setLane("178");
        myAddress.setWards("Phường 15");

        // sử dụng getter:
        System.out.println("Phường: " + myAddress.getWards());
        System.out.println("Quận: " + myAddress.getDistrict());
        System.out.println("Thành phố: " + myAddress.getCity());

        System.out.println("Địa chỉ đầy đủ của tôi là: " + myAddress.fullAddress());
    }
}
