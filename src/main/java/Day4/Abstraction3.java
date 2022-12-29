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

 public int test2(){
  System.out.println(""test2"");
  return 0;
 }
}

Will the above class file compile correctly? If not, correct the above program"
 */
package Day4;

abstract class baseClass {

    public int test1() {
        System.out.println("test1");
        return 0;
    }

    abstract void test2();

}

class Derived_Abstract extends baseClass {
    public int test1() {
        System.out.println("test1");
        return 0;
    }

    public void test2(){
        System.out.println("test2");
    }
}

public class Abstraction3 {

    public static void main(String args[])
    {

        Derived_Abstract d=new Derived_Abstract();
        d.test1();
        d.test2();

    }
}
