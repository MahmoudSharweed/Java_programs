public abstract class product {
    private String name;
    private double price;

    public product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract public double priceAfterDiscount();

}

