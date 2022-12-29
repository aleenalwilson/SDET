//Write a Java program to print the factorial of a given number
package Day1;

import java.util.Scanner;

public class Iterations_Factorial {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=s.nextInt();
        int n=1;
        if(num==0)
            System.out.println("Factorial of "+num+": 1");
        else
        {
            for(int i=1;i<=num;i++)
            {
                n=n*i;
            }
            System.out.println("Factorial of "+num+": "+n);
        }


    }
}
