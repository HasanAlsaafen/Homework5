
package homework5;

import java.util.ArrayList;
import java.util.Scanner;


public class Homework5 {

    
    public static void main(String[] args) {
        
        
        
     Scanner scan = new Scanner(System.in);
        ArrayList<Shape> arr = new ArrayList<>();
        while (true) {
            System.out.println("1. add circle\n"
                    + "2. add square/rectangle\n"
                    + "3. show counts\n"
                    + "4. edit shape\n"
                    + "5. show all shapes\n"
                    + "6. remove shape\n"
                    + "7. find similar shapes\n"
                    + "8. Exit");
            switch (scan.nextInt()) {
                case 1:
                    System.out.println("Enter radius: ");
                    double radius = scan.nextDouble();
                    System.out.println("Enter center: ");
                    Point center = new Point(scan.nextInt(), scan.nextInt());
                    Circle c = new Circle(radius, center);
                    arr.add(c);
                    break;
                case 2:
                    System.out.println("Enter width and height: ");
                    double width = scan.nextDouble();
                    double height = scan.nextDouble();
                    System.out.println("Enter starting point: ");
                    Point sp = new Point(scan.nextInt(), scan.nextInt());
                    if(width == height) {
                        Square s = new Square(width,width, sp);
                        arr.add(s);
                    } else {
                        Rectangle r = new Rectangle(width, height, sp);
                        arr.add(r);
                    }                    
                    break;
                case 3:
                    System.out.println("# of Shapes: " + Shape.getCount());
                    System.out.println("# of Circles: " + Circle.getCount());
                    System.out.println("# of Rectangles: " + Rectangle.getCount());
                    System.out.println("# of Sqaures: " + Square.getCount());
                    break;
                case 4:
                    System.out.println("Enter shape number: ");
                    int index = scan.nextInt()-1;
                    Shape shape = arr.get(index);
                    if(shape instanceof Circle) {
                        System.out.println("Enter new radius: ");
                        ((Circle) shape).setRadius(scan.nextDouble());
                        System.out.println("Enter center");
                        shape.setPoint(new Point(scan.nextInt(), scan.nextInt()));
                    } else if(shape instanceof Square) {
                        System.out.println("Enter width: ");
                        ((Square) shape).setWidth(scan.nextDouble());
                        System.out.println("Enter starting point: ");
                        shape.setPoint(new Point(scan.nextInt(), scan.nextInt()));
                    } else {
                        System.out.println("Enter height: ");
                        ((Rectangle) shape).setHieght(scan.nextDouble());
                        System.out.println("Enter width: ");
                        ((Rectangle) shape).setWidth(scan.nextDouble());
                        System.out.println("Enter starting point: ");
                        shape.setPoint(new Point(scan.nextInt(), scan.nextInt()));
                    }
                    break;
                case 5:
                    String type;
                    for (int i = 0; i < arr.size(); i++) {
                        shape = arr.get(i);
                        if(shape instanceof Circle/*or shape.getClass() == Circle.class*/)
                            type = "Circle";
                        else if(shape instanceof Square /*or shape.getClass() == Square.class*/)
                            type = "Square";
                        else
                            type = "Rectangle";
                        System.out.println((i+1) + "-" + type + ": " + shape.toString());
                    }
                    break;
                case 6:
                    System.out.println("Enter shape number: ");
                    index = scan.nextInt()-1;
                    arr.remove(index);
                    break;
                case 7:
                    System.out.println("Enter shape number: ");
                    index = scan.nextInt()-1;
                    shape = arr.get(index);
                    System.out.println("Similar shapes:");
                    for (int i = 0; i < arr.size(); i++) {
                        Shape s = arr.get(i);
                        if(s.equals(shape))
                            System.out.println((i+1) + ": " + s.toString());
                    }
                    break;
                case 8: 
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }    
    
}
