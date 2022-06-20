import java.util.*;
import java.io.*;

public class CollectionToArray
{
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Ali");
        al.add("Ahmad");
        al.add("Asad");
        al.add("Ajmal");
        al.add("Tayyab");
        al.add("Manan");
        
        //converting to array
        String[] array = new String[al.size()]; 
        array = al.toArray(array);
        System.out.println("Converted Array: " + Arrays.toString(array));
    }
    
}
