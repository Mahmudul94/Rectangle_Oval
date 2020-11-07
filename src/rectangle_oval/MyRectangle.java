/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle_oval;

import java.awt.Color;
import java.awt.Graphics;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Shommow
 */
public class MyRectangle extends MyShape2 {
    
      double width;
      double height;
public MyRectangle(int x, int y, double width,double height, Color color) {
super(x,y,color);
this.width=width;
this.height=height;

}

public void setWidth(double width){ 
    this.width = width;
}
public void setHeight(double height){
    this.height = height; }
public double getWidth() {
    return width; } 
public double getHeight(){ 
    return height; }

public double area(){ 
    return  (width * height); }
public double perimeter(){ return 2.0 * (width + height); }

@Override
public String toString() {

  return "The Rectangle: Top left corner point: (" +  getX() + "," + getY() + ")"
                                  + " Width: " + width + " Height " + height 
                                  + " Perimeter " + perimeter() +  area();
}
public void draw(GraphicsContext gc){

 gc.setFill(super.getColor());
 gc.fillRect(super.getX(), super.getY(),getWidth(),getHeight());
}
 
    } 
    
    

