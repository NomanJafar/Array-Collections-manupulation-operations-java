import java.util.*;
public class ArrayToCollection
{
    public static void main(String[] args)
    {
        String array[] = {"Ali", "Ahmad", "Asad", "Ajmal", "Manan", "Tayyab"};
        System.out.println("Array input: " + Arrays.toString(array));
        
        //converting array into collection with asList() function
        List collectionArray = Arrays.asList(array);
        
        System.out.println("Converted elements: " + collectionArray);
        
    }
}
