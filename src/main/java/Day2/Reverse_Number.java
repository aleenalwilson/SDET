/*
"Write a code for reversing the number?
                    Sample Input: 12346
                    Sample output: 64321"
 */
package Day2;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");

        StringBuffer str=new StringBuffer(s.next());

        System.out.println("Reversed Number: "+str.reverse());
    }
}
