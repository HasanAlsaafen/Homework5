
package homework5;


public class Rectangle extends Shape {
    private double width;
    private double hieght;
    private static int count;

    public Rectangle(double width, double hieght,Point StartPoint) {
        this.width = width;
        this.hieght = hieght;
        this.setPoint(StartPoint);
        count++;
    }

    public Rectangle() {
        count++;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHieght() {
        return hieght;
    }

    public void setHieght(double hieght) {
        this.hieght = hieght;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Rectangle.count = count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangle{");
        sb.append("width=").append(width);
        sb.append(", hieght=").append(hieght);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double perimeter() {
       
        return 2*(this.hieght+this.width);
    }
    @Override
    public double area()
    {
        return this.hieght*this.width;
    }
    
}
