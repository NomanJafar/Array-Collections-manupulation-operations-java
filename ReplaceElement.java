import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ReplaceElement
{
    public static void main(String[] args){
        List<String> al = new ArrayList<>();
        al.add("Ali");
        al.add("Ahmad");
        al.add("Asad");
        al.add("Ajmal");
        al.add("Tayyab");
        al.add("Manan");
        //4. replace the elements of a collection
        System.out.println("4. replace the elements of a collection: ");
        System.out.println("\tOriginal Array: " + al);
        al.set(2, "Akram");
        System.out.println("\tReplaced array: " + al);
    }
}
