/**
 * Justin Klippstein
 * Assignment 4
 */

import java.util.Scanner;

public class Assignment4{
    
    public static Scanner scanner = new Scanner(System.in);
    public static String userString;

    //Total length of string
    public static int index = 0;

    //index of string while going through loop
    public static int i = 0;
    
    
    
    
    public static void main(String[] args) throws Exception {

        ReverseString();

    }

    public static void ReverseString() {

        System.out.println("Type something! Ill reverse it. Type 'EXIT -0' to close program");
        userString = scanner.nextLine();

        index = userString.length();

        if (userString.contains("EXIT -0")) {
            scanner.close();
            System.exit(0); 
          }

          while (index > i) {
            //index is the total length of the string,
            //i is the amount of times you've goth through the loop.
            //0-indexed so - 1 in condition.
            System.out.print(userString.charAt(index - i - 1));
            
            i++;
          }
        

        System.out.println(" ");

        index = 0;
        i = 0;
        ReverseString();

    }

}

