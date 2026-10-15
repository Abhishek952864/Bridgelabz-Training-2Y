package Recursion.Basics;

public class powerOfN {
    public static int pow(int n,int o){
        if(o==0){
            return 1;
        }
        return n*pow(n,(o-1));
    }
    static void main() {
        System.out.println(pow(5,4));

    }

}
