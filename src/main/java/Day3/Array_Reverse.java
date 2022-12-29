/*
"Printing the reverse of an array
	Sample Input: [4,6,9,1,2]
	Sample output: [2,1,9,6,4]"
 */
package Day3;

import java.util.Scanner;

public class Array_Reverse {

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=s.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();

        System.out.println("Array in Reverse Order: ");
        for(int i=n-1;i>=0;i--)
            System.out.println(arr[i]);
    }
}
