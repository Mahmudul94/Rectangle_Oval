/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle_oval;

import java.awt.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Rectangle_Oval extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       
        StackPane pane = new StackPane();
        Scene scene = new Scene(pane, 600, 400);
        Canvas canvas = new Canvas(600,400);
        GraphicsContext gc = canvas.getGraphicsContext2D();
         MyShape2 shape1 = new MyShape2(600, 400, Color.WHITE) {};
         shape1.draw(gc);
    
        
         MyRectangle rectangle1 = new MyRectangle(200,140,265,170,Color.lightGray);
         rectangle1.draw(gc);
         
         
        MyOval oval1 = new MyOval(200, 140, 265,170, Color.green,true);
        oval1.draw(gc);
        
        MyRectangle rectangle2 = new MyRectangle(237,164,190,120,Color.MAGENTA);
        rectangle2.draw(gc);
         
        MyOval oval2 = new MyOval(237, 164, 190,120, Color.blue,true);
        oval2.draw(gc);
        
        MyRectangle rectangle3 = new MyRectangle(259,184,142,80,Color.PINK);
        rectangle3.draw(gc);
        
        MyOval oval3 = new MyOval(259,184,142,80, Color.YELLOW,true);
        oval3.draw(gc);
        
         MyLine2 line1 = new MyLine2(0, 600, 0, 400, Color.BLACK);
         line1.draw(gc);
        
        pane.getChildren().addAll(canvas);
        primaryStage.setTitle("MyShape");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
