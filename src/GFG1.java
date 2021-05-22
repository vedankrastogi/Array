
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG1 {
    public static void main (String[] args)
    {
        //code

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0)
        {
            t--;
            int n=sc.nextInt();
            int d=sc.nextInt();
            int a[]=new int[n];

            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();

            // reversing the array and doing rotation

            reverse(a,0,d-1);
            reverse(a,d,n-1);
            reverse(a,0,n-1);

            for(int i=0;i<n;i++)
                System.out.print(a[i]+" ");
            System.out.println();



        }
    }

    static void reverse(int a[],int start,int end)
    {
        while(start<end)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }

}