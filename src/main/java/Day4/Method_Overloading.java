/*
"class Maths
{

 int multiply(int a, int b){
  int c = a*b;
  return c;
 }

 float multiply(int a, int b){
  int c = a*b;
  return c.floatValue();
 }
}

Will the above class file compile correctly? If not, correct the above program"
 */
package Day4;

public class Method_Overloading {

    static int multiply(int a, int b)
    {
        int c = a*b;
        return c;
    }

    static float multiply(float a,float b)
    {
        float c = a*b;
        return c;
    }

    public static void main(String[] args)
    {
        System.out.println("Method Overloading");
        System.out.println("Multiply using Integer arguments: "+multiply(5,3));
        System.out.println("Multiply using Float arguments: "+ multiply(5.4f,3.7f));
    }
}
