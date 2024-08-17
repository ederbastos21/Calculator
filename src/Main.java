import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Create scanner
        Scanner scanner = new Scanner(System.in);

        //Declare variables outside of function scope
        float result = 0;
        String operation = "";

        while(true){
            //Get first number
                //Doesn't continue the code if finish operation was used
                if (operation.equals("finish")){
                    scanner.close();
                    break;
                }
            System.out.print("Insert first number: ");
            float firstNumber = scanner.nextFloat();

            //Keep calculating infinitely
            while (true) {
                //Get operation
                System.out.print("Insert operation: ");
                //Avoids user from placing an unwanted character
                    while (true) {
                        operation = scanner.next();
                        if (operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("*") || operation.equals("reset") || operation.equals("finish")){
                            break;
                        } else {
                            System.out.print("Please place a valid operation (+ - * / or reset,finish): ");
                        }
                    }
                    //Reset operation
                    if (operation.equals("reset") || operation.equals("finish")) {
                    break;
                    }

                //Get second number
                System.out.print("Insert second number: ");
                float secondNumber = scanner.nextFloat();

                //Process depending on user's operation choice
                result = switch (operation) {
                    case "+" -> firstNumber + secondNumber;
                    case "-" -> firstNumber - secondNumber;
                    case "/" -> firstNumber / secondNumber;
                    case "*" -> firstNumber * secondNumber;
                    default -> result;
                };

                //Output
                System.out.println(result);

                firstNumber = result;
            }
        }
    }
}