public class Main {
    public static void main(String[] args) {
        double totalprice=0;
        product []arr=new product[2];
        arr[0]=new book("A",200);
        arr[1]=new childrenBook("D",400,100);
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i].priceAfterDiscount());
            double sum =arr[i].priceAfterDiscount();
            totalprice+=sum;
        }
        System.out.println("the total price = "+ totalprice);
    }
}