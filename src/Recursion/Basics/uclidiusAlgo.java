package Recursion.Basics;

public class uclidiusAlgo {
    public static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);

    }
    public static int lcm(int x,int y){
        return (x/gcd(x,y))*y;
    }

    static void main() {
        System.out.println(gcd(12,18));
        System.out.println(lcm(12,18));
    }

}
