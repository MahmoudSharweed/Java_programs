public class Main {
    public static void main(String[] args) {
        QuickSort s1=new QuickSort() ;
        int [] array= {3, 1, 5, 4,8,9,2};
        s1.sorting(array, 0, array.length -1);
        for (int i = 0 ; i < array.length ; i++){
            System.out.println(array[i]);
        }

    }
}