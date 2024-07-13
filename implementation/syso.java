// code related to - First Java Program - Input/Output, Debugging and Datatypes

package implementation; //this is the name of the package/folder in which the class is created this gives us control over our code and access of it. for eg a package can be com.google or com.facebook etc.    //package is a keyword in java

import java.util.Scanner; // this has imported the Scanner class from the util package of java.

/**
 * The arrayimp class is a Java class that serves as an example for array implementation.
 * It contains a main method that is the entry point of the Java program.
 */
public class syso {
    /**
     * The main method is the entry point of the Java program.
     * It is called by the Java Virtual Machine (JVM) when the program is started.
     *
     * @param args the command-line arguments passed to the program
     *             as an array of strings
     */
    public static void main(String[] args) {
        System.out.println(); // this is used to print the output on the console.

        //PrintStream out = System.out;
        //Scanner Class for INPUT
        // Scanner scn = new Scanner(System.in); // this is the object of the Scanner class which is used to take input from the user.
        //int n = scn.nextInt(); // this scn is pointing to object in the Scanner class. nextInt() is a method of the Scanner class which is used to take integer input from the user.
        // System.out and System.in are used to access the commandline to show the data on CLI or Take iput from the system respectively.

        //Integer c; // Wrapper Classes
        //DEbugger shows how the code is working and where it is failing.

        int a = 10; // a is a identiier

        //sum of two numbers

        Scanner scn = new Scanner(System.in); 
        float n1 = scn.nextInt();
        float n2 = scn.nextFloat();
        float sum = n1 + n2;
        System.out.println(sum);
        // this runs even when on lhs there is a int it is due to type casting there are two types of type casting implicit and explicit.
    }
}
