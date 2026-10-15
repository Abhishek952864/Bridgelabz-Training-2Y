package Recursion.Basics;

public class fibonacciSeries {
    public static int fact(int n){
        if(n<=1){
            return 1;
        }
        return fact(n-1)+fact(n-2);
    }
    static void main() {
        System.out.println(fact(5));
    }
}
