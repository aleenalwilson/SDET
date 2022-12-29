/*
"public class baseClass {

 int var1;
 static int var2;

 public void print1(){
  System.out.println(var1);
  System.out.println(var2);
 }

 public void print2(){
  System.out.println(var1);
  System.out.println(var2);
 }

}

Will the above class file compile correctly? If not, correct the above program"
 */
package Day4;

public class StaticClass1 {
    int var1=1;
    static int var2=1;

    public void print1(){
        System.out.println(var1);
        System.out.println(var2);
    }

    public void print2(){
        System.out.println(var1);
        System.out.println(var2);
    }

    public static void main(String[] args)
    {
        StaticClass1 s1=new StaticClass1();
        StaticClass1 s2=new StaticClass1();

        System.out.println("Object 1");
        s1.print1();
        var2++;
        s1.print2();

        System.out.println("Object 2");
        s2.print1();
        s2.var1++;
        var2++;
        s2.print2();

        //The change in var2 value is reflected in both objects but var1 is not reflected.
        System.out.println("Object 1");
        s1.print1();

    }

}
