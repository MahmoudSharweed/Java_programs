public class book implements prodable {
    private String name;
    private double discount;
    private static double price=300;

    public book(String name ,double price) {
        this.name = name;
        this.price=price;
        this.discount=discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public double priceAfterDiscount() {
        return price-discount;
    }
}
