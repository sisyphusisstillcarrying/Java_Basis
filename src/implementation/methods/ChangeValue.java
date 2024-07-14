package src.implementation.methods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {

        //we either pass value of the variable (ie. a copy of it. temp change) or the variable itself to the function/method (actual data change)

        int[] arr = {1, 2, 3, 4, 5};
        change(arr);
        System.out.println(Arrays.toString(arr));
         // this will print 99 as the value of the first element of the array is changed to 99.

        //Arrays.toString(arr) is used to print the array as a string.
    }
    static void change(int[] nums){
        nums[0] = 99; // this change will persist and will be in the heap memory.
    }
    // scope of variable only begins when we initialize it
    // int n; it is declared but not initialized
    // int n = 5; it is declared and initialized
    // n = 5; it is initialized but not declared
}
