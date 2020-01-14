/*Name: Crestena Khidhir
 *Date: 1/05/2017
 *Purpose: Finding the greatest common divisor of two integers given by a user
*/

//Required java libraries
import java.io.*;
import java.util.*;

public class Khidhir_codegreatestcommon
{
    public static void main (String[] args)
    {
        //Variable declaration
        String test = "";
        int first = -1, second = -1;                                                     //first(integer) and second(integer) are used to store the two integers being given and tested.
        int divisor;                                                                     //Holds the value returned from the gcd function (the answer to the greatest common divisor)

        Scanner kbscanner = new Scanner(System.in);

        //Welcome message
        System.out.println ("****************************************************************************");
        System.out.println ("                    What is The Greatest Common Divisor?                    ");
        System.out.println ("****************************************************************************");

        //Input
        System.out.print ("Please enter the first integer and press <ENTER>: ");         //Prompts the user to input the first integer followed by the second integer.

        //Loops until an acceptable value is given
        while (first == -1)
        {
            test = kbscanner.nextLine();

            //Tests for an integer by using the parseInt method from the Integer class and a NumberFormatException try catch statement
            try {
                first = Integer.parseInt(test);
            } catch (NumberFormatException exception) {
                System.out.println("[Error] Not a Number.");
                System.out.print("Please input a valid response: ");
            }

            //Tests that the integer is not a zero
            if (first == 0) {
                first = -1;
                System.out.println("[ERROR] Integer may not be zero as zero is indivisible.");
                System.out.print("Please input a valid response: ");
            }
        }

        System.out.print ("Please enter the second integer and press <ENTER>: ");
        while (second == -1)
        {
            test = kbscanner.nextLine();

            try {
                second = Integer.parseInt(test);
            } catch (NumberFormatException exception) {
                System.out.println("[ERROR] Not a Number.");
                System.out.print("Please input a valid response: ");
            }

            if (second == 0) {
                second = -1;
                System.out.println("[Error] Integer may not be zero as zero is indivisible.");
                System.out.print("Please input a valid response: ");
            }
        }

        //Processing
        divisor = gcd(first, second);                                                    //Calls the gcd method, sending the values of first and second and saving the returned value in divisor.

        //Output
        System.out.println (("\nThe Greatest Common Divisor of " + first + " and " + second + " is: ") + divisor);     //Outputs a statement including the answer to the greatest gommon givisor found for the two numbers.

        kbscanner.close();

        //Goodbye message
        System.out.println ("\n****************************************************************************");
        System.out.println ("                      Thank You For Using This Program!                     ");
        System.out.println ("****************************************************************************");
    }//main method

    public static int gcd (int first, int second)                                        //Recieves the values of the first and second integer nfor which the greatest common divisor is needed.
    {
        //Variable Declaration
        int divisor = 1;                                                                 //Used to hold the value for the greatest common divisor.

        //Processing
        for (int d = 2; d <= first && d <= second; d = d + 1)                            //Uses d as the integer used to divide the inputed integers by. Keeps increasing d until it is larger than either one of the inputed integers.
        {
            if (first % d == 0 && second % d == 0) {                                     //Tests if the remainder upon division for both integers is zero (ie d is a common divisor).
                divisor = d;                                                             //If true then d  is set as the current greatest common divisor found.
            }
        }

        //Output
        return divisor;                                                                  //Returns the value for the divisor.
    }//gcd method
}//Khidhir_codegreatestcommon class
