import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class CollectionReadOnly
{
    public static void main(String[] args){
        List<String> al = new ArrayList<>();
        al.add("Ali");
        al.add("Ahmad");
        al.add("Asad");
        al.add("Ajmal");
        al.add("Tayyab");
        al.add("Manan");

        //5. make collection unmodified
        List<String> unmodifiableList = Collections.unmodifiableList(al);
        System.out.println("5. make collection unmodified: ");
        System.out.println("\tOriginal Array: " + unmodifiableList);
        System.out.println("\tunmodifiableList array: " + unmodifiableList);
    }
}
