/*
"Identify specific position of an element in an array?
	Sample Input1: [4,6,7,8,9,2]
	Sample Input2: 2
	Sample output: 6"
 */
package Day3;

import java.util.Scanner;

public class Array_Find_Index {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=s.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();

        System.out.println("Enter the number to search: ");
        int num=s.nextInt();

        int f=find_element(arr,num);

        if(f==-1)
            System.out.println("Element Not found ");
        else
            System.out.println("Element found at "+(f+1));


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
}
