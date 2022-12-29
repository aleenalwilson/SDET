/*
"Write a program for String reverse?
                     		Sample Input:	Program
                     		Sample output:	margorp"
 */
package Day2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string: ");

        String st=s.nextLine();
        StringBuffer str=new StringBuffer(st);
        str.reverse();

        if(st.equalsIgnoreCase(String.valueOf(str)))
            System.out.println("Yes");
        else System.out.println("No");
    }
}
