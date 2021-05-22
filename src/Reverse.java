import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of element you want to enter in array");
        int a=sc.nextInt();
        int [] arr=new int[a];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter element");
            int number=sc.nextInt();
            arr[i]=number;
        }
        System.out.println("the array is :");

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] );
        }
        System.out.println();
        System.out.println("the reversed array is :");
       for (int i=arr.length-1;i>=0;i--){
           System.out.print(arr[i]);
       }
    }
}
