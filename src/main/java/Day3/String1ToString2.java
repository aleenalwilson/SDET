/*
"Str1 = "" t e s t ""; Str2 = ""test""
	Convert the value in Str1 to how it is in Str2"
 */
package Day3;

import java.util.Scanner;

public class String1ToString2 {

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string: ");

        String str=s.nextLine();

        String st=str.replaceAll(" ","");

        System.out.println(st);


    }

}
