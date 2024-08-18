import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        //Create scanner
        Scanner scanner = new Scanner(System.in);

        //Declare variables outside of function scope
        float result = 0;
        float firstNumber = 1;
        float secondNumber = 1;
        String operation = "";

        //Loop to reset the calculator
        while(true){
            //Doesn't continue the code if finish operation was used
            if (operation.equals("finish")){
                scanner.close();
                break;
            }
            //Get first number with code to avoid placing not a number
            System.out.print("Insert first number: ");
            while(true) {
                try {
                    firstNumber = scanner.nextFloat();
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Place a valid number: ");
                    scanner.next();
                }
            }


            //Loop to keep calculating with the obtained result
            while (true) {
                //Get operation
                System.out.print("Insert operation: ");
                //Avoids user from placing an unwanted character on operation
                    while (true) {
                        operation = scanner.next();
                        if (operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("*") || operation.equals("reset") || operation.equals("finish")){
                            break;
                        } else {
                            System.out.print("Place a valid operation (+ - * / or reset/finish): ");
                        }
                    }
                    //Reset calculator by breaking loop
                    if (operation.equals("reset") || operation.equals("finish")) {
                    break;
                    }

                //Get second number with code to avoid placing not a number
                System.out.print("Insert second number: ");
                while(true) {
                    try {
                        secondNumber = scanner.nextFloat();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.print("Place a valid number: ");
                        scanner.next();
                    }
                }

                //Process the calculation depending on user's operation choice
                result = switch (operation) {
                    case "+" -> firstNumber + secondNumber;
                    case "-" -> firstNumber - secondNumber;
                    case "/" -> firstNumber / secondNumber;
                    case "*" -> firstNumber * secondNumber;
                    default -> result;
                };

                //Output
                System.out.println("-> "+result);

                firstNumber = result;
            }
        }
    }
}