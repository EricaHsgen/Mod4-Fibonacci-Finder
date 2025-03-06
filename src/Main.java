import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            int input = getUserInput(); // get user input

            //if input is negative
            while(input < 0){
                System.out.println("Integer is negative.");
                input = getUserInput(); // get user input again and re-validate
            }

            Fibonacci fib = new Fibonacci();

            int fibonacciNum = 0;   // declare variable
            for (int i = 0; i <= input; i++) {
                fibonacciNum = fib.findFibNum(i);   // find fibonacci number
            }
            System.out.println("The Fibonacci number at position " + input + " is " + fibonacciNum + "."); //show output
        }
        catch (InputMismatchException e) {  //if input is not an integer
            System.out.println("This is not an integer. Enter a non-negative integer.");
        }
    }

    public static int getUserInput(){
        //take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative integer to find a number in the Fibonacci sequence: ");
        return scanner.nextInt();
    }
}