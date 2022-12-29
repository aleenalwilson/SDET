/*
"Insert an element in the Array
	Sample Input1: [4,6,7,9,1,2]
	Sample Input2: 3(position)
	Sample output: [4,6,3,7,9,1,2] (Adding any number in the 3rd position)"
 */
package Day3;

import java.util.Scanner;

public class Array_Insert_Element {

    static int[] arr=new int[50];

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=s.nextInt();


        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();

        System.out.println("Enter the element to be inserted: ");
        int num=s.nextInt();

        System.out.println("Enter the position where element is to be inserted: ");
        int pos=s.nextInt();

        n=insert_element(arr,n,num,pos-1);
        System.out.println("Array after insertion: ");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);


    }

    public static int insert_element(int[] arr, int n, int num, int f)
    {
        for(int i=n-1;i>=f;i--)
            arr[i+1]=arr[i];
        arr[f] = num;
        return n+1;
    }
}
