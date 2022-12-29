/*
 Create a ""multiply"" method in the derived class, ""Maths_Sub"" which overloads ""multiply"" method that is defined in the base class - ""Maths"""
 */

package Day4;

class Maths
{

    static int multiply(int a, int b)
    {
        int c = a*b;
        return c;
    }

}

public class Maths_Sub extends Maths
{
    static float multiply(float a, float b)
    {
        float c = a*b;
        return c;
    }

    public static void main(String[] args)
    {
        System.out.println("Method Overloading- Maths_Subs");
        System.out.println("Multiply method in Maths Class: "+multiply(5,3));
        System.out.println("Multiply method in Maths_Subs Class: "+ multiply(5.4f,3.7f));
    }



}

