/*
"Identify specific position (index+1) of an element in an array list
	Sample Input1: [4,6,7,8,9,2]
	Sample Input2: 2
	Sample output: 6"
 */
package Day4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Find_Index {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=s.nextInt();

        ArrayList<Integer> arr=new ArrayList<Integer>(n);

        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++)
            arr.add(s.nextInt());

        System.out.println("Enter the number to search: ");
        int num=s.nextInt();


        int f=arr.indexOf(num);

        if(f==-1)
            System.out.println("Element Not found ");
        else
            System.out.println("Element found at "+(f+1));


    }


}
