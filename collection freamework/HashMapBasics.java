
import java.util.*;

public class HashMapBasics {
    public static void main(String[] args) {
    
        Map<String, String> mapping = new HashMap<>();
        // insertion
        mapping.put("in", "India");
        mapping.put("en", "England");
        mapping.put("us", "United States");

        System.out.println(mapping);

        Map<String, String> table = new HashMap<>();
        table.put("br", "brazil");

        System.out.println("Before: " + table);
        table.putAll(mapping);
        System.out.println("After: " + table);
   } 
}
