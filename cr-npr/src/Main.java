import java.util.Scanner;

public class Main {
    public static int factorial(int num){
        int fact =1;
        for (int i=1;i<=num;i++){
            fact*=1;
        }return fact;
    }
    public static void main(String[] args){

        Scanner input =new Scanner(System.in);
        System.out.println("please enter number 'n' ");
        int n=input.nextInt();
        System.out.println("please enter number 'r' ");
        int r=input.nextInt();
        float ncr=factorial(n)/factorial(r)*factorial(n-r);
        int npr=factorial(n)/factorial(n-r);
        System.out.println("ncr = "+ncr);
        System.out.println("npr = "+npr);
    }
}