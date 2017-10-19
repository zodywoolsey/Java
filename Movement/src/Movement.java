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
import javafx.animation.TranslateTransition;
import javafx.util.Duration;

/**
 *
 * @author Zody
 */
public class Movement extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 250);
        
        ArrayList<Rectangle> rect = new ArrayList<>();
        
        for (int i = 0; i < 1; i++){
            rect.add(new Rectangle(10,10));
            rect.get(i).setTranslateX(-500);
            rect.get(i).setTranslateY(100);
            rect.get(i).setFill(Color.BLACK);
            rect.get(i).setStroke(Color.RED);
            rect.get(i).setStrokeWidth(1);
            root.getChildren().add(rect.get(i));
        }
        
        Button but = new Button();
        but.setText("Click here");
        but.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                TranslateTransition[] T = new TranslateTransition[1];
                T[0].setDuration(Duration.millis(1000));
                T[0].setNode(rect.get(0));
                T[0].setByX(500);
                T[0].setCycleCount(2);
                T[0].setAutoReverse(false);
                
                T[0].play();
            }
        });
        
      
        
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
    
}
