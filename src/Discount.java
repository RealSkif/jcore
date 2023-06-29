public enum Discount {
    ZERO(0),
    FIVE(5),
    TEN(10),
    FIFTEEN(15),
    TWENTY(20);

    private int value;

    Discount(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
