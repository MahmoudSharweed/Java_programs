public class cartonBook extends book{
    private static double cartonDiscount=200;
    public cartonBook(String name, double price) {
        super(name, price);

    }
    @Override
    public double priceAfterDiscount() {
        return super.getPrice()-cartonDiscount;
    }
}
