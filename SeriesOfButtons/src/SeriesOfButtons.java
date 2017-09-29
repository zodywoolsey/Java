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
        double expandFactor = 1.02;
        double buttonLoc = 70;
        
        //1111111111111111111111111111111111111111111111111111111111111111111111
     
        onexone.setTranslateX((buttonSpace*0)-buttonLoc);
        onexone.setTranslateY((buttonSpace*0)-buttonLoc);
        onexone.setMinSize(buttonSize, buttonSize);
        onexone.setMaxSize(buttonSize, buttonSize);
        onexone.setText("[Start]");
        onexone.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                oneXone();
                //          TRANSLATE MANIPULATION FOR X
                onextwo.setTranslateX(onexone.getTranslateX()-((onexone.getTranslateX()-onextwo.getTranslateX())*expandFactor));
                onexthree.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-onexthree.getTranslateX())*expandFactor);
                onexfour.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-onexfour.getTranslateX())*expandFactor);
                
                twoxone.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-twoxone.getTranslateX())*expandFactor);
                twoxtwo.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-twoxtwo.getTranslateX())*expandFactor);
                twoxthree.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-twoxthree.getTranslateX())*expandFactor);
                twoxfour.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-twoxfour.getTranslateX())*expandFactor);
                
                threexone.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-threexone.getTranslateX())*expandFactor);
                threextwo.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-threextwo.getTranslateX())*expandFactor);
                threexthree.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-threexthree.getTranslateX())*expandFactor);
                threexfour.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-threexfour.getTranslateX())*expandFactor);
                
                fourxone.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-fourxone.getTranslateX())*expandFactor);
                fourxtwo.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-fourxtwo.getTranslateX())*expandFactor);
                fourxthree.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-fourxthree.getTranslateX())*expandFactor);
                fourxfour.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-fourxfour.getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(onexone.getTranslateY()-((onexone.getTranslateY()-onextwo.getTranslateY())*expandFactor));
                onexthree.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-onexthree.getTranslateY())*expandFactor);
                onexfour.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-onexfour.getTranslateY())*expandFactor);
                
                twoxone.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-twoxone.getTranslateY())*expandFactor);
                twoxtwo.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-twoxtwo.getTranslateY())*expandFactor);
                twoxthree.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-twoxthree.getTranslateY())*expandFactor);
                twoxfour.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-twoxfour.getTranslateY())*expandFactor);
                
                threexone.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-threexone.getTranslateY())*expandFactor);
                threextwo.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-threextwo.getTranslateY())*expandFactor);
                threexthree.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-threexthree.getTranslateY())*expandFactor);
                threexfour.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-threexfour.getTranslateY())*expandFactor);
                
                fourxone.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-fourxone.getTranslateY())*expandFactor);
                fourxtwo.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-fourxtwo.getTranslateY())*expandFactor);
                fourxthree.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-fourxthree.getTranslateY())*expandFactor);
                fourxfour.setTranslateY(onexone.getTranslateY()-(onexone.getTranslateY()-fourxfour.getTranslateY())*expandFactor);
            }
        });
        //1111111111111111111111111111111111111111111111111111111111111111111111
//     
        onextwo.setTranslateX((buttonSpace*1)-buttonLoc);
        onextwo.setTranslateY((buttonSpace*0)-buttonLoc);
        onextwo.setMinSize(buttonSize, buttonSize);
        onextwo.setMaxSize(buttonSize, buttonSize);
        onextwo.setText("");
        onextwo.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                oneXtwo();
                onexone.setTranslateX(onextwo.getTranslateX()-((onextwo.getTranslateX()-onexone.getTranslateX())*expandFactor));
                onexthree.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-onexthree.getTranslateX())*expandFactor);
                onexfour.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-onexfour.getTranslateX())*expandFactor);
                
                twoxone.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-twoxone.getTranslateX())*expandFactor);
                twoxtwo.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-twoxtwo.getTranslateX())*expandFactor);
                twoxthree.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-twoxthree.getTranslateX())*expandFactor);
                twoxfour.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-twoxfour.getTranslateX())*expandFactor);
                
                threexone.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-threexone.getTranslateX())*expandFactor);
                threextwo.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-threextwo.getTranslateX())*expandFactor);
                threexthree.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-threexthree.getTranslateX())*expandFactor);
                threexfour.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-threexfour.getTranslateX())*expandFactor);
                
                fourxone.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-fourxone.getTranslateX())*expandFactor);
                fourxtwo.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-fourxtwo.getTranslateX())*expandFactor);
                fourxthree.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-fourxthree.getTranslateX())*expandFactor);
                fourxfour.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-fourxfour.getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(onextwo.getTranslateY()-((onextwo.getTranslateY()-onextwo.getTranslateY())*expandFactor));
                onexthree.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-onexthree.getTranslateY())*expandFactor);
                onexfour.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-onexfour.getTranslateY())*expandFactor);
                
                twoxone.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-twoxone.getTranslateY())*expandFactor);
                onexone.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-onexone.getTranslateY())*expandFactor);
                twoxthree.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-twoxthree.getTranslateY())*expandFactor);
                twoxfour.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-twoxfour.getTranslateY())*expandFactor);
                
                threexone.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-threexone.getTranslateY())*expandFactor);
                threextwo.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-threextwo.getTranslateY())*expandFactor);
                threexthree.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-threexthree.getTranslateY())*expandFactor);
                threexfour.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-threexfour.getTranslateY())*expandFactor);
                
                fourxone.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-fourxone.getTranslateY())*expandFactor);
                fourxtwo.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-fourxtwo.getTranslateY())*expandFactor);
                fourxthree.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-fourxthree.getTranslateY())*expandFactor);
                fourxfour.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-fourxfour.getTranslateY())*expandFactor);
            }
        });
        //1111111111111111111111111111111111111111111111111111111111111111111111
       
        onexthree.setTranslateX((buttonSpace*2)-buttonLoc);
        onexthree.setTranslateY((buttonSpace*0)-buttonLoc);
        onexthree.setMinSize(buttonSize, buttonSize);
        onexthree.setMaxSize(buttonSize, buttonSize);
        onexthree.setText("");
        onexthree.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                oneXthree();
                onextwo.setTranslateX(onexthree.getTranslateX()-((onexthree.getTranslateX()-onextwo.getTranslateX())*expandFactor));
                onexone.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-onexone.getTranslateX())*expandFactor);
                onexfour.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-onexfour.getTranslateX())*expandFactor);
                
                twoxone.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-twoxone.getTranslateX())*expandFactor);
                twoxtwo.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-twoxtwo.getTranslateX())*expandFactor);
                twoxthree.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-twoxthree.getTranslateX())*expandFactor);
                twoxfour.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-twoxfour.getTranslateX())*expandFactor);
                
                threexone.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-threexone.getTranslateX())*expandFactor);
                threextwo.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-threextwo.getTranslateX())*expandFactor);
                threexthree.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-threexthree.getTranslateX())*expandFactor);
                threexfour.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-threexfour.getTranslateX())*expandFactor);
                
                fourxone.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-fourxone.getTranslateX())*expandFactor);
                fourxtwo.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-fourxtwo.getTranslateX())*expandFactor);
                fourxthree.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-fourxthree.getTranslateX())*expandFactor);
                fourxfour.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-fourxfour.getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(onexthree.getTranslateY()-((onexthree.getTranslateY()-onextwo.getTranslateY())*expandFactor));
                onexone.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-onexone.getTranslateY())*expandFactor);
                onexfour.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-onexfour.getTranslateY())*expandFactor);
                
                twoxone.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-twoxone.getTranslateY())*expandFactor);
                twoxtwo.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-twoxtwo.getTranslateY())*expandFactor);
                twoxthree.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-twoxthree.getTranslateY())*expandFactor);
                twoxfour.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-twoxfour.getTranslateY())*expandFactor);
                
                threexone.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-threexone.getTranslateY())*expandFactor);
                threextwo.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-threextwo.getTranslateY())*expandFactor);
                threexthree.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-threexthree.getTranslateY())*expandFactor);
                threexfour.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-threexfour.getTranslateY())*expandFactor);
                
                fourxone.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-fourxone.getTranslateY())*expandFactor);
                fourxtwo.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-fourxtwo.getTranslateY())*expandFactor);
                fourxthree.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-fourxthree.getTranslateY())*expandFactor);
                fourxfour.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-fourxfour.getTranslateY())*expandFactor);
            }
        });
        //1111111111111111111111111111111111111111111111111111111111111111111111
      
        onexfour.setTranslateX((buttonSpace*3)-buttonLoc);
        onexfour.setTranslateY((buttonSpace*0)-buttonLoc);
        onexfour.setMinSize(buttonSize, buttonSize);
        onexfour.setMaxSize(buttonSize, buttonSize);
        onexfour.setText("");
        onexfour.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                oneXfour();
                onextwo.setTranslateX(onexfour.getTranslateX()-((onexfour.getTranslateX()-onextwo.getTranslateX())*expandFactor));
                onexthree.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-onexthree.getTranslateX())*expandFactor);
                onexone.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-onexone.getTranslateX())*expandFactor);
                
                twoxone.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-twoxone.getTranslateX())*expandFactor);
                twoxtwo.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-twoxtwo.getTranslateX())*expandFactor);
                twoxthree.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-twoxthree.getTranslateX())*expandFactor);
                twoxfour.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-twoxfour.getTranslateX())*expandFactor);
                
                threexone.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-threexone.getTranslateX())*expandFactor);
                threextwo.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-threextwo.getTranslateX())*expandFactor);
                threexthree.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-threexthree.getTranslateX())*expandFactor);
                threexfour.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-threexfour.getTranslateX())*expandFactor);
                
                fourxone.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-fourxone.getTranslateX())*expandFactor);
                fourxtwo.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-fourxtwo.getTranslateX())*expandFactor);
                fourxthree.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-fourxthree.getTranslateX())*expandFactor);
                fourxfour.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-fourxfour.getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(onexfour.getTranslateY()-((onexfour.getTranslateY()-onextwo.getTranslateY())*expandFactor));
                onexthree.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-onexthree.getTranslateY())*expandFactor);
                onexfour.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-onexfour.getTranslateY())*expandFactor);
                
                twoxone.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-twoxone.getTranslateY())*expandFactor);
                twoxtwo.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-twoxtwo.getTranslateY())*expandFactor);
                twoxthree.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-twoxthree.getTranslateY())*expandFactor);
                twoxfour.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-twoxfour.getTranslateY())*expandFactor);
                
                threexone.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-threexone.getTranslateY())*expandFactor);
                threextwo.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-threextwo.getTranslateY())*expandFactor);
                threexthree.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-threexthree.getTranslateY())*expandFactor);
                threexfour.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-threexfour.getTranslateY())*expandFactor);
                
                fourxone.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-fourxone.getTranslateY())*expandFactor);
                fourxtwo.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-fourxtwo.getTranslateY())*expandFactor);
                fourxthree.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-fourxthree.getTranslateY())*expandFactor);
                fourxfour.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-fourxfour.getTranslateY())*expandFactor);
            }
        });
        //2222222222222222222222222222222222222222222222222222222222222222222222
     
        twoxone.setTranslateX((buttonSpace*0)-buttonLoc);
        twoxone.setTranslateY((buttonSpace*1)-buttonLoc);
        twoxone.setMinSize(buttonSize, buttonSize);
        twoxone.setMaxSize(buttonSize, buttonSize);
        twoxone.setText("");
        twoxone.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                twoXone();
                onextwo.setTranslateX(twoxone.getTranslateX()-((twoxone.getTranslateX()-onextwo.getTranslateX())*expandFactor));
                onexthree.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-onexthree.getTranslateX())*expandFactor);
                onexfour.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-onexfour.getTranslateX())*expandFactor);
                
                onexone.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-onexone.getTranslateX())*expandFactor);
                twoxtwo.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-twoxtwo.getTranslateX())*expandFactor);
                twoxthree.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-twoxthree.getTranslateX())*expandFactor);
                twoxfour.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-twoxfour.getTranslateX())*expandFactor);
                
                threexone.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-threexone.getTranslateX())*expandFactor);
                threextwo.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-threextwo.getTranslateX())*expandFactor);
                threexthree.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-threexthree.getTranslateX())*expandFactor);
                threexfour.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-threexfour.getTranslateX())*expandFactor);
                
                fourxone.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-fourxone.getTranslateX())*expandFactor);
                fourxtwo.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-fourxtwo.getTranslateX())*expandFactor);
                fourxthree.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-fourxthree.getTranslateX())*expandFactor);
                fourxfour.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-fourxfour.getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(twoxone.getTranslateY()-((twoxone.getTranslateY()-onextwo.getTranslateY())*expandFactor));
                onexthree.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-onexthree.getTranslateY())*expandFactor);
                onexfour.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-onexfour.getTranslateY())*expandFactor);
                
                twoxone.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-twoxone.getTranslateY())*expandFactor);
                twoxtwo.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-twoxtwo.getTranslateY())*expandFactor);
                twoxthree.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-twoxthree.getTranslateY())*expandFactor);
                twoxfour.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-twoxfour.getTranslateY())*expandFactor);
                
                threexone.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-threexone.getTranslateY())*expandFactor);
                threextwo.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-threextwo.getTranslateY())*expandFactor);
                threexthree.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-threexthree.getTranslateY())*expandFactor);
                threexfour.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-threexfour.getTranslateY())*expandFactor);
                
                fourxone.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-fourxone.getTranslateY())*expandFactor);
                fourxtwo.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-fourxtwo.getTranslateY())*expandFactor);
                fourxthree.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-fourxthree.getTranslateY())*expandFactor);
                fourxfour.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-fourxfour.getTranslateY())*expandFactor);
            }
        });
        //2222222222222222222222222222222222222222222222222222222222222222222222
     
        twoxtwo.setTranslateX((buttonSpace*1)-buttonLoc);
        twoxtwo.setTranslateY((buttonSpace*1)-buttonLoc);
        twoxtwo.setMinSize(buttonSize, buttonSize);
        twoxtwo.setMaxSize(buttonSize, buttonSize);
        twoxtwo.setText("");
        twoxtwo.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                twoXtwo();
                onextwo.setTranslateX(twoxtwo.getTranslateX()-((twoxtwo.getTranslateX()-onextwo.getTranslateX())*expandFactor));
                onexthree.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-onexthree.getTranslateX())*expandFactor);
                onexfour.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-onexfour.getTranslateX())*expandFactor);
                
                twoxone.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-twoxone.getTranslateX())*expandFactor);
                onexone.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-onexone.getTranslateX())*expandFactor);
                twoxthree.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-twoxthree.getTranslateX())*expandFactor);
                twoxfour.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-twoxfour.getTranslateX())*expandFactor);
                
                threexone.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-threexone.getTranslateX())*expandFactor);
                threextwo.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-threextwo.getTranslateX())*expandFactor);
                threexthree.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-threexthree.getTranslateX())*expandFactor);
                threexfour.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-threexfour.getTranslateX())*expandFactor);
                
                fourxone.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-fourxone.getTranslateX())*expandFactor);
                fourxtwo.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-fourxtwo.getTranslateX())*expandFactor);
                fourxthree.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-fourxthree.getTranslateX())*expandFactor);
                fourxfour.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-fourxfour.getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(twoxtwo.getTranslateY()-((twoxtwo.getTranslateY()-onextwo.getTranslateY())*expandFactor));
                onexthree.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-onexthree.getTranslateY())*expandFactor);
                onexfour.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-onexfour.getTranslateY())*expandFactor);
                
                twoxone.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-twoxone.getTranslateY())*expandFactor);
                onexone.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-onexone.getTranslateY())*expandFactor);
                twoxthree.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-twoxthree.getTranslateY())*expandFactor);
                twoxfour.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-twoxfour.getTranslateY())*expandFactor);
                
                threexone.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-threexone.getTranslateY())*expandFactor);
                threextwo.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-threextwo.getTranslateY())*expandFactor);
                threexthree.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-threexthree.getTranslateY())*expandFactor);
                threexfour.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-threexfour.getTranslateY())*expandFactor);
                
                fourxone.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-fourxone.getTranslateY())*expandFactor);
                fourxtwo.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-fourxtwo.getTranslateY())*expandFactor);
                fourxthree.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-fourxthree.getTranslateY())*expandFactor);
                fourxfour.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-fourxfour.getTranslateY())*expandFactor);
            }
        });
        //2222222222222222222222222222222222222222222222222222222222222222222222
       
        twoxthree.setTranslateX((buttonSpace*2)-buttonLoc);
        twoxthree.setTranslateY((buttonSpace*1)-buttonLoc);
        twoxthree.setMinSize(buttonSize, buttonSize);
        twoxthree.setMaxSize(buttonSize, buttonSize);
        twoxthree.setText("");
        twoxthree.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                twoXthree();
                onextwo.setTranslateX(twoxthree.getTranslateX()-((twoxthree.getTranslateX()-onextwo.getTranslateX())*expandFactor));
                onexthree.setTranslateX(twoxthree.getTranslateX()-(twoxthree.getTranslateX()-onexthree.getTranslateX())*expandFactor);
                onexfour.setTranslateX(twoxthree.getTranslateX()-(twoxthree.getTranslateX()-onexfour.getTranslateX())*expandFactor);
                
                twoxone.setTranslateX(twoxthree.getTranslateX()-(twoxthree.getTranslateX()-twoxone.getTranslateX())*expandFactor);
                twoxtwo.setTranslateX(twoxthree.getTranslateX()-(twoxthree.getTranslateX()-twoxtwo.getTranslateX())*expandFactor);
                onexone.setTranslateX(twoxthree.getTranslateX()-(twoxthree.getTranslateX()-onexone.getTranslateX())*expandFactor);
                twoxfour.setTranslateX(twoxthree.getTranslateX()-(twoxthree.getTranslateX()-twoxfour.getTranslateX())*expandFactor);
                
                threexone.setTranslateX(twoxthree.getTranslateX()-(twoxthree.getTranslateX()-threexone.getTranslateX())*expandFactor);
                threextwo.setTranslateX(twoxthree.getTranslateX()-(twoxthree.getTranslateX()-threextwo.getTranslateX())*expandFactor);
                threexthree.setTranslateX(twoxthree.getTranslateX()-(twoxthree.getTranslateX()-threexthree.getTranslateX())*expandFactor);
                threexfour.setTranslateX(twoxthree.getTranslateX()-(twoxthree.getTranslateX()-threexfour.getTranslateX())*expandFactor);
                
                fourxone.setTranslateX(twoxthree.getTranslateX()-(twoxthree.getTranslateX()-fourxone.getTranslateX())*expandFactor);
                fourxtwo.setTranslateX(twoxthree.getTranslateX()-(twoxthree.getTranslateX()-fourxtwo.getTranslateX())*expandFactor);
                fourxthree.setTranslateX(twoxthree.getTranslateX()-(twoxthree.getTranslateX()-fourxthree.getTranslateX())*expandFactor);
                fourxfour.setTranslateX(twoxthree.getTranslateX()-(twoxthree.getTranslateX()-fourxfour.getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(twoxthree.getTranslateY()-((twoxthree.getTranslateY()-onextwo.getTranslateY())*expandFactor));
                onexthree.setTranslateY(twoxthree.getTranslateY()-(twoxthree.getTranslateY()-onexthree.getTranslateY())*expandFactor);
                onexfour.setTranslateY(twoxthree.getTranslateY()-(twoxthree.getTranslateY()-onexfour.getTranslateY())*expandFactor);
                
                twoxone.setTranslateY(twoxthree.getTranslateY()-(twoxthree.getTranslateY()-twoxone.getTranslateY())*expandFactor);
                twoxtwo.setTranslateY(twoxthree.getTranslateY()-(twoxthree.getTranslateY()-twoxtwo.getTranslateY())*expandFactor);
                onexone.setTranslateY(twoxthree.getTranslateY()-(twoxthree.getTranslateY()-onexone.getTranslateY())*expandFactor);
                twoxfour.setTranslateY(twoxthree.getTranslateY()-(twoxthree.getTranslateY()-twoxfour.getTranslateY())*expandFactor);
                
                threexone.setTranslateY(twoxthree.getTranslateY()-(twoxthree.getTranslateY()-threexone.getTranslateY())*expandFactor);
                threextwo.setTranslateY(twoxthree.getTranslateY()-(twoxthree.getTranslateY()-threextwo.getTranslateY())*expandFactor);
                threexthree.setTranslateY(twoxthree.getTranslateY()-(twoxthree.getTranslateY()-threexthree.getTranslateY())*expandFactor);
                threexfour.setTranslateY(twoxthree.getTranslateY()-(twoxthree.getTranslateY()-threexfour.getTranslateY())*expandFactor);
                
                fourxone.setTranslateY(twoxthree.getTranslateY()-(twoxthree.getTranslateY()-fourxone.getTranslateY())*expandFactor);
                fourxtwo.setTranslateY(twoxthree.getTranslateY()-(twoxthree.getTranslateY()-fourxtwo.getTranslateY())*expandFactor);
                fourxthree.setTranslateY(twoxthree.getTranslateY()-(twoxthree.getTranslateY()-fourxthree.getTranslateY())*expandFactor);
                fourxfour.setTranslateY(twoxthree.getTranslateY()-(twoxthree.getTranslateY()-fourxfour.getTranslateY())*expandFactor);
            }
        });
        //2222222222222222222222222222222222222222222222222222222222222222222222
      
        twoxfour.setTranslateX((buttonSpace*3)-buttonLoc);
        twoxfour.setTranslateY((buttonSpace*1)-buttonLoc);
        twoxfour.setMinSize(buttonSize, buttonSize);
        twoxfour.setMaxSize(buttonSize, buttonSize);
        twoxfour.setText("");
        twoxfour.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                twoXfour();
                onextwo.setTranslateX(twoxfour.getTranslateX()-((twoxfour.getTranslateX()-onextwo.getTranslateX())*expandFactor));
                onexthree.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-onexthree.getTranslateX())*expandFactor);
                onexfour.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-onexfour.getTranslateX())*expandFactor);
                
                twoxone.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-twoxone.getTranslateX())*expandFactor);
                twoxtwo.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-twoxtwo.getTranslateX())*expandFactor);
                twoxthree.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-twoxthree.getTranslateX())*expandFactor);
                onexone.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-onexone.getTranslateX())*expandFactor);
                
                threexone.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-threexone.getTranslateX())*expandFactor);
                threextwo.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-threextwo.getTranslateX())*expandFactor);
                threexthree.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-threexthree.getTranslateX())*expandFactor);
                threexfour.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-threexfour.getTranslateX())*expandFactor);
                
                fourxone.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-fourxone.getTranslateX())*expandFactor);
                fourxtwo.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-fourxtwo.getTranslateX())*expandFactor);
                fourxthree.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-fourxthree.getTranslateX())*expandFactor);
                fourxfour.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-fourxfour.getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(twoxfour.getTranslateY()-((twoxfour.getTranslateY()-onextwo.getTranslateY())*expandFactor));
                onexthree.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-onexthree.getTranslateY())*expandFactor);
                onexfour.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-onexfour.getTranslateY())*expandFactor);
                
                twoxone.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-twoxone.getTranslateY())*expandFactor);
                twoxtwo.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-twoxtwo.getTranslateY())*expandFactor);
                twoxthree.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-twoxthree.getTranslateY())*expandFactor);
                onexone.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-onexone.getTranslateY())*expandFactor);
                
                threexone.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-threexone.getTranslateY())*expandFactor);
                threextwo.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-threextwo.getTranslateY())*expandFactor);
                threexthree.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-threexthree.getTranslateY())*expandFactor);
                threexfour.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-threexfour.getTranslateY())*expandFactor);
                
                fourxone.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-fourxone.getTranslateY())*expandFactor);
                fourxtwo.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-fourxtwo.getTranslateY())*expandFactor);
                fourxthree.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-fourxthree.getTranslateY())*expandFactor);
                fourxfour.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-fourxfour.getTranslateY())*expandFactor);
            }
        });
        //3333333333333333333333333333333333333333333333333333333333333333333333
       
        threexone.setTranslateX((buttonSpace*0)-buttonLoc);
        threexone.setTranslateY((buttonSpace*2)-buttonLoc);
        threexone.setMinSize(buttonSize, buttonSize);
        threexone.setMaxSize(buttonSize, buttonSize);
        threexone.setText("");
        threexone.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                threeXone();
                onextwo.setTranslateX(threexone.getTranslateX()-((threexone.getTranslateX()-onextwo.getTranslateX())*expandFactor));
                onexthree.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-onexthree.getTranslateX())*expandFactor);
                onexfour.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-onexfour.getTranslateX())*expandFactor);
                
                twoxone.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-twoxone.getTranslateX())*expandFactor);
                twoxtwo.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-twoxtwo.getTranslateX())*expandFactor);
                twoxthree.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-twoxthree.getTranslateX())*expandFactor);
                twoxfour.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-twoxfour.getTranslateX())*expandFactor);
                
                onexone.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-onexone.getTranslateX())*expandFactor);
                threextwo.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-threextwo.getTranslateX())*expandFactor);
                threexthree.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-threexthree.getTranslateX())*expandFactor);
                threexfour.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-threexfour.getTranslateX())*expandFactor);
                
                fourxone.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-fourxone.getTranslateX())*expandFactor);
                fourxtwo.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-fourxtwo.getTranslateX())*expandFactor);
                fourxthree.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-fourxthree.getTranslateX())*expandFactor);
                fourxfour.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-fourxfour.getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(threexone.getTranslateY()-((threexone.getTranslateY()-onextwo.getTranslateY())*expandFactor));
                onexthree.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-onexthree.getTranslateY())*expandFactor);
                onexfour.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-onexfour.getTranslateY())*expandFactor);
                
                twoxone.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-twoxone.getTranslateY())*expandFactor);
                twoxtwo.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-twoxtwo.getTranslateY())*expandFactor);
                twoxthree.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-twoxthree.getTranslateY())*expandFactor);
                twoxfour.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-twoxfour.getTranslateY())*expandFactor);
                
                onexone.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-onexone.getTranslateY())*expandFactor);
                threextwo.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-threextwo.getTranslateY())*expandFactor);
                threexthree.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-threexthree.getTranslateY())*expandFactor);
                threexfour.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-threexfour.getTranslateY())*expandFactor);
                
                fourxone.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-fourxone.getTranslateY())*expandFactor);
                fourxtwo.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-fourxtwo.getTranslateY())*expandFactor);
                fourxthree.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-fourxthree.getTranslateY())*expandFactor);
                fourxfour.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-fourxfour.getTranslateY())*expandFactor);
            }
        });
        //3333333333333333333333333333333333333333333333333333333333333333333333
       
        threextwo.setTranslateX((buttonSpace*1)-buttonLoc);
        threextwo.setTranslateY((buttonSpace*2)-buttonLoc);
        threextwo.setMinSize(buttonSize, buttonSize);
        threextwo.setMaxSize(buttonSize, buttonSize);
        threextwo.setText("");
        threextwo.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                threeXtwo();
                onextwo.setTranslateX(threextwo.getTranslateX()-((threextwo.getTranslateX()-onextwo.getTranslateX())*expandFactor));
                onexthree.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-onexthree.getTranslateX())*expandFactor);
                onexfour.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-onexfour.getTranslateX())*expandFactor);
                
                twoxone.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-twoxone.getTranslateX())*expandFactor);
                twoxtwo.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-twoxtwo.getTranslateX())*expandFactor);
                twoxthree.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-twoxthree.getTranslateX())*expandFactor);
                twoxfour.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-twoxfour.getTranslateX())*expandFactor);
                
                threexone.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-threexone.getTranslateX())*expandFactor);
                onexone.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-onexone.getTranslateX())*expandFactor);
                threexthree.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-threexthree.getTranslateX())*expandFactor);
                threexfour.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-threexfour.getTranslateX())*expandFactor);
                
                fourxone.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-fourxone.getTranslateX())*expandFactor);
                fourxtwo.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-fourxtwo.getTranslateX())*expandFactor);
                fourxthree.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-fourxthree.getTranslateX())*expandFactor);
                fourxfour.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-fourxfour.getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(threextwo.getTranslateY()-((threextwo.getTranslateY()-onextwo.getTranslateY())*expandFactor));
                onexthree.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-onexthree.getTranslateY())*expandFactor);
                onexfour.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-onexfour.getTranslateY())*expandFactor);
                
                twoxone.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-twoxone.getTranslateY())*expandFactor);
                twoxtwo.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-twoxtwo.getTranslateY())*expandFactor);
                twoxthree.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-twoxthree.getTranslateY())*expandFactor);
                twoxfour.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-twoxfour.getTranslateY())*expandFactor);
                
                threexone.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-threexone.getTranslateY())*expandFactor);
                onexone.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-onexone.getTranslateY())*expandFactor);
                threexthree.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-threexthree.getTranslateY())*expandFactor);
                threexfour.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-threexfour.getTranslateY())*expandFactor);
                
                fourxone.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-fourxone.getTranslateY())*expandFactor);
                fourxtwo.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-fourxtwo.getTranslateY())*expandFactor);
                fourxthree.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-fourxthree.getTranslateY())*expandFactor);
                fourxfour.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-fourxfour.getTranslateY())*expandFactor);
            }
        });
        //3333333333333333333333333333333333333333333333333333333333333333333333
        
        threexthree.setTranslateX((buttonSpace*2)-buttonLoc);
        threexthree.setTranslateY((buttonSpace*2)-buttonLoc);
        threexthree.setMinSize(buttonSize, buttonSize);
        threexthree.setMaxSize(buttonSize, buttonSize);
        threexthree.setText("");
        threexthree.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                threeXthree();
                onextwo.setTranslateX(threexthree.getTranslateX()-((threexthree.getTranslateX()-onextwo.getTranslateX())*expandFactor));
                onexthree.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-onexthree.getTranslateX())*expandFactor);
                onexfour.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-onexfour.getTranslateX())*expandFactor);
                
                twoxone.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-twoxone.getTranslateX())*expandFactor);
                twoxtwo.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-twoxtwo.getTranslateX())*expandFactor);
                twoxthree.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-twoxthree.getTranslateX())*expandFactor);
                twoxfour.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-twoxfour.getTranslateX())*expandFactor);
                
                threexone.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-threexone.getTranslateX())*expandFactor);
                threextwo.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-threextwo.getTranslateX())*expandFactor);
                onexone.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-onexone.getTranslateX())*expandFactor);
                threexfour.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-threexfour.getTranslateX())*expandFactor);
                
                fourxone.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-fourxone.getTranslateX())*expandFactor);
                fourxtwo.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-fourxtwo.getTranslateX())*expandFactor);
                fourxthree.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-fourxthree.getTranslateX())*expandFactor);
                fourxfour.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-fourxfour.getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(threexthree.getTranslateY()-((threexthree.getTranslateY()-onextwo.getTranslateY())*expandFactor));
                onexthree.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-onexthree.getTranslateY())*expandFactor);
                onexfour.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-onexfour.getTranslateY())*expandFactor);
                
                twoxone.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-twoxone.getTranslateY())*expandFactor);
                twoxtwo.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-twoxtwo.getTranslateY())*expandFactor);
                twoxthree.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-twoxthree.getTranslateY())*expandFactor);
                twoxfour.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-twoxfour.getTranslateY())*expandFactor);
                
                threexone.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-threexone.getTranslateY())*expandFactor);
                threextwo.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-threextwo.getTranslateY())*expandFactor);
                onexone.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-onexone.getTranslateY())*expandFactor);
                threexfour.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-threexfour.getTranslateY())*expandFactor);
                
                fourxone.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-fourxone.getTranslateY())*expandFactor);
                fourxtwo.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-fourxtwo.getTranslateY())*expandFactor);
                fourxthree.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-fourxthree.getTranslateY())*expandFactor);
                fourxfour.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-fourxfour.getTranslateY())*expandFactor);
            }
        });
        //3333333333333333333333333333333333333333333333333333333333333333333333
        
        threexfour.setTranslateX((buttonSpace*3)-buttonLoc);
        threexfour.setTranslateY((buttonSpace*2)-buttonLoc);
        threexfour.setMinSize(buttonSize, buttonSize);
        threexfour.setMaxSize(buttonSize, buttonSize);
        threexfour.setText("");
        threexfour.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                threeXfour();
                onextwo.setTranslateX(threexfour.getTranslateX()-((threexfour.getTranslateX()-onextwo.getTranslateX())*expandFactor));
                onexthree.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-onexthree.getTranslateX())*expandFactor);
                onexfour.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-onexfour.getTranslateX())*expandFactor);
                
                twoxone.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-twoxone.getTranslateX())*expandFactor);
                twoxtwo.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-twoxtwo.getTranslateX())*expandFactor);
                twoxthree.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-twoxthree.getTranslateX())*expandFactor);
                twoxfour.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-twoxfour.getTranslateX())*expandFactor);
                
                threexone.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-threexone.getTranslateX())*expandFactor);
                threextwo.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-threextwo.getTranslateX())*expandFactor);
                threexthree.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-threexthree.getTranslateX())*expandFactor);
                onexone.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-onexone.getTranslateX())*expandFactor);
                
                fourxone.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-fourxone.getTranslateX())*expandFactor);
                fourxtwo.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-fourxtwo.getTranslateX())*expandFactor);
                fourxthree.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-fourxthree.getTranslateX())*expandFactor);
                fourxfour.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-fourxfour.getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(threexfour.getTranslateY()-((threexfour.getTranslateY()-onextwo.getTranslateY())*expandFactor));
                onexthree.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-onexthree.getTranslateY())*expandFactor);
                onexfour.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-onexfour.getTranslateY())*expandFactor);
                
                twoxone.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-twoxone.getTranslateY())*expandFactor);
                twoxtwo.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-twoxtwo.getTranslateY())*expandFactor);
                twoxthree.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-twoxthree.getTranslateY())*expandFactor);
                twoxfour.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-twoxfour.getTranslateY())*expandFactor);
                
                threexone.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-threexone.getTranslateY())*expandFactor);
                threextwo.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-threextwo.getTranslateY())*expandFactor);
                threexthree.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-threexthree.getTranslateY())*expandFactor);
                onexone.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-onexone.getTranslateY())*expandFactor);
                
                fourxone.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-fourxone.getTranslateY())*expandFactor);
                fourxtwo.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-fourxtwo.getTranslateY())*expandFactor);
                fourxthree.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-fourxthree.getTranslateY())*expandFactor);
                fourxfour.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-fourxfour.getTranslateY())*expandFactor);
            }
        });
        //4444444444444444444444444444444444444444444444444444444444444444444444
      
        fourxone.setTranslateX((buttonSpace*0)-buttonLoc);
        fourxone.setTranslateY((buttonSpace*3)-buttonLoc);
        fourxone.setMinSize(buttonSize, buttonSize);
        fourxone.setMaxSize(buttonSize, buttonSize);
        fourxone.setText("");
        fourxone.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                fourXone();
                onextwo.setTranslateX(fourxone.getTranslateX()-((fourxone.getTranslateX()-onextwo.getTranslateX())*expandFactor));
                onexthree.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-onexthree.getTranslateX())*expandFactor);
                onexfour.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-onexfour.getTranslateX())*expandFactor);
                
                twoxone.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-twoxone.getTranslateX())*expandFactor);
                twoxtwo.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-twoxtwo.getTranslateX())*expandFactor);
                twoxthree.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-twoxthree.getTranslateX())*expandFactor);
                twoxfour.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-twoxfour.getTranslateX())*expandFactor);
                
                threexone.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-threexone.getTranslateX())*expandFactor);
                threextwo.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-threextwo.getTranslateX())*expandFactor);
                threexthree.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-threexthree.getTranslateX())*expandFactor);
                threexfour.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-threexfour.getTranslateX())*expandFactor);
                
                onexone.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-onexone.getTranslateX())*expandFactor);
                fourxtwo.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-fourxtwo.getTranslateX())*expandFactor);
                fourxthree.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-fourxthree.getTranslateX())*expandFactor);
                fourxfour.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-fourxfour.getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(fourxone.getTranslateY()-((fourxone.getTranslateY()-onextwo.getTranslateY())*expandFactor));
                onexthree.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-onexthree.getTranslateY())*expandFactor);
                onexfour.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-onexfour.getTranslateY())*expandFactor);
                
                twoxone.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-twoxone.getTranslateY())*expandFactor);
                twoxtwo.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-twoxtwo.getTranslateY())*expandFactor);
                twoxthree.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-twoxthree.getTranslateY())*expandFactor);
                twoxfour.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-twoxfour.getTranslateY())*expandFactor);
                
                threexone.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-threexone.getTranslateY())*expandFactor);
                threextwo.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-threextwo.getTranslateY())*expandFactor);
                threexthree.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-threexthree.getTranslateY())*expandFactor);
                threexfour.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-threexfour.getTranslateY())*expandFactor);
                
                onexone.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-onexone.getTranslateY())*expandFactor);
                fourxtwo.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-fourxtwo.getTranslateY())*expandFactor);
                fourxthree.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-fourxthree.getTranslateY())*expandFactor);
                fourxfour.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-fourxfour.getTranslateY())*expandFactor);
            }
        });
        //4444444444444444444444444444444444444444444444444444444444444444444444
      
        fourxtwo.setTranslateX((buttonSpace*1)-buttonLoc);
        fourxtwo.setTranslateY((buttonSpace*3)-buttonLoc);
        fourxtwo.setMinSize(buttonSize, buttonSize);
        fourxtwo.setMaxSize(buttonSize, buttonSize);
        fourxtwo.setText("");
        fourxtwo.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                fourXtwo();
                onextwo.setTranslateX(fourxtwo.getTranslateX()-((fourxtwo.getTranslateX()-onextwo.getTranslateX())*expandFactor));
                onexthree.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-onexthree.getTranslateX())*expandFactor);
                onexfour.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-onexfour.getTranslateX())*expandFactor);
                
                twoxone.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-twoxone.getTranslateX())*expandFactor);
                twoxtwo.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-twoxtwo.getTranslateX())*expandFactor);
                twoxthree.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-twoxthree.getTranslateX())*expandFactor);
                twoxfour.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-twoxfour.getTranslateX())*expandFactor);
                
                threexone.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-threexone.getTranslateX())*expandFactor);
                threextwo.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-threextwo.getTranslateX())*expandFactor);
                threexthree.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-threexthree.getTranslateX())*expandFactor);
                threexfour.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-threexfour.getTranslateX())*expandFactor);
                
                fourxone.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-fourxone.getTranslateX())*expandFactor);
                onexone.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-onexone.getTranslateX())*expandFactor);
                fourxthree.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-fourxthree.getTranslateX())*expandFactor);
                fourxfour.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-fourxfour.getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(fourxtwo.getTranslateY()-((fourxtwo.getTranslateY()-onextwo.getTranslateY())*expandFactor));
                onexthree.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-onexthree.getTranslateY())*expandFactor);
                onexfour.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-onexfour.getTranslateY())*expandFactor);
                
                twoxone.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-twoxone.getTranslateY())*expandFactor);
                twoxtwo.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-twoxtwo.getTranslateY())*expandFactor);
                twoxthree.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-twoxthree.getTranslateY())*expandFactor);
                twoxfour.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-twoxfour.getTranslateY())*expandFactor);
                
                threexone.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-threexone.getTranslateY())*expandFactor);
                threextwo.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-threextwo.getTranslateY())*expandFactor);
                threexthree.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-threexthree.getTranslateY())*expandFactor);
                threexfour.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-threexfour.getTranslateY())*expandFactor);
                
                fourxone.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-fourxone.getTranslateY())*expandFactor);
                onexone.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-onexone.getTranslateY())*expandFactor);
                fourxthree.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-fourxthree.getTranslateY())*expandFactor);
                fourxfour.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-fourxfour.getTranslateY())*expandFactor);
            }
        });
        //4444444444444444444444444444444444444444444444444444444444444444444444
        
        fourxthree.setTranslateX((buttonSpace*2)-buttonLoc);
        fourxthree.setTranslateY((buttonSpace*3)-buttonLoc);
        fourxthree.setMinSize(buttonSize, buttonSize);
        fourxthree.setMaxSize(buttonSize, buttonSize);
        fourxthree.setText("");
        fourxthree.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                fourXthree();
                onextwo.setTranslateX(fourxthree.getTranslateX()-((fourxthree.getTranslateX()-onextwo.getTranslateX())*expandFactor));
                onexthree.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-onexthree.getTranslateX())*expandFactor);
                onexfour.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-onexfour.getTranslateX())*expandFactor);
                
                twoxone.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-twoxone.getTranslateX())*expandFactor);
                twoxtwo.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-twoxtwo.getTranslateX())*expandFactor);
                twoxthree.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-twoxthree.getTranslateX())*expandFactor);
                twoxfour.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-twoxfour.getTranslateX())*expandFactor);
                
                threexone.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-threexone.getTranslateX())*expandFactor);
                threextwo.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-threextwo.getTranslateX())*expandFactor);
                threexthree.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-threexthree.getTranslateX())*expandFactor);
                threexfour.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-threexfour.getTranslateX())*expandFactor);
                
                fourxone.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-fourxone.getTranslateX())*expandFactor);
                fourxtwo.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-fourxtwo.getTranslateX())*expandFactor);
                onexone.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-onexone.getTranslateX())*expandFactor);
                fourxfour.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-fourxfour.getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(fourxthree.getTranslateY()-((fourxthree.getTranslateY()-onextwo.getTranslateY())*expandFactor));
                onexthree.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-onexthree.getTranslateY())*expandFactor);
                onexfour.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-onexfour.getTranslateY())*expandFactor);
                
                twoxone.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-twoxone.getTranslateY())*expandFactor);
                twoxtwo.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-twoxtwo.getTranslateY())*expandFactor);
                twoxthree.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-twoxthree.getTranslateY())*expandFactor);
                twoxfour.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-twoxfour.getTranslateY())*expandFactor);
                
                threexone.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-threexone.getTranslateY())*expandFactor);
                threextwo.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-threextwo.getTranslateY())*expandFactor);
                threexthree.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-threexthree.getTranslateY())*expandFactor);
                threexfour.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-threexfour.getTranslateY())*expandFactor);
                
                fourxone.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-fourxone.getTranslateY())*expandFactor);
                fourxtwo.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-fourxtwo.getTranslateY())*expandFactor);
                onexone.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-onexone.getTranslateY())*expandFactor);
                fourxfour.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-fourxfour.getTranslateY())*expandFactor);
            }
        });
        //4444444444444444444444444444444444444444444444444444444444444444444444
       
        fourxfour.setTranslateX((buttonSpace*3)-buttonLoc);
        fourxfour.setTranslateY((buttonSpace*3)-buttonLoc);
        fourxfour.setMinSize(buttonSize, buttonSize);
        fourxfour.setMaxSize(buttonSize, buttonSize);
        fourxfour.setText("");
        fourxfour.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                fourXfour();
                onextwo.setTranslateX(fourxfour.getTranslateX()-((fourxfour.getTranslateX()-onextwo.getTranslateX())*expandFactor));
                onexthree.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-onexthree.getTranslateX())*expandFactor);
                onexfour.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-onexfour.getTranslateX())*expandFactor);
                
                twoxone.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-twoxone.getTranslateX())*expandFactor);
                twoxtwo.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-twoxtwo.getTranslateX())*expandFactor);
                twoxthree.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-twoxthree.getTranslateX())*expandFactor);
                twoxfour.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-twoxfour.getTranslateX())*expandFactor);
                
                threexone.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-threexone.getTranslateX())*expandFactor);
                threextwo.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-threextwo.getTranslateX())*expandFactor);
                threexthree.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-threexthree.getTranslateX())*expandFactor);
                threexfour.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-threexfour.getTranslateX())*expandFactor);
                
                fourxone.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-fourxone.getTranslateX())*expandFactor);
                fourxtwo.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-fourxtwo.getTranslateX())*expandFactor);
                fourxthree.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-fourxthree.getTranslateX())*expandFactor);
                onexone.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-onexone.getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(fourxfour.getTranslateY()-((fourxfour.getTranslateY()-onextwo.getTranslateY())*expandFactor));
                onexthree.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-onexthree.getTranslateY())*expandFactor);
                onexfour.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-onexfour.getTranslateY())*expandFactor);
                
                twoxone.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-twoxone.getTranslateY())*expandFactor);
                twoxtwo.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-twoxtwo.getTranslateY())*expandFactor);
                twoxthree.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-twoxthree.getTranslateY())*expandFactor);
                twoxfour.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-twoxfour.getTranslateY())*expandFactor);
                
                threexone.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-threexone.getTranslateY())*expandFactor);
                threextwo.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-threextwo.getTranslateY())*expandFactor);
                threexthree.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-threexthree.getTranslateY())*expandFactor);
                threexfour.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-threexfour.getTranslateY())*expandFactor);
                
                fourxone.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-fourxone.getTranslateY())*expandFactor);
                fourxtwo.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-fourxtwo.getTranslateY())*expandFactor);
                fourxthree.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-fourxthree.getTranslateY())*expandFactor);
                onexone.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-onexone.getTranslateY())*expandFactor);
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
