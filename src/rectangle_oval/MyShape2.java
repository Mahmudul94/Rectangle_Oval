/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle_oval;

import java.awt.*;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Shommow
 */
public abstract class MyShape2 {
    int x, y;
    Color color;

    public MyShape2(int x, int y, Color color){
        this.x=x;
        this.y=y;
        this.color=color;
    }


    public double getX(){ 
      return this.x; }
   public double getY(){ 
    return this.y; }
  public javafx.scene.paint.Color getColor(){
       java.awt.Color awtColor = this.color;
       int r = awtColor.getRed();
       int g = awtColor.getGreen();
       int b = awtColor.getBlue();
       int a = awtColor.getAlpha();
       double opacity = a / 255.0 ;
       javafx.scene.paint.Color fxColor = javafx.scene.paint.Color.rgb(r, g, b, opacity);
       return fxColor;
        
       
   }
   public void setX(int x){ 
       this.x = x; }
   public void setY(int y){ 
       this.y = y; }
   public void setColor(Color color){ 
       this.color = color; }
   

    @Override
   public String toString(){
return "The coordinate of X and Y is (" + getX() + "," + getY() + ") and the color is " + getColor();
}
   public void draw(GraphicsContext gc){
gc.setFill(getColor());
gc.fillRect(0, 0, this.x, this.y);
}
    
}
