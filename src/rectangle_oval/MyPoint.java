/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle_oval;

/**
 *
 * @author Shommow
 */
public class MyPoint {
    
    private int x;
    private int y;

    //Constructor: With parameters
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "("+this.x+","+this.y+")";
    }
    
}
