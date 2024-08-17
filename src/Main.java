import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Create scanner
        Scanner scanner = new Scanner(System.in);

        //Declare variables outside of function scope
        float result = 0;
        String operation = "a";

        //Get first number
        System.out.print("Insert first number: ");
        float firstNumber = scanner.nextFloat();

        //Get operation
        System.out.print("Insert operation: ");
            //Avoid user from placing an unwanted character
        while (true) {
            operation = scanner.next();
            if (operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("*")){
                break;
            } else {
                System.out.print("Please place a valid operation (+ - * /): ");
            }
        }

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