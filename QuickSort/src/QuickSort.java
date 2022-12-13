public class QuickSort {
   public  void sorting(int []array,int low,int high){
       if (low>=high)return;
       int i=low;
       int j=high;
       int x=(j-i)/2;
       int mid=array[x];
       while (i<=j) {
           while (array[i] < mid) {
               i++;
           }
           while ( array[j]>mid) {
               j--;
           }
           swap(array, i, j);
       }
       if (low<j){
           sorting(array,low,j);
       }
       if (high>i){
           sorting(array,i,high);
       }

   }

   public static void swap(int []array,int low,int high){
       int s=array[low];
       array[low]=array[high];
       array[high]=s;


   }
}
