public enum Capacity {
    F("Trượt"), D("Yếu"), C("Trung bình"), B("Khá"),
    A("Giỏi"), A_PLUS("Xuất sắc");

    Capacity(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
