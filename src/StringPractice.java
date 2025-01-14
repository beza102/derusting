import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String myString = "Hello";
    // Find the length of the string
    int length = myString.length();
    System.out.println("Length of the string: " + length);

    // Concatenate (add) two strings together and reassign the result
    myString = myString + " World";
    System.out.println("After concatenation: " + myString);

    // Find the value of the character at index 3
    char charAtIndex3 = myString.charAt(3);
    System.out.println("Character at index 3: " + charAtIndex3);
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    boolean containsSubstring = myString.contains("abc");
    System.out.println("Contains 'abc': " + containsSubstring);
    // Iterate over the characters of the string, printing each one on a separate line
    System.out.println("Characters in the string:");
    for (int i = 0; i < myString.length(); i++) {
      System.out.println(myString.charAt(i));
    }
    // Create an ArrayList of Strings and assign it to a variable
     ArrayList<String> stringList = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    stringList.add("Apple");
    stringList.add("Banana");
    stringList.add("Cherry");
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joinedString = String.join(", ", stringList);
    System.out.println("Joined string: " + joinedString);

    // Check whether two strings are equal
    String string1 = "hello";
    String string2 = "hello";
    boolean areEqual = string1.equals(string2);
    System.out.println("Are the strings equal? " + areEqual);
  
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
