/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle_oval;
import javafx.scene.canvas.GraphicsContext;
import java.awt.*;

/**
 *
 * @author Shommow
 */
class MyCircle extends MyShape2 {
    private double radius;
    private MyPoint p;
    public MyCircle(int x,int y, double radius, Color color) {
        super(x,y, color);
        this.radius = radius;
    }
    double getRadius() {
        return radius;
    }
    double getArea() {
        return (Math.PI) * Math.pow(getRadius(), 2);
    }
    double getPerimeter() {
        return (Math.PI) * (2 * getRadius());
    }
    public enum Colors {
        lightGrey,yellow,green,pink,cyan;

    }

    @Override
    public String toString() {
        return "Radius of the circle is  " + this.getRadius() + " with a perimeter of " + this.getPerimeter() +
                " and an area of " + this.getArea();
    }

    @Override
  public  void draw(GraphicsContext gc) {
        gc.setFill(super.getColor());
        gc.fillOval(p.getX(), p.getY(), getRadius(), getRadius());
    }





}