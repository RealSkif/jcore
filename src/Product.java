import java.util.Random;

public class Product {
    private String title;
    private double price;

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }
    public void applyDiscount(Discount discount) {
        Random random = new Random();
        int discountPercentage = discount.getValue();
        this.price = price - (price * discountPercentage / 100.0);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
