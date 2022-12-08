public class V47_ExceptionHandling {
    /*
     * 1. What is an exception in a program?
     * An exception is an error event that occurs at or after compile. The event
     * dirupts the program's execution resulting in a crash in the runtime system
     * 2. Why do we need to handle exceptions in our programs?
     * Exceptions must be handled in programs in order for the program to continue
     * to execute.
     * 3. Identify the problem in the following sample programs and explain with
     * your words why are the programs crashing. After that, make them more
     * robust, by adding exception handling in them.
     */

    // a. First program: The array is out of bounds.
public static void main(String[] args) {
    try {
        String stringName = "Raphael Silvia";
        char fifthChar = stringName.charAt(5);
        char tenthChar = stringName.charAt(10);
        char fifteenthChar = stringName.charAt(15);

        System.out.println("the fifth character of the name is " + fifthChar);
        System.out.println("the fifth character of the name is " + tenthChar);
        System.out.println("the fifth character of the name is " + fifteenthChar);
    } catch (StringIndexOutOfBoundsException e) {
        e.getMessage();
        System.out.println(e);
    }
    System.out.println("Our program finished executing");
}

    // b. Second program: The string object has a null value, which will lead to a
    // null exception.
    // public static void main(String[] args) {
    // String name = null;
    // try {
    // System.out.println(name);
    // } catch (NullPointerException e) {
    // e.printStackTrace();
    // System.out.println("Null exception: you cannot have null as a string
    // value.");
    // }
    // System.out.println("Our program finished executing");
    // }
    // c. Third program: The program is trying to parse a string value even though
    // it is looking for an integer value.
    // public static void main(String[] args) {
    // try {
    // int num = Integer.parseInt("XYZ");
    // System.out.println(num);
    // } catch (NumberFormatException e) {
    // e.getMessage();
    // System.out.println("You cannot parse an Integer if the value is a string");
    // }
    // System.out.println("Our program finished executing");
    // }

    // d. Fourth program: Out of bounds exception. array1 now = array2, which has
    // less than 5 elements in the array.

    // public static void main(String[] args) {
    // int[] array1 = {1, 2, 3, 5, 7, 9};
    // int[] array2 = {2, 4, 6};

    // try {
    // System.out.println(array1[5]);

    // array1 = array2;

    // System.out.println(array1[5]);
    // } catch (ArrayIndexOutOfBoundsException e) {
    // e.getMessage();
    // System.out.println(e);
    // }
    // System.out.println("Our program finished executing");
    // }

    // e. Fifth program: ArithmeticException. Denominator value is zero.

    // public static void main(String[] args) {
    // int firstNumber = 10;
    // int secondNumber = 0;
    // try {
    // System.out.println(firstNumber / secondNumber);
    // } catch (ArithmeticException e) {
    // e.printStackTrace();
    // System.out.println(e);
    // System.out.println("You cannot divide a number by 0")
    // }
    // System.out.println("Our program finished executing");

    // }
    /*
     * 4. Identify the problem in the following code and correct it with any
     * technique that you find suitable.
     * There will be an array out of bounds exception since the arrayToBePrinted has
     * a length of 11 while our printArray methods uses a for-loop with a length of
     * 20. You can:
     * a) change the method to accept a length of 11 in the for-loop OR
     * b) add a try catch block to catch the exception and allow the entire program
     * to run despite the array out-of-bounds error.
     */
    // public void printArray (int[] array) {
    // for (int i = 0; i < 20; i++) {
    // System.out.println("value of index: " + i + " = " + array[i]);
    // }
    // }

    // public static void main(String[] args) {
    // V46B_App v46b_App = new V46B_App();
    // int[] arrayToBePrinted = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    // try {
    // v46b_App.printArray(arrayToBePrinted);
    // } catch (ArrayIndexOutOfBoundsException e) {
    // System.out.println(e);
    // }
    // System.out.println("Our program finished executing");
    // }

}
