/*
"Printing the reverse of an array list
	Sample Input: [4,6,9,1,2]
	Sample output: [2,1,9,6,4]"
 */
package Day4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Reverse {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=s.nextInt();

        ArrayList<Integer> arr=new ArrayList<Integer>(n);

        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++)
            arr.add(s.nextInt());


        System.out.println("ArrayList in Reverse Order: ");
        for(Integer i:arr)
        {
            System.out.println(i);
        }


    }


}
