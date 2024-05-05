
package homework5;


public class Circle extends Shape {
    
    private double radius;
    private static int count;

    public Circle() {
        count++;
    }

    public Circle(double radius,Point center) {
        this.radius = radius;
        this.setPoint(center);
        count++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Circle.count = count;
    }



    @Override
    public double perimeter() {
       
    return 2*Math.PI*this.radius;
    }
    public double diametere()
    {
        return 2*this.radius;
    }
    @Override
    public double area()
    {
        return Math.PI*radius*radius;
        
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + "center"+this.getPoint().toString()+'}';
    }
    
    
    
    
}
