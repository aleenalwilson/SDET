/*
"Base class:

package p1;

class shapes{

 public double length = 0
 protected double width =0;
 double height =0;

}

Create sub-class Cuboid at both inside same Package p1 & external package p2 inheriting shapes class to derive area & volume.
 Cuboid Area: 2(lb+bw+wh)
 Cuboid Volume: l * w * h"
 */
//Create the Overridden methods volume & area methods in the "Cuboid" class.

package Day4;

import Day4.p1.Cuboid;
public class Inheritance_and_Overriding {

    public static void main(String[] args)
    {
        Cuboid c1=new Cuboid(10,25,30);
        System.out.println("Area: "+c1.calculate_area());
        System.out.println("Volume: "+c1.calculate_volume());


        Day4.p2.Cuboid c2=new Day4.p2.Cuboid(10,25,30);
        System.out.println("Area: "+c2.calculate_area());
        System.out.println("Volume: "+c2.calculate_volume());
    }
}
