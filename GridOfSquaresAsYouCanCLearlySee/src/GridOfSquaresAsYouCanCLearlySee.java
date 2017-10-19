/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import javafx.animation.Interpolator;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Point3D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.animation.PathTransition;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 *
 * @author Zody
 */
public class GridOfSquaresAsYouCanCLearlySee extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 800, 800);
        
        ArrayList<Rectangle> rect = new ArrayList<>();
        
        rect.add(new Rectangle(10,10));
        
        PathTransition path = new PathTransition();
        path.setPath(new Circle(50));
        path.setDuration(Duration.millis(100*50));
        path.setInterpolator(Interpolator.LINEAR);
        path.setNode(rect.get(0));
        path.setCycleCount(100);
        path.play();
        
        for (int i = 0; i < rect.size(); i++){
            root.getChildren().add(rect.get(i));
        }
        
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
