package Day4.p1;

public class Shapes {
    public double length=0;
    protected double width=0;
    protected double height=0;

    public Shapes(double length, double width, double height)
    {
        this.length=length;
        this.width=width;
        this.height=height;
    }
    public double calculate_area()
    {
        System.out.println("Calling calculate_area() inside Shapes");
        return (2*(length*width+width*height+length*height));
    }

    public double calculate_volume()
    {
        System.out.println("Calling calculate_volume() inside Shapes");
        return length*width*height;
    }
}