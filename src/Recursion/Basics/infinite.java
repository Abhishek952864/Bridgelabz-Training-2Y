package Recursion.Basics;

public class infinite {
    public static boolean inf(int n){
        inf(n+1);
        return false;
    }

    static void main() {
        System.out.println(inf(5));
    }
}
