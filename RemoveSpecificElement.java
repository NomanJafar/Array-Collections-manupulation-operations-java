import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class RemoveSpecificElement
{
    public static void main(String[] args){
        List<String> al = new ArrayList<>();
        al.add("Ali");
        al.add("Ahmad");
        al.add("Asad");
        al.add("Ajmal");
        al.add("Tayyab");
        al.add("Manan");
        //1. remove specific element from collection
        System.out.println("1. remove specific element from collection: ");
        System.out.println("\tOriginal Array: " + al);
        al.remove("Asad");
        System.out.println("\tModified array: " + al);
    }
}
