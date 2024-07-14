package src.implementation.methods;

public class swap {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println("before " + a + " " + b);
        swapper(x, y); // this is different from the a, b parameter in the function as this is a local scope and the a, b in the function is a global scope. 
        // therefore the values of x and y will remain same as the values are passed by value and not by reference.
        // to change the values we need arrays or objects.
        // in java there is only pass by value
        // only copy of the values are passed and not the actual values
        // therefore there is no change in the stored values of x and y
        System.out.println("after " + a + " " + b);
    }
    public static void swapper(int a, int b){
        int temp = b;
        b = a;
        a = temp;
        System.out.println("after the function ran at the local scope " + a + " " + b); // this is printing the swap result but if we check outside this function the values will remain same. as the values are passed by value and not by reference.which means the values are copied and not the actual values.
        
    }
    
}
