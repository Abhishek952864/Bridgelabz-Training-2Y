package Recursion.Basics;

public class factorial {
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }

            return n*factorial(n-1);

    }

    static void main() {
        System.out.println("Factorial of a number is:- " +factorial(8));
    }
}
