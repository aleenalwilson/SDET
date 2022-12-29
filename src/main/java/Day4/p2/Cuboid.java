package Day4.p2;

import Day4.p1.Shapes;

public class Cuboid extends Shapes {

    double area;
    double volume;

    public Cuboid(double length, double width, double height)
    {
        super(length,width,height);
        System.out.println("Calling functions inside p2.Cuboid");
    }
    public double calculate_area()
    {
        area= (2*(length*width+width*height+length*height));
        return area;
    }

    public double calculate_volume()
    {
        volume= length*width*height;
        return volume;
    }

}
