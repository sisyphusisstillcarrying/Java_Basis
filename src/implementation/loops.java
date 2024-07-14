package implementation; //package Java_Basis.implementation; should also be correct as it is the path of the file. and . is used to go to the subfolder.

public class loops {
    public static void main(String[] args) {

        //if else
        int a = 10;
        if(a == 10){
            System.out.println("a is 10");
        }

        //while loop
        int count = 1;
        while(count != 5){
            System.out.println(count);
            count++;
        } // use while when you dont know the number of iterations the loop needs to run.

        //for loop
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
        // use the for loop when you know the number of iterations the loop needs to run.
    }
    
}
