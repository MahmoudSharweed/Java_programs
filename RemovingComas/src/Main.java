import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter string number");
        String s1 = input.nextLine();
        String s2 = s1.replace(',', ' ');
        System.out.println(s2);
    }
}