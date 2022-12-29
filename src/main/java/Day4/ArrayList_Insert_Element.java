/*
"Insert an element in the Array list
	Sample Input1: [4,6,7,9,1,2]
	Sample Input2: 3(position)
	Sample output: [4,6,3,7,9,1,2] (Adding any number in the 3rd position)"
 */
package Day4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Insert_Element {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=s.nextInt();

        ArrayList<Integer> arr=new ArrayList<Integer>(n);

        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++)
            arr.add(s.nextInt());

        System.out.println("Enter the number to insert: ");
        int num=s.nextInt();

        System.out.println("Enter the index to insert: ");
        int ind=s.nextInt();

        arr.add(ind-1,num);

        System.out.println("Element Inserted at "+(ind));
        System.out.println("ArrayList after insertion");
        for(Integer i:arr)
        {
            System.out.println(i);
        }


    }


}
