/*
 * By Zody Woolsey. Kinda. I found it in the textbook but I will change some things.
 */
package javaapplication1;

import javafx.application.Application;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author zodywoolsey
 */
public class ShowCircle extends Application {
    int EX = 5;
    int WHY = 5;
    //@Override
    @Override
    public void start(Stage primaryStage) {
        //Creates a pane
        Pane pane = new Pane();
        
        //Button
        Button butt = new Button("ok");
        butt.setTranslateX(50);
        butt.setTranslateY(200);
        
        // Creates a circle and sets its properties
        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(3));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        //line?
        Line line = new Line();
        line.setStartX(EX);
        line.setStartY(pane.getWidth()-(pane.getWidth()-50));
        //line.startXProperty().bind(pane.widthProperty().divide(50));
        //line.endXProperty().bind(pane.widthProperty().divide(1.1));
        line.setEndX(pane.getHeight());
        line.setEndY(pane.getWidth());
        
        pane.getChildren().add(circle);
        pane.getChildren().add(line);
        pane.getChildren().add(butt);
        
        //Create a scene and place it in the stage
        Scene scene = new Scene(pane,200,200);
        primaryStage.setTitle("Zody's First Graphic in Java!!!!!!!");
        primaryStage.setScene(scene);
        
        primaryStage.setHeight(500);//Sets window start height
        primaryStage.setWidth(500);//sets window start width
        
        primaryStage.setMaxHeight(1000);//sets max window height
        primaryStage.setMinHeight(300);//sets min widow height
        
        primaryStage.setMaxWidth(1000);//sets max window width
        primaryStage.setMinWidth(300);//sets min window width
        
        primaryStage.setOpacity(.5f);
        primaryStage.show();
        
    }
    public static void main(String[] args){
        for (int i = 0; i < 10; i++){
            
        }
        Application.launch(args);
    }
}
