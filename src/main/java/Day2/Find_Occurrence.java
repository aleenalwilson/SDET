/*
"Write a program for occurrence of word?
Scenario 1:
                     		input1: Automation testing is good way of testing
                     		input2: testing
                     		Sample output: 2
Scenario 2:
                     input1: Automation testing is good way of testing
                     		input2: Automation
                     		Sample output: 1"
 */

package Day2;

import java.util.Scanner;

public class Find_Occurrence {

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=s.nextLine();

        System.out.println("Enter the term to count occurrence: ");
        String word=s.next();

        int count=0;


        for(int i=0;i<str.length()-word.length()+1;i++)
        {
            if(word.equals(str.substring(i,i+word.length())))
                count++;

        }
        System.out.println("Number of occurrences: "+count);

    }
}
