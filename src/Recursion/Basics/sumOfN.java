package Recursion.Basics;

public class sumOfN {
    public static int sum(int n){
        //BASE COND>>
        if(n==0) {
            return 0;
        }
        //RECURSIVE COND>>
        else{
            return n+sum(n-1);
        }

    }

    static void main() {
        System.out.println("The sum of first N numbers is:- "+sum(5));
    }
}
