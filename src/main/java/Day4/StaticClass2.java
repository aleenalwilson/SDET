/*
"public class classCounter{

 int var1, var2;

 public void print1(){
  System.out.println(var1);
  System.out.println(var2);
 }

}

Do the necessary modifications in the above class so that we will be able to find out the number of objects that has been created of this class, ""classCounter"""
 */
package Day4;

class classCounter{

    int var1, var2;
    static int counter=0;

    classCounter()
    {
        counter++;
    }

    public void print1(){
        System.out.println(var1);
        System.out.println(var2);
    }

}
public class StaticClass2 {

    public static void main(String[] args)
    {
        classCounter c1=new classCounter();
        c1.print1();
        classCounter c2=new classCounter();
        c2.print1();
        classCounter c3=new classCounter();
        c3.print1();

        System.out.println("Number of Objects created: "+classCounter.counter);
    }
}
