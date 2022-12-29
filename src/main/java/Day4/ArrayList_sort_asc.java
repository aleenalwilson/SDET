/*
"Sorting of an Array list: Ascending Order
Sample Input: 147892
Sample output: 124789"
 */
package Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_sort_asc {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=s.nextInt();

        ArrayList<Integer> arr=new ArrayList<Integer>(n);

        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++)
            arr.add(s.nextInt());

        Collections.sort(arr);

        System.out.println("ArrayList after sort in ascending order: ");
        for(Integer i:arr)
        {
            System.out.println(i);
        }


    }


}
