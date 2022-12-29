/*
"Write a program to reverse the characters in each of the word:
                    		Sample Input: 	This is an easy Java Program
                    	Sample output: 	sihT si na ysae avaJ margorP"
 */
package Day2;

import java.util.Scanner;

public class Reverse_Words {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=s.nextLine();
        //String str="This is an easy Java Program";
        String[] st =str.split(" ");
        String word;
        for (String i : st) {
            word = i;
            for (int j = word.length() - 1; j >= 0; j--) {
                System.out.print(word.charAt(j));
            }
            System.out.print(" ");

        }
    }
}
