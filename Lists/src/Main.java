import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList <String > colour=new LinkedList<String>();
        colour.add("yellow");
        colour.add("red");
        colour.add("blue");
        colour.add("white");
        colour.add("green");
        System.out.println(colour);
        System.out.println ( colour.contains("red"));

        HashSet <String> A=new HashSet<>();
        A.add("ahmed");
        A.add("Mohamed");
        A.add("ali");
        System.out.println(A);

        ArrayList<String>B=new ArrayList<String>(A);
        System.out.println(B);




    }
}