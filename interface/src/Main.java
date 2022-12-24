public class Main {

    public static void main(String[] args) {
        double totalSum=0;
        prodable[] arr = new prodable[3];
        arr[0] = new book("a", 200);
        arr[1] = new childbook("B", 100, 200);
        arr[2] = new cartonBook("Batot",300);
        for (int i = 0; i < arr.length;i++){
            System.out.println(arr[i].priceAfterDiscount());
            double sum =arr[i].priceAfterDiscount();
            totalSum+=sum;
        }
        System.out.println("the total price = "+totalSum );
    }
}