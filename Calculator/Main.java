// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // MY FIRST EVERE JAVA PROJECT, A CALCULATOR BETWEEN 2 NUMBERS.
        System.out.println("what operation do you want to do?");
        System.out.println("Press + for the sum");
        System.out.println("Press - for the subtraction");
        System.out.println("Press * for the multiplication");
        System.out.println("press / for the division");
        String operation = input.next();

        System.out.print("enter a number: ");
        int number1 =  input.nextInt();
        System.out.print("enter a number: ");
        int number2 = input.nextInt();

        int sum, sub, mult;
        double div;
           if(operation.equals("+")){
                sum = number1 + number2;
                System.out.println("the result of the sum is: " + sum);
            } else if (operation.equals("-")) {
               sub = number1 - number2;
               System.out.println("the result of the subtraction is: " + sub);
           } else if (operation.equals("*")) {
               mult = number1 * number2;
               System.out.println("the result of the multiplication is: " + mult);
           } else if (operation.equals("/")) {
               div = number1 / number2;
               System.out.println("the result of the division is: " + div);
           }
    }
    }
