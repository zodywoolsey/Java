/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Zody
 */
public class Movement extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 250);
        
        Button but = new Button();
        but.setText("Click here");
        but.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                RectanglePane.enlarge();
            }
        });
        
        ArrayList<Rectangle> rect = new ArrayList<>();
        
        for (int i = 0; i < 500; i++){
            rect.add(new Rectangle(10,10));
            rect.get(i).setTranslateX(500-Math.random()*1000);
            rect.get(i).setTranslateY(500-Math.random()*1000);
            rect.get(i).setFill(Color.BLACK);
            rect.get(i).setStroke(Color.RED);
            rect.get(i).setStrokeWidth(1);
            root.getChildren().add(rect.get(i));
        }
        
        
        root.getChildren().add(but);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    class RectanglePane extends StackPane{
        private Rectangle rectangle = new Rectangle(20,20);
        
        public RectanglePane() {
            getChildren().add(rectangle);
        }
        
        public void enlarge() {
            rectangle.setWidth(rectangle.getWidth()+5);
            rectangle.setHeight(rectangle.getWidth()+5);
        }
    }
    
}
