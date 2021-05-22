import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void leftRotate(int arr[],int n,int d){

        for(int i=0;i<d;i++){
            int temp=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];

            }
            arr[n-1]=temp;
        }
    }
    public static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }



    public static void main (String[] args) {
       Scanner sc =  new Scanner(System.in);
       int T=sc.nextInt();
       for(int i=0;i<T;i++){

           int n=sc.nextInt();
           int d=sc.nextInt();
           int[] arr=new int[n];
           for(int j=0;j<n;j++){
               arr[j]=sc.nextInt();
           }
           GFG.leftRotate(arr,n,d);
           GFG.printArray(arr,n);

       }
    }
}
