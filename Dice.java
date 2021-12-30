/*
*
* The Microwave program lets the user enter the food they want to heat up and how
* many of the items they want, then gives them the time they need to heat the items up.
*
* @author Jakob
* @version 1.0
* @since 2020-11-26
* 
*/

import java.util.Random;
import java.util.Scanner;

/**
* Dice game.
*/
final class Dice {

 public static final int MAX = 7;

    /**
    * Prevents instantiation.
    *
    *  @throws IllegalStateException
    *
    */

    private Dice() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Starting function.
    *
    * @param args No args will be used
    *
    */

    public static void main(final String[] args) {


        int[] numbers = new int[] { 1, 2, 3, 4, 5, 6 };
        final int cMove = numbers[new Random().nextInt(numbers.length)];

        final Scanner scanner = new Scanner(System.in);
        final int  pMove;

        System.out.println("Pick a number between 1-6: ");
        pMove = scanner.nextInt();
        int numberOfTries = 0;
try {
int counter = 1;
while (counter > MAX) {
counter = counter + 1;
}

    while () {
            
    numberOfTries = numberOfTries + 1;
    
    if (pMove == cMove) {
    System.out.println("You won!");
break;
} 
    else if (pMove < cMove) {
    System.out.println("Too low!");
}
    else if (pMove > cMove) {
    System.out.println("Too high!");
}
    else {
    System.out.println("That was not a valid number.");
break;
}
}
}
catch (java.util.InputMismatchException errorCode) {
            // Invalid Input.
            System.out.println("This is not an integer.");
}
System.out.println("\nDone.");
}
}
