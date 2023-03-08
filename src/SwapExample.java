
public class SwapExample {

    public static void main(String[] args) {
        //Example :  Swapping two integers
        //           a=12 and b=5 ==> a=5 and b=12

        int firstNumber = 12;
        int secondNumber = 5;

        System.out.println("Before swapping: " + firstNumber + " - " + secondNumber);

        //First Way: By using a third variable
        int temp = 0;

        //1. Step: Store the value of the first number in the temp variable
        temp = firstNumber;

        //2. Step: Assign the value of the second number to the first number
        firstNumber = secondNumber;

        //3. Step: Assign the value of the temp variable (which contains the original value of the first number) to the second number
        secondNumber = temp;

        System.out.println("After swapping (using a third variable): " + firstNumber + " - " + secondNumber);

        //Second Way: Without using a third variable
        int a = 12;
        int b = 5;

        System.out.println("Before swapping: " + a + " - " + b);

        //1. Step: Add the values of the two numbers and store the result in the first number
        a = a + b;

        //2. Step: Subtract the value of the second number from the first number and store the result in the second number
        b = a - b;

        //3. Step: Subtract the value of the original first number (now stored in the second number) from the new first number and store the result in the first number
        a = a - b;

        System.out.println("After swapping (without using a third variable): " + a + " - " + b);
    }

}
