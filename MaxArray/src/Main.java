public class Main {
    public static void main(String[] args) {
        //max

        int[] arr = {1,2,3,4,5};
        int x = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > x) {
                x = arr[i];
            }
        }
        System.out.println(x);
    }
}