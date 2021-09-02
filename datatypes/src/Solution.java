import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int j;
        double e;
        String t;
        /* Read and save an integer, double, and String to your variables.*/
        //enter a number and it will be assigned to j as int
        j=scan.nextInt();
        //enter a number and it will be assigned to e as double
        e=scan.nextDouble();
        //the below scan command prints all the text that we enter in next line as 1 sentence
        scan.nextLine();
        //enter a single line sentence which will be concatenated with s
        t=scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+j);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d+e);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s+t);
        //closes the scanner object
        scan.close();
    }
}