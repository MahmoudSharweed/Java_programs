public  class book extends product {
    private static double Discount=100;

    public book( String name, float price) {
        super(name, price);

    }

    public double getDiscount() {
        return Discount;
    }

    public void setDiscount(double discount) {
        Discount = discount;
    }

    @Override
    public double priceAfterDiscount(){
        return super.getPrice() -Discount;
    }
}
