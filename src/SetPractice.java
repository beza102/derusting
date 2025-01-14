import java.util.HashSet;
import java.util.Set;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    Set<String> mySet =new HashSet<>();
    // Add 3 elements to the set
      mySet.add("Apple");
    mySet.add("Banana");
    mySet.add("Cherry");

    // (It's OK to do it one-by-one)

    // Check whether the Set contains a given String
    boolean containsApple = mySet.contains("Apple");
    System.out.println("Set contains 'Apple': " + containsApple);
    // Remove an element from the Set
    mySet.remove("Banana");
    System.out.println("After removing 'Banana': " + mySet);
    // Get the size of the Set
    int size = mySet.size();
    System.out.println("The size of the Set is: " + size);


    // Iterate over the elements of the Set, printing each one on a separate line
    System.out.println("Set elements:");
    for (String item : mySet) {
      System.out.println(item);
    }
    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
