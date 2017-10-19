

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Interpolator;
import javafx.scene.Cursor;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;
import javafx.scene.shape.Rectangle;
import javafx.animation.PathTransition;
import javafx.geometry.Pos;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 *
 * @author Zody
 */
public class Squares extends Application {
    static Scanner input = new Scanner(System.in);
    static int zStat;
    static ArrayList<Rectangle> rect = new ArrayList<>();
    static ArrayList<PathTransition> paths = new ArrayList<>();
    static ArrayList<Circle> circles = new ArrayList<>();
    static int rectSize = 10;
    @Override
    public void start(Stage primaryStage) {
        primaryStage.initStyle(StageStyle.UNIFIED);
        
        Button but = new Button();
        Button play = new Button();
        
        StackPane root = new StackPane();
        Scene scene = new Scene(root,500,500);
        
        play.setText("Play");
        play.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               for (int i = 0; i < paths.size(); i++){
                   
                   paths.get(i).play();
               }
           }
        });
        
        but.setText("GO");
        but.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                for (int i = 0; i < rect.size(); i++){
                    root.getChildren().remove(rect.get(i));
                }
                rect.removeAll(rect);
                for (int i = 0; i < rectSize; i++){
                    rect.add(new Rectangle(10,10));
                    rect.get(i).setFill(Color.rgb((int)(100+Math.random()*154), (int)(100+Math.random()*154), (int)(100+Math.random()*154)));
                }
                for (int i = 0; i < rect.size(); i++){
                    rect.get(i).setTranslateX((scene.getWidth()/2)-Math.random()*scene.getWidth());
                    rect.get(i).setTranslateY((scene.getHeight()/2)-Math.random()*scene.getHeight());
                    if ( (rect.get(i).getTranslateX() < but.getTranslateX()+20 && rect.get(i).getTranslateX() > but.getTranslateX()-20) && (rect.get(i).getTranslateY() < play.getTranslateY()+20 && rect.get(i).getTranslateY() > but.getTranslateY()-20) ){
                        rect.remove(i);
                        i-=1;
                    }else{
                        root.getChildren().add(rect.get(i));
                        
                    }
                }
                
                paths.removeAll(paths);
                circles.removeAll(circles);
                
                for (int i = 0; i < rect.size(); i++){
                    
                    double hyp = Math.sqrt(Math.pow(rect.get(i).getTranslateX(), 2)+Math.pow(rect.get(i).getTranslateY(), 2));
                    
                    circles.add(new Circle());
                    
                    circles.get(i).setRadius(hyp);
                    
                    double rot;
                    
                    if (rect.get(i).getTranslateX() >= 0 && rect.get(i).getTranslateY() >= 0){
                        rot = (Math.atan(rect.get(i).getTranslateY()/rect.get(i).getTranslateX())*57.2958);
                        circles.get(i).setRotate(rot);
                    }else if (rect.get(i).getTranslateX() <= 0 && rect.get(i).getTranslateY() >= 0){
                        rot = (Math.atan(rect.get(i).getTranslateY()/Math.abs(rect.get(i).getTranslateX()))*57.2958);
                        circles.get(i).setRotate(rot+90);
                    }else if (rect.get(i).getTranslateX() <= 0 && rect.get(i).getTranslateY() <= 0){
                        rot = (Math.atan(Math.abs(rect.get(i).getTranslateY())/Math.abs(rect.get(i).getTranslateX()))*57.2958);
                        circles.get(i).setRotate(rot+180);
                    }else if (rect.get(i).getTranslateX() >= 0 && rect.get(i).getTranslateY() <= 0){
                        rot = (Math.atan(Math.abs(rect.get(i).getTranslateY())/rect.get(i).getTranslateX())*57.2958);
                        circles.get(i).setRotate(rot+270);
                    }
                    
                    paths.add(new PathTransition());
                    paths.get(i).setPath(circles.get(i));
                    paths.get(i).setDuration( Duration.millis( 5000 ) );
                    paths.get(i).setNode(rect.get(i));
                    paths.get(i).setCycleCount(1);
                    paths.get(i).setInterpolator(Interpolator.LINEAR);
                }
            }
        });
        
        but.translateXProperty().bind(scene.widthProperty().divide(2).subtract(30));
        but.translateYProperty().bind(scene.heightProperty().divide(2).subtract(scene.heightProperty().subtract(20)));
        
        play.translateXProperty().bind(but.translateXProperty());
        play.translateYProperty().bind(but.translateYProperty().add(30));
        
        root.getChildren().add(but);
        root.getChildren().add(play);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        but.setLayoutX(100);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
        

    
}
