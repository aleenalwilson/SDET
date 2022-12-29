/*
"Remove the duplicate Numbers?
                     Sample Input: 1454167
                     Sample output: 14567"
 */
//Can be used for both strings and numbers
package Day2;

import java.util.Scanner;

public class Remove_Duplicate_Numbers {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");

        String str=s.next();
        String st="";
        char ch;

        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(!st.contains(Character.toString(ch)))
                st=st+ch;
        }

        System.out.println(st);
    }
}
