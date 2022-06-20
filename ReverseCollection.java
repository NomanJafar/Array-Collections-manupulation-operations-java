import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ReverseCollection
{
    public static void main(String[] args){
        List<String> al = new ArrayList<>();
        al.add("Ali");
        al.add("Ahmad");
        al.add("Asad");
        al.add("Ajmal");
        al.add("Tayyab");
        al.add("Manan");
        //2. Reverse a collection
        System.out.println("2. Reverse a collection: ");
        System.out.println("\tOriginal Array: " + al);
        Collections.reverse(al);
        System.out.println("\tReversed array: " + al);
    }
}
