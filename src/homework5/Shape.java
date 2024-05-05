
package homework5;


public abstract class  Shape implements Operation{
    private Point point;
    private static int count;

    public Shape() {
        count++;
    }

    public Shape(Point point) {
        this.point = point;
        count++;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Shape.count = count;
    }
    public abstract double perimeter();
   
    @Override
    public String toString() {
        return "Shape{" + "point=" + point + '}';
    }
    
          
    
    
}
