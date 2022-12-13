import java.util.Scanner;

public class Main {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("please enter radius of Circle");
            float r=input.nextFloat();
            System.out.println("please enter Base of triangle");
            float x=input.nextFloat();
            System.out.println("please enter height of triangle");
            float y=input.nextFloat();
            System.out.println("please enter Hypotenuse of triangle");
            float z=input.nextFloat();
            cyrcle c1=new cyrcle();
            System.out.println("area of circuit = "+c1.area(r));
            System.out.println("circumference of circuit = "+c1.circumference(r));
            triangle t1=new triangle();
            System.out.println("area of triangle = "+ t1.area(x,y,z));
            System.out.println("circumference of triangle = "+ t1.circumference(x,y,z));







    }
}