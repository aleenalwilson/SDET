/*
"Sorting of an Array: Descending Order
Sample Input: 147892
Sample output: 987421"
 */
package Day3;

import java.util.Scanner;

public class Array_Sort_Descending {
    static int[] arr;
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=s.nextInt();

        arr=new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();

        array_sort_desc();
        System.out.println("Array after sorting: ");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }

    static void array_sort_desc()
    {
        int temp;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            if(arr[j]<arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}
