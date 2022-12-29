//Write a program to print all the values from 1 to 100 except multiples of 10.
package Day2;

public class Iterations1to100 {

    public static void main(String[] args)
    {
        for(int i=1;i<=100;i++)
        {
            if(i%10!=0)
                System.out.println(i);
        }
    }
}
