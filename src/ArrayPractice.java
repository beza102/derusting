public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] stringArray = new String[4];

    // Set the value of the array at each index to be a different String
    stringArray[0]= "one";
    stringArray[1]="Two";
    stringArray[2]="Three";
    stringArray[3]="Four";
    // It's OK to do this one-by-one

    // Get the value of the array at index 2
    System.out.println("Value at index 2: " + stringArray[2]);

    // Get the length of the array
    System.out.println("Length of the array: " + stringArray.length);

    // Iterate over the array using a traditional for loop and print out each item
    for(int i=0; i<stringArray.length; i++){
      System.out.println("Element of index :" + i + ": " +stringArray);
    }
    // Iterate over the array using a for-each loop and print out each item
    System.out.println("for-each loop: ");
    for(String number: stringArray ){
      System.out.println(number);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
