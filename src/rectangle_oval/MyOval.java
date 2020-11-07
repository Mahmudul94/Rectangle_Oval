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
public class MyOval extends MyShape2 {
    
   private int  x2, y2;
   private int x1,y1;
   // private Color myColor;
  //  private boolean fill; // to fill or not
    private boolean fill;
   

    public MyOval(int x1, int y1, int x2, int y2, Color color,boolean fill) {
       super(x1,y1,color);
     
       
        this.x2 = x2;
        this.y2 = y2;
        this.fill=fill;
            
    }

    // sets/gets
 
    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setColor(Color color) {
        this.color = color;
    }

  


    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    } // now the gets for calculated values
    public int getUpperLeftX() {
// defined as the minimum of x1 and x2
        return Math.min(x1, x2);
    }

    public int getUpperLeftY() {
// defined as the minimum of y1 and y2
        return Math.min(y1, y2);
    }

    public int getWidth() {
        return Math.abs(x1 - x2);
    }

    public int getHeight() {
        return Math.abs(y1 - y2);
    }

    // draw the shape using calculated values
    public void draw(Graphics g) {
        g.setColor(color);
    }

// draw the right type of shape
  public void draw(GraphicsContext GC){

  GC.setFill(super.getColor()); 
  GC.fillOval(super.getX(), super.getY(),
                    getWidth(), getHeight()); 
}
}
