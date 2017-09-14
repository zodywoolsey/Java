/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author zodywoolsey
 */
public class SeriesOfButtons extends Application {
    @Override
    public void start(Stage primaryStage) {
        //1111111111111111111111111111111111111111111111111111111111111111111111
        Button onexone = new Button();
        onexone.setTranslateX(1);
        onexone.setText("1X1");
        onexone.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                oneXone();
            }
        });
        //1111111111111111111111111111111111111111111111111111111111111111111111
        Button onextwo = new Button();
        onextwo.setTranslateX(1);
        onextwo.setText("1X2");
        onextwo.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                oneXtwo();
            }
        });
        //1111111111111111111111111111111111111111111111111111111111111111111111
        Button onexthree = new Button();
        onexthree.setTranslateX(1);
        onexthree.setText("1X3");
        onexthree.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                oneXthree();
            }
        });
        //1111111111111111111111111111111111111111111111111111111111111111111111
        Button onexfour = new Button();
        onexfour.setTranslateX(1);
        onexfour.setText("1X4");
        onexfour.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                oneXfour();
            }
        });
        //2222222222222222222222222222222222222222222222222222222222222222222222
        Button twoxone = new Button();
        
        twoxone.setText("2X1");
        twoxone.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                twoXone();
            }
        });
        //2222222222222222222222222222222222222222222222222222222222222222222222
        Button twoxtwo = new Button();
        
        twoxtwo.setText("2X2");
        twoxtwo.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                twoXtwo();
            }
        });
        //2222222222222222222222222222222222222222222222222222222222222222222222
        Button twoxthree = new Button();
        
        twoxthree.setText("2X3");
        twoxthree.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                twoXthree();
            }
        });
        //2222222222222222222222222222222222222222222222222222222222222222222222
        Button twoxfour = new Button();
        
        twoxfour.setText("2X4");
        twoxfour.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                twoXfour();
            }
        });
        //3333333333333333333333333333333333333333333333333333333333333333333333
        Button threexone = new Button();
        
        threexone.setText("3X1");
        threexone.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                threeXone();
            }
        });
        //3333333333333333333333333333333333333333333333333333333333333333333333
        Button threextwo = new Button();
        
        threextwo.setText("3X2");
        threextwo.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                threeXtwo();
            }
        });
        //3333333333333333333333333333333333333333333333333333333333333333333333
        Button threexthree = new Button();
        
        threexthree.setText("3X3");
        threexthree.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                threeXthree();
            }
        });
        //3333333333333333333333333333333333333333333333333333333333333333333333
        Button threexfour = new Button();
        
        threexfour.setText("3X4");
        threexfour.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                threeXfour();
            }
        });
        //4444444444444444444444444444444444444444444444444444444444444444444444
        Button fourxone = new Button();
        
        fourxone.setText("4X1");
        fourxone.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                fourXone();
            }
        });
        //4444444444444444444444444444444444444444444444444444444444444444444444
        Button fourxtwo = new Button();
        
        fourxtwo.setText("4X2");
        fourxtwo.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                fourXtwo();
            }
        });
        //4444444444444444444444444444444444444444444444444444444444444444444444
        Button fourxthree = new Button();
        
        fourxthree.setText("4X3");
        fourxthree.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                fourXthree();
            }
        });
        //4444444444444444444444444444444444444444444444444444444444444444444444
        Button fourxfour = new Button();
        
        fourxfour.setText("4X4");
        fourxfour.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                fourXfour();
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(onexone);
        root.getChildren().add(onextwo);
        root.getChildren().add(onexthree);
        root.getChildren().add(onexfour);
        root.getChildren().add(twoxone);
        root.getChildren().add(twoxtwo);
        root.getChildren().add(twoxthree);
        root.getChildren().add(twoxfour);
        root.getChildren().add(threexone);
        root.getChildren().add(threextwo);
        root.getChildren().add(threexthree);
        root.getChildren().add(threexfour);
        root.getChildren().add(fourxone);
        root.getChildren().add(fourxtwo);
        root.getChildren().add(fourxthree);
        root.getChildren().add(fourxfour);
        
        Scene scene = new Scene(root, 300, 250);
        
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
    
    public static void oneXone(){
        
    }
    public static void oneXtwo(){
        
    }
    public static void oneXthree(){
        
    }
    public static void oneXfour(){
        
    }
    public static void twoXone(){
        
    }
    public static void twoXtwo(){
        
    }
    public static void twoXthree(){
        
    }
    public static void twoXfour(){
        
    }
    public static void threeXone(){
        
    }
    public static void threeXtwo(){
        
    }
    public static void threeXthree(){
        
    }
    public static void threeXfour(){
        
    }
    public static void fourXone(){
        
    }
    public static void fourXtwo(){
        
    }
    public static void fourXthree(){
        
    }
    public static void fourXfour(){
        
    }
    
}
