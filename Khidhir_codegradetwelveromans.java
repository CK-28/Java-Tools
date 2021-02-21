/*Name: Christina Khidhir
 *Date: 21/12/2017
 *Purpose: Read a file containing Roman Numerals and convert it into an english system numerical value
 */

import java.awt.*;
import java.io.*;
import java.util.*;

public class Khidhir_codegradetwelveromans
{
    public static void main (String[] args) throws IOException
    {
        //Welcome Message
        System.out.println ("**************************************************");
        System.out.println ("             Welcome To Roman Numerals            ");
        System.out.println ("**************************************************");

        //Variable Declaration
        int currentNum = 0;                                                                                                                 //Used to store the value of the current roman numeral in the english system.
        int nextNum = 0;                                                                                                                    //Used to store the value of the next roman numeral in the english system.
        int totalNum = 0;                                                                                                                   //Used to store the value of the roman numerals in the english system.
        int max_index = -1;                                                                                                                 //Used to go through each line of the read file.
        String romanNums[] = new String[5];                                                                                                 //Parameter large enough for the required number of lines to be read.

        //Input
        //Begins scanning from a file containing roman numerals.
        Scanner fileScanner = new Scanner (new File ("H:\\Computer Sciences\\CS 12\\Completed\\Khidhir_codegradetwelveromans\\Input.txt"));

        //Reads line by line from the file and stores them in string.
        while(fileScanner.hasNext())
        {
            max_index = max_index + 1;
            romanNums[max_index] = fileScanner.nextLine();
        }

        //Close the file after reaching the max index.
        fileScanner.close();

        //Processing and Output
        for (int x = 0; x < romanNums.length; x = x + 1)                                                                                    //Goes through every row in the created string of roman numerals.
        {
            System.out.println ("\n" + (romanNums[x]));                                                                                     //Outputs the row in roman numerical value for the user to see.
            totalNum = 0;                                                                                                                   //Resets the total value of the number every time the for loop is repeated. (As to later out put the total value of each row on its own).
            for (int y = 1; y <= romanNums[x].length(); y = y + 1)                                                                          //Goes through every letter in the current row.
            {
                currentNum = numConverter(romanNums[x].charAt (y - 1));                                                                     //Calls unto the numConverter method as to set the value in the english system. Uses current row and current roman numeral.

                if (y < romanNums[x].length())                                                                                              //This if else statement prevents the code from skipping the last roman value in the string numbers or from causing an error by looking for a value that is beyond the numeral's length.
                {
                    nextNum = numConverter(romanNums[x].charAt (y));                                                                        //Calls unto the numConverter method as to set the value in the english system. Uses current row and next roman numeral.
                }
                else
                {
                   nextNum = 0;
                }

                if (currentNum < nextNum)                                                                                                   //If the current number is smaller than the next number then the value added to the total value is equal to the next number - the current number.
                {
                    totalNum = totalNum + (nextNum - currentNum);
                    y = y + 1;                                                                                                              //1 is added to y as to skip over the next number in the loop as it has already been accounted for.
                }
                else
                {
                    totalNum = totalNum + currentNum;                                                                                       //If the current number is NOT smaller than the next number then its value is simply added to the total value.
                }
            }
            System.out.println ("Total Value: " + (totalNum));                                                                              //Ouputs the total value after each row in the english system for the user to see.
        }

        //Goodbye Message
        System.out.println ("\n**************************************************");
        System.out.println ("          Thanks For Using This Program!          ");
        System.out.println ("**************************************************");
    } // main method

    public static int numConverter (char letter)                                                                                            //Method used to convert values from their roman origin into the english system.
    {
        int number = 0;

        //If else statements used to test the recieved roman character against every possibility and then setting the number value as its english system equivalent.
        if (letter == 'I')
        {
            number = 1;
        }
        else if (letter == 'V')
        {
            number = 5;
        }
        else if (letter == 'X')
        {
            number = 10;
        }
        else if (letter == 'L')
        {
            number = 50;
        }
        else if (letter == 'C')
        {
            number = 100;
        }
        else if (letter == 'D')
        {
            number = 500;
        }
        else if (letter == 'M')
        {
            number = 1000;
        }

        return number;                                                                                                                      //Returns the numerical value in the english system.
    } // numConverter method
} // Khidhir_codegradetwelveromans class