public class childbook extends book{
     float childDiscount;

    public childbook(String name, float childDiscount,double price){
        super(name,price);
        this.childDiscount=childDiscount;
    }

    @Override
    public double priceAfterDiscount() {
        return super.getPrice()-childDiscount;
    }
}
