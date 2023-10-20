package programme_week5;

/** write a java program that takes two numbers as input and display the
 * product of two numbers.
 * Test data:
 * Input first number :25
 * Input second number :5
 * Expected Output 25 *5 =125
 */

public class Program_10_ProductOfTwoNumbers {
    public static void main(String[] args) {
        //First Number declaration
        int firstNumber = 25;
        //second Number declaration
        int secondNumber =5;
        int produced = firstNumber * secondNumber;
        //Expected output
        System.out.println(firstNumber +"*"+secondNumber + "=" + produced);
    }
}
