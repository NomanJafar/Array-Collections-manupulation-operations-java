import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ShuffleCollection
{
    public static void main(String[] args){
        List<String> al = new ArrayList<>();
        al.add("Ali");
        al.add("Ahmad");
        al.add("Asad");
        al.add("Ajmal");
        al.add("Tayyab");
        al.add("Manan");
        //3. Shuffle the elements of a collection
        System.out.println("3. Shuffle the elements of a collection: ");
        System.out.println("\tOriginal Array: " + al);
        Collections.shuffle(al);
        System.out.println("\tShuffled array: " + al);
    }
}
