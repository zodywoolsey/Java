

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
import javafx.scene.shape.Polygon;
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
    
    //All of these are defined as static so that I don't have to think much about the scope.
    static Scanner input = new Scanner(System.in);//input
    static int zStat;//unused but left in just in case I need it
    static ArrayList<Rectangle> rect = new ArrayList<>();//list to create how ever many rectangles I want
    static ArrayList<PathTransition> paths = new ArrayList<>();//arraylist to create path transitions to go along with the rectangles
    static ArrayList<Circle> circles = new ArrayList<>();//arraylist of circles to go with the paths
    static int rectSize;//easy to find spot to change the number of generated squares
    @Override//Idk
    public void start(Stage primaryStage) {
        
        System.out.println("How many rects do you want? ");//print for input
        rectSize = input.nextInt();//input for testing
        
        //This line was used for some random testing
        primaryStage.initStyle(StageStyle.UNIFIED);
        
        //Defines the two needed buttons. I could have used a list to reduce line numbers
        Button but = new Button();
        Button play = new Button();
        Button set = new Button();
        Button coords = new Button();
        
        //defines the pane and scene early so that the data can be referenced and changed easily
        StackPane root = new StackPane();
        Scene scene = new Scene(root,500,500);
        
        //This button is a separated play button to try to reduce some of the initial stutter of moving massive numbers of object on screen at once.
        play.setText("Play");
        play.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               for (int i = 0; i < paths.size(); i++){
                   
                   //This loop goes for the size of the path arraylist and then plays the animations assigned to each rect
                   paths.get(i).play();
                   
               }
               
               
           }
        });
        
        set.setText("set");
        set.setTranslateX(50);
        set.setTranslateY(50);
        set.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ecent) {
                for (int i = 0; i < rect.size(); i++){
                    
                    double hyp = Math.sqrt(Math.pow(rect.get(i).getTranslateX(), 2)+Math.pow(rect.get(i).getTranslateY(), 2));
                    System.out.printf("x: %f \ny: %f \nhyp: %f\n", rect.get(i).getTranslateX(), rect.get(i).getTranslateY(), hyp);
                    
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
        
        root.getChildren().add(coords);
        coords.setText("coords");
        coords.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               
               for (int i = 0; i < rect.size(); i++){
                   System.out.printf("x: %f \ny: %f\n", rect.get(i).getTranslateX(), rect.get(i).getTranslateY());
               }
               
           }
        });
        
        //This button creates all the squares and then assigns each of them a circle path based on their location
        but.setText("GO");
        but.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                //These two remove all rects from the arrays they exist in for memory optimization
                root.getChildren().removeAll(rect);
                rect.removeAll(rect);
                
                //loop to create the rects and set a random color
                for (int i = 0; i < rectSize; i++){
                    rect.add(new Rectangle(10,10));
                    
                    
                    
//                    rect.get(i).setFill(Color.rgb((int)(100+Math.random()*154), (int)(100+Math.random()*154), (int)(100+Math.random()*154)));
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
                    
                    //Changing color based on quadrant
                    if (rect.get(i).getTranslateX() >= 0 && rect.get(i).getTranslateY() >= 0){//turns out the math for quad 1 is actually quad 4
//                        rect.get(i).setFill(Color.RED);
                        root.getChildren().remove(rect.get(i));
                        rect.remove(i);
                    }else if (rect.get(i).getTranslateX() <= 0 && rect.get(i).getTranslateY() >= 0){//holds true where this is math for quad 3
//                        rect.get(i).setFill(Color.BLUE);
                        root.getChildren().remove(rect.get(i));
                        rect.remove(i);
                    }else if (rect.get(i).getTranslateX() <= 0 && rect.get(i).getTranslateY() <= 0){//quad 2
//                        rect.get(i).setFill(Color.GREEN);
                        root.getChildren().remove(rect.get(i));
                        rect.remove(i);
                    }else if (rect.get(i).getTranslateX() >= 0 && rect.get(i).getTranslateY() <= 0){//quad 1
                        rect.get(i).setFill(Color.BLACK);
                    }
                }
                
                paths.removeAll(paths);
                circles.removeAll(circles);
                
                
            }
        });
        
        but.translateXProperty().bind(scene.widthProperty().divide(2).subtract(30));
        but.translateYProperty().bind(scene.heightProperty().divide(2).subtract(scene.heightProperty().subtract(20)));
        
        play.translateXProperty().bind(but.translateXProperty());
        play.translateYProperty().bind(but.translateYProperty().add(30));
        
        root.getChildren().add(but);
        root.getChildren().add(play);
        root.getChildren().add(set);
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
