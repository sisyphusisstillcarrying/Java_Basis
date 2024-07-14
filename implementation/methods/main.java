package src.implementation.methods;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
         // Q: take input of 2 numbers and print the sum
        // Scanner in = new Scanner(System.in);
        // int num1, num2, sum;

        // System.out.print("Enter number 1: ");
        // num1 = in.nextInt();
        // System.out.print("Enter number 2: ");
        // num2 = in.nextInt();
        // sum = num1 + num2;
        // System.out.println("The sum = " + sum);

        // if we have to do this multiple times, we can use a function.method rather than copy and pasteing again and again.

        sum(); //calling the function/method
        sum2();

        //access modifiers return_type method_name(parameters){code here} //template

    }

    //anything we want to use is static should be also static therefore below function is static

    static void sum(){ // this does not return anything but we seperately print the soln using syso
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }

    static int sum2(){ // this function returns an integer
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;
        // System.out.println("The sum = " + sum); //this will give an error as we are returning the value and not printing it as this is unreachable code.
        // when specifying return we have to return that type of value only (like id String is defined then String should be return).
    }
    
}
