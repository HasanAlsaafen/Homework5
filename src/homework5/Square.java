/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework5;

/**
 *
 * @author حسن
 */
public class Square extends Rectangle{
    private static int count;

    public Square(double width, double hieght, Point StartPoint) {
        super(width, hieght, StartPoint);
        count++;
    }

    public Square() {
        count++;
    }

   

   
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Square.count = count;
    }

    @Override
    public String toString() {
        return "Square{" + ", hieght=" + this.getHieght() +"width= "+this.getWidth()+"startPoint" +this.getPoint().toString()+'}';
    }

 
    
    
    
}
