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
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Timeline;

/**
 *
 * @author zodywoolsey
 */
public class SeriesOfButtons extends Application {
    //Defined all the buttons here so that they are global among this file to make setting the actions easier
    static Button onextwo = new Button();
    static Button onexone = new Button();
    static Button onexthree = new Button();
    static Button onexfour = new Button();
    static Button twoxone = new Button();
    static Button twoxtwo = new Button();
    static Button twoxthree = new Button();
    static Button twoxfour = new Button();
    static Button threexone = new Button();
    static Button threextwo = new Button();
    static Button threexthree = new Button();
    static Button threexfour = new Button();
    static Button fourxone = new Button();
    static Button fourxtwo = new Button();
    static Button fourxthree = new Button();
    static Button fourxfour = new Button();
    //Created timeline in hopes of making animations upon button click
    final Timeline timeLine = new Timeline();
    
    @Override
    public void start(Stage primaryStage) {
        //Created the size and spacing of the buttons
        double buttonSize = 30;
        double buttonSpace = 40;
        
        //1111111111111111111111111111111111111111111111111111111111111111111111
     
        onexone.setTranslateX((buttonSpace*0));
        onexone.setTranslateY((buttonSpace*0));
        onexone.setMinSize(buttonSize, buttonSize);
        onexone.setMaxSize(buttonSize, buttonSize);
        onexone.setText("[Start]");
        onexone.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                oneXone();
                //          TRANSLATE MANIPULATION FOR X
                onextwo.setTranslateX(onexone.getTranslateX()-((onexone.getTranslateX()-onextwo.getTranslateX())*1.01));
                onexthree.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-onexthree.getTranslateX())*1.01);
                onexfour.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-onexfour.getTranslateX())*1.01);
                
                twoxone.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-twoxone.getTranslateX())*1.01);
                twoxtwo.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-twoxtwo.getTranslateX())*1.01);
                twoxthree.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-twoxthree.getTranslateX())*1.01);
                twoxfour.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-twoxfour.getTranslateX())*1.01);
                
                threexone.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-threexone.getTranslateX())*1.01);
                threextwo.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-threextwo.getTranslateX())*1.01);
                threexthree.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-threexthree.getTranslateX())*1.01);
                threexfour.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-threexfour.getTranslateX())*1.01);
                
                fourxone.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-fourxone.getTranslateX())*1.01);
                fourxtwo.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-fourxtwo.getTranslateX())*1.01);
                fourxthree.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-fourxthree.getTranslateX())*1.01);
                fourxfour.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-fourxfour.getTranslateX())*1.01);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(onexone.getTranslateY()-((onexone.getTranslateY()-onextwo.getTranslateY())*1.01));
                onexthree.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-onexthree.getTranslateY())*1.01);
                onexfour.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-onexfour.getTranslateY())*1.01);
                
                twoxone.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-twoxone.getTranslateY())*1.01);
                twoxtwo.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-twoxtwo.getTranslateY())*1.01);
                twoxthree.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-twoxthree.getTranslateY())*1.01);
                twoxfour.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-twoxfour.getTranslateY())*1.01);
                
                threexone.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-threexone.getTranslateY())*1.01);
                threextwo.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-threextwo.getTranslateY())*1.01);
                threexthree.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-threexthree.getTranslateY())*1.01);
                threexfour.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-threexfour.getTranslateY())*1.01);
                
                fourxone.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-fourxone.getTranslateY())*1.01);
                fourxtwo.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-fourxtwo.getTranslateY())*1.01);
                fourxthree.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-fourxthree.getTranslateY())*1.01);
                fourxfour.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-fourxfour.getTranslateY())*1.01);
            }
        });
        //1111111111111111111111111111111111111111111111111111111111111111111111
//     
        onextwo.setTranslateX((buttonSpace*1));
        onextwo.setTranslateY((buttonSpace*0));
        onextwo.setMinSize(buttonSize, buttonSize);
        onextwo.setMaxSize(buttonSize, buttonSize);
        onextwo.setText("");
        onextwo.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                oneXtwo();
            }
        });
        //1111111111111111111111111111111111111111111111111111111111111111111111
       
        onexthree.setTranslateX((buttonSpace*2));
        onexthree.setTranslateY((buttonSpace*0));
        onexthree.setMinSize(buttonSize, buttonSize);
        onexthree.setMaxSize(buttonSize, buttonSize);
        onexthree.setText("");
        onexthree.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                oneXthree();
            }
        });
        //1111111111111111111111111111111111111111111111111111111111111111111111
      
        onexfour.setTranslateX((buttonSpace*3));
        onexfour.setTranslateY((buttonSpace*0));
        onexfour.setMinSize(buttonSize, buttonSize);
        onexfour.setMaxSize(buttonSize, buttonSize);
        onexfour.setText("");
        onexfour.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                oneXfour();
            }
        });
        //2222222222222222222222222222222222222222222222222222222222222222222222
     
        twoxone.setTranslateX((buttonSpace*0));
        twoxone.setTranslateY((buttonSpace*1));
        twoxone.setMinSize(buttonSize, buttonSize);
        twoxone.setMaxSize(buttonSize, buttonSize);
        twoxone.setText("");
        twoxone.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                twoXone();
            }
        });
        //2222222222222222222222222222222222222222222222222222222222222222222222
     
        twoxtwo.setTranslateX((buttonSpace*1));
        twoxtwo.setTranslateY((buttonSpace*1));
        twoxtwo.setMinSize(buttonSize, buttonSize);
        twoxtwo.setMaxSize(buttonSize, buttonSize);
        twoxtwo.setText("");
        twoxtwo.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                twoXtwo();
            }
        });
        //2222222222222222222222222222222222222222222222222222222222222222222222
       
        twoxthree.setTranslateX((buttonSpace*2));
        twoxthree.setTranslateY((buttonSpace*1));
        twoxthree.setMinSize(buttonSize, buttonSize);
        twoxthree.setMaxSize(buttonSize, buttonSize);
        twoxthree.setText("");
        twoxthree.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                twoXthree();
            }
        });
        //2222222222222222222222222222222222222222222222222222222222222222222222
      
        twoxfour.setTranslateX((buttonSpace*3));
        twoxfour.setTranslateY((buttonSpace*1));
        twoxfour.setMinSize(buttonSize, buttonSize);
        twoxfour.setMaxSize(buttonSize, buttonSize);
        twoxfour.setText("");
        twoxfour.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                twoXfour();
            }
        });
        //3333333333333333333333333333333333333333333333333333333333333333333333
       
        threexone.setTranslateX((buttonSpace*0));
        threexone.setTranslateY((buttonSpace*2));
        threexone.setMinSize(buttonSize, buttonSize);
        threexone.setMaxSize(buttonSize, buttonSize);
        threexone.setText("");
        threexone.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                threeXone();
            }
        });
        //3333333333333333333333333333333333333333333333333333333333333333333333
       
        threextwo.setTranslateX((buttonSpace*1));
        threextwo.setTranslateY((buttonSpace*2));
        threextwo.setMinSize(buttonSize, buttonSize);
        threextwo.setMaxSize(buttonSize, buttonSize);
        threextwo.setText("");
        threextwo.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                threeXtwo();
            }
        });
        //3333333333333333333333333333333333333333333333333333333333333333333333
        
        threexthree.setTranslateX((buttonSpace*2));
        threexthree.setTranslateY((buttonSpace*2));
        threexthree.setMinSize(buttonSize, buttonSize);
        threexthree.setMaxSize(buttonSize, buttonSize);
        threexthree.setText("");
        threexthree.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                threeXthree();
            }
        });
        //3333333333333333333333333333333333333333333333333333333333333333333333
        
        threexfour.setTranslateX((buttonSpace*3));
        threexfour.setTranslateY((buttonSpace*2));
        threexfour.setMinSize(buttonSize, buttonSize);
        threexfour.setMaxSize(buttonSize, buttonSize);
        threexfour.setText("");
        threexfour.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                threeXfour();
            }
        });
        //4444444444444444444444444444444444444444444444444444444444444444444444
      
        fourxone.setTranslateX((buttonSpace*0));
        fourxone.setTranslateY((buttonSpace*3));
        fourxone.setMinSize(buttonSize, buttonSize);
        fourxone.setMaxSize(buttonSize, buttonSize);
        fourxone.setText("");
        fourxone.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                fourXone();
            }
        });
        //4444444444444444444444444444444444444444444444444444444444444444444444
      
        fourxtwo.setTranslateX((buttonSpace*1));
        fourxtwo.setTranslateY((buttonSpace*3));
        fourxtwo.setMinSize(buttonSize, buttonSize);
        fourxtwo.setMaxSize(buttonSize, buttonSize);
        fourxtwo.setText("");
        fourxtwo.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                fourXtwo();
            }
        });
        //4444444444444444444444444444444444444444444444444444444444444444444444
        
        fourxthree.setTranslateX((buttonSpace*2));
        fourxthree.setTranslateY((buttonSpace*3));
        fourxthree.setMinSize(buttonSize, buttonSize);
        fourxthree.setMaxSize(buttonSize, buttonSize);
        fourxthree.setText("");
        fourxthree.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                fourXthree();
            }
        });
        //4444444444444444444444444444444444444444444444444444444444444444444444
       
        fourxfour.setTranslateX((buttonSpace*3));
        fourxfour.setTranslateY((buttonSpace*3));
        fourxfour.setMinSize(buttonSize, buttonSize);
        fourxfour.setMaxSize(buttonSize, buttonSize);
        fourxfour.setText("");
        fourxfour.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                fourXfour();
                onexone.setTranslateX(fourxfour.getTranslateX()-((fourxfour.getTranslateX()-onexone.getTranslateX())*1.01));
                onexone.setTranslateY(fourxfour.getTranslateX()-((fourxfour.getTranslateY()-onexone.getTranslateY())*1.01));
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
        
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setX(-60);
        primaryStage.setY(-60);
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
