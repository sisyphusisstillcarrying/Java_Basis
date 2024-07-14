package src.implementation.methods;

import java.util.Scanner;

public class stringexample {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String naam = scn.nextLine();

        String personalized = myGreet(naam); 
        System.out.println(personalized); 
      // we also have to define the function/method here (ie. myGreet()) as we are calling it in the above line.
    }
    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }
    
}

