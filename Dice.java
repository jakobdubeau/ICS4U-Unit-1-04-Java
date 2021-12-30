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

public static final int MAX = 6;
public static final int MIN = 1;
public static final int NUM = 100;

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
        int  pMove;
try {
        System.out.println("Pick a number between 1-6: ");
        pMove = scanner.nextInt();
        int numberOfTries = 1;
int counter = 1;
while (counter > NUM) {
counter = counter + 1;
}

    do {
            
   numberOfTries = numberOfTries + 1;
    
    if (pMove > MAX || pMove < MIN) {
    System.out.println("Guess won't count.");
}
    else if (pMove < cMove) {
    System.out.println("Too low!");
}
    else if (pMove > cMove) {
    System.out.println("Too high!");
}
    else {
    System.out.println("You Guessed Correctly! It took you 1 try.");
System.out.println("\nDone.");
System.exit(0);
}

System.out.println("Keep guessing");
pMove = scanner.nextInt();
}
while (pMove != cMove);

            System.out.println("You Guessed Correctly! It took you "
 + numberOfTries + " tries.");
}
catch (java.util.InputMismatchException errorCode) {
            // Invalid Input.
            System.out.println("This is not an integer.");
}
System.out.println("\nDone.");
}
}
