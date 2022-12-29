/*
"Write a program that will read a sequence of positive real numbers entered by the user, Store in a array and will print the same numbers in sorted order from smallest to largest.

User can enter any numbers but print only the positive real numbers. User can terminate the inputs by entering any special character."
 */
package Day4;

import java.util.Scanner;

public class Positive_Real_Numbers {

    static int n;
    static int[] arr =new int[30];
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        String st;

        try
        {
            do
            {
                st=s.next();
                System.out.println((int)st.charAt(0));
                if((int)st.charAt(0)>=48 && (int) st.charAt(0)<=57)
                {
                    arr[n++]=Integer.parseInt(st);
                }

            }while((int)st.charAt(0)>=48 && (int) st.charAt(0)<=57);
        }
        catch (Exception e)
        {
            System.out.println("Entered Non Positive Real Numbers");
        }
        finally
        {
            array_sort();

        }
    }

    static void array_sort()
    {
        int temp;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
        }
        System.out.println("Array after sorting: ");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}
