/*
"Write a program for String reverse?
                     		Sample Input:	Program
                     		Sample output:	margorp"
 */
package Day2;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string: ");

        StringBuffer str=new StringBuffer(s.nextLine());

        System.out.println("Reversed String: "+str.reverse());
    }
}
