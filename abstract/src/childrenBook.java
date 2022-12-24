public class childrenBook extends book{
     private  double childDiscount ;
    public childrenBook( String name, float price,double childDiscount) {
        super( name, price);
        this.childDiscount =childDiscount;
    }
    public double priceAfterDiscount(){
        return super.getPrice()-childDiscount;
    }
}
