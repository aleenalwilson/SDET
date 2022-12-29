/*
"abstract class baseClass {

 public int test1() {
  System.out.println(""test1"");
  return 0;
 }

 abstract void test2();

}

class derivedAbstract extends TestAbstract {
 public int test1() {
  System.out.println(""test1"");
  return 0;
 }

}

Will the above class file compile correctly? If not, correct the above program"
 */

package Day4;

abstract class TestAbstract {

    public int test1() {
        System.out.println("test1");
        return 0;
    }

    abstract void test2();

}

class derivedAbstract extends TestAbstract {

    void test2()
    {
        System.out.println("test2");
    }



}

public class Abstraction2
{
    public static void main(String args[])
    {

        derivedAbstract s=new derivedAbstract();
        s.test1();
        s.test2();

    }
}
