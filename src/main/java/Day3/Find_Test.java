/*
"Verify if the word test is present and if present print all the characters from ""test"" till the end of the line
Scenario 1:
                     Sample Input: Testing
                     Sample output: Testing
Scenario 2:
                     	Sample Input: Automation testing saves time
                     	Sample output: testing saves time
Scenario 3:
                     Sample Input: Automation
                     Sample output: ""Testing is not available"""
 */

package Day3;

import java.util.Scanner;

public class Find_Test {

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=s.nextLine();

        String word="test";

        int count=0;


        for(int i=0;i<str.length()-word.length()+1;i++)
        {
            if(word.equalsIgnoreCase(str.substring(i,i+word.length())))
                System.out.println(str.substring(i));

        }

        if(!str.contains(word))
            System.out.println("Testing is not available");


    }
}
