import java.util.Scanner;

public class Helloworld {
    public static void main(String args[])
    {
        System.out.println("Hello World");
        System.out.println(("second"));
        Scanner scan = new Scanner(System.in); // open scanner
        String s = scan.next(); // read the next token and save it to 's'
//        scan.hasNext(); // returns true if there is another token of input (false otherwise)
//        scan.close(); // close scanner
        System.out.println(s); // print 's' to System.out, followed by a new line
        System.out.println("Input received: \n"+s);
    }
}
