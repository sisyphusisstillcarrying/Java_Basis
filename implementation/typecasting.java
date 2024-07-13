package implementation;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {

        //AUTO/IMPLICIT TYPE CASTING
        Scanner scn = new Scanner(System.in); 
        float n1 = scn.nextInt();
        //int n3 = scn.nextFloat(); cannot convert float to int
        float n2 = scn.nextFloat();
        float sum = n1 + n2;
        System.out.println(sum);
        // right hand side is compared to LHS and if it is of higher type it is converted to that type.
        // and float is higher type than int so it is converted to float.and it is also compatable with float.

        //EXPLICIT TYPE CASTING 
        //(narrowing conversation in this case as we are reducing the scope of float to int but we can also do vise versa but it is not recommended as implicit covers it)
        int num = (int)(65.65f);
        System.out.println(num);

        //automatic type promotion in expression

        int a = 257;
        byte b = (byte)(a); // 257 % 256 = 1 as the byte range is from -128 to 127
        System.out.println(b);

        byte k = 40;
        byte j = 50;
        byte c = 100;
        int d = k * j / c; // as the byte is converted to int and then the operation is performed. because byte cannot handle j*k as it is 40*50 as it is out of range.therefore java promotes it to int.
        System.out.println(d); 

        // JAVA follows unicode system for characters. there we have a lot more range that ascii.While ASCII only provides mapping for up to 256 characters, Unicode supports over 149,000 characters

        //floating point error defination is the error that occurs when you try to represent a number that cannot be represented exactly in the computer's binary system. 

        byte b = 42; 
        char c = 'a'; 
        short s = 1024; 
        int i = 50000; 
        float f = 5.67f; 
        double d = 0.1234; 
        double result = (f*b)+(i/c)-(d*s); 
        System.out.println((f*b)+" "+(i/c)+" "+" "+(d*s));
        // float + int - double = double as double is the highest type in the expression. 
        System.out.println(result);






    }
    
}
