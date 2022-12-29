/*
"Find the duplicate in the String?
                     		Sample Input: aueatsupt:
                     		Sample output: a, u, t"
 */
//Can be used for both strings and numbers
package Day2;

import java.util.Scanner;

public class Find_Duplicate {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string: ");

        String str=s.next();
        String st="";
        char ch;

        System.out.println("Duplicates are: ");
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(!st.contains(Character.toString(ch)))
                st=st+ch;
            else
                System.out.println(ch);
        }

    }
}
