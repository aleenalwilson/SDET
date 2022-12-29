/*
"Remove an element from the array:
	Sample Input1: [4,6,7,8,9,2]
	Sample Input2:7
	Sample output: [4,6,8,9,2]"
 */
package Day3;

import java.util.Scanner;

public class Array_Delete_Element {

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

        System.out.println("Enter the number to delete: ");
        int num=s.nextInt();

        int f=find_element(arr,num);

        if(f==-1)
            System.out.println("Element Not found ");
        else
        {
            System.out.println("Element found at "+(f+1));
            n=delete_element(arr,f);
            System.out.println("Array after deletion: ");
            for(int i=0;i<n;i++)
                System.out.println(arr[i]);
        }



    }

    public static int find_element(int[] arr, int num)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(num==arr[i])
            {

                return i;
            }
        }
        return -1;

    }

    public static int delete_element(int[] arr, int f)
    {
        for(int i=f;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        return arr.length-1;
    }
}
