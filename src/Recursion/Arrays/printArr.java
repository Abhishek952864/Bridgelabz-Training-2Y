package Recursion.Arrays;

public class printArr {
    static void main() {
        int arr[]={1,2,4,56,78,90,245};
        printInc(arr,0);
        printDec(arr,0);
    }
    public static void printDec(int arr[],int i){
        if (i== arr.length){
            return;
        }
        printDec(arr,i+1);
        System.out.println(arr[i]);
    }
    public static void printInc(int arr[],int i){
        if(i==arr.length){
            return;
        }
        System.out.println(arr[i]);
        printInc(arr,i+1);

    }
}
