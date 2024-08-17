import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Create scanner
        Scanner scanner = new Scanner(System.in);

        //Declare variables outside of function scope
        float result = 0;

        //Get first number
        System.out.print("Insert first number: ");
        float firstNumber = scanner.nextFloat();

        //Get operation
        System.out.print("Insert operation: ");
        String operation = scanner.next();

        //Get second number
        System.out.print("Insert second number: ");
        float secondNumber = scanner.nextFloat();

        //Process depending on user's operation choice
        if (operation.equals("+")){
            result = firstNumber + secondNumber;
        } else if (operation.equals("-")){
            result = firstNumber - secondNumber;
        } else if (operation.equals("/")){
            result = firstNumber / secondNumber;
        } else if (operation.equals("*")) {
            result = firstNumber * secondNumber;
        }

        //Output
        System.out.println(result);
    }
}