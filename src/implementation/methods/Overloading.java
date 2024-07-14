package src.implementation.methods;

public class Overloading {
    public static void main(String[] args) {
//        fun(67);
//this happens at compile time
//there is also a concept of method overriding which happens at runtime
//        fun("Kunal Kushwaha");
int ans = sum(3, 4, 78);
System.out.println(ans);
}

static int sum(int a, int b) {
return a + b;
}

static int sum(int a, int b, int c) {
return a + b + c;
}
// even main method can be overloaded
// we can have multiple methods with the same name but different parameters ( either no of parameters or type of parameters)
// this is called method overloading

static void fun(int a) {
System.out.println("first one");
System.out.println(a);
}

static void fun(String name) {
System.out.println("Second one");
System.out.println(name);
    }
    
}
