/*
"There are 3 containers. Each container contains the following value
  a. RED Container: 10 , 20 , 30
  b. BLUE Container: 11, 21, 31
  c. GREEN Container: 12, 22, 32

Write a program to do the following
  RED Container: 32,22,12 (Move Green Container to Red Container & in descending order)
  BLUE Container:  30,20,10 (Move Red Container to Blue Container & in descending order)
  GREEN Container:  31,21,11 (Move Blue Container to Green Container & in descending order)"
 */
package Day3;

import org.bouncycastle.util.Arrays;

import java.util.Scanner;

public class Array_Sort_Containers {
    static int[] arr;
    static int[] red ={10,20,30};
    static int blue[]={11,21,31};
    static int[] green ={12,22,32};
    public static void main(String[] args)
    {

        System.out.println("Move Green Container to Red Container & in descending order");
        int temp[]=green.clone();
        green=red.clone();
        red=temp.clone();
        array_sort_desc(red);
        System.out.println("Red Container: ");
        array_display(red);

        System.out.println("Move Red Container to Blue Container & in descending order");
        temp=green.clone();
        green=blue.clone();
        blue=temp.clone();
        array_sort_desc(blue);
        System.out.println("Blue Container: ");
        array_display(blue);

        System.out.println("Move Red Container to Blue Container & in descending order");
        System.out.println("Green Container: ");
        array_sort_desc(green);
        array_display(green);

    }


    static void array_sort_desc(int arr[])
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

    static void array_display(int[] arr)
    {
        System.out.println("Array after sorting: ");
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
