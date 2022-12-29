/*
"Remove an element from the array list:
	Sample Input1: [4,6,7,8,9,2]
	Sample Input2:7
	Sample output: [4,6,8,9,2]"
 */
package Day4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Remove_Element {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=s.nextInt();

        ArrayList<Integer> arr=new ArrayList<Integer>(n);

        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++)
            arr.add(s.nextInt());

        System.out.println("Enter the number to delete: ");
        int num=s.nextInt();


        int f=arr.indexOf(num);

        if(arr.remove(Integer.valueOf(num)))
        {
            System.out.println("Element Removed from "+(f+1));
            System.out.println("ArrayList after deletion");
            for(Integer i:arr)
            {
                System.out.println(i);
            }
        }

        else
            System.out.println("Element Not Found");




    }


}
