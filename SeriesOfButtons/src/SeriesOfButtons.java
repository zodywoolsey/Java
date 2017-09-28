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
                onexone.setTranslateX(onextwo.getTranslateX()-((onextwo.getTranslateX()-onexone.getTranslateX())*1.01));
                onexthree.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-onexthree.getTranslateX())*1.01);
                onexfour.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-onexfour.getTranslateX())*1.01);
                
                twoxone.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-twoxone.getTranslateX())*1.01);
                twoxtwo.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-twoxtwo.getTranslateX())*1.01);
                twoxthree.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-twoxthree.getTranslateX())*1.01);
                twoxfour.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-twoxfour.getTranslateX())*1.01);
                
                threexone.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-threexone.getTranslateX())*1.01);
                threextwo.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-threextwo.getTranslateX())*1.01);
                threexthree.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-threexthree.getTranslateX())*1.01);
                threexfour.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-threexfour.getTranslateX())*1.01);
                
                fourxone.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-fourxone.getTranslateX())*1.01);
                fourxtwo.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-fourxtwo.getTranslateX())*1.01);
                fourxthree.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-fourxthree.getTranslateX())*1.01);
                fourxfour.setTranslateX(onextwo.getTranslateX()-(onextwo.getTranslateX()-fourxfour.getTranslateX())*1.01);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(onextwo.getTranslateY()-((onextwo.getTranslateY()-onextwo.getTranslateY())*1.01));
                onexthree.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-onexthree.getTranslateY())*1.01);
                onexfour.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-onexfour.getTranslateY())*1.01);
                
                twoxone.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-twoxone.getTranslateY())*1.01);
                onexone.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-onexone.getTranslateY())*1.01);
                twoxthree.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-twoxthree.getTranslateY())*1.01);
                twoxfour.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-twoxfour.getTranslateY())*1.01);
                
                threexone.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-threexone.getTranslateY())*1.01);
                threextwo.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-threextwo.getTranslateY())*1.01);
                threexthree.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-threexthree.getTranslateY())*1.01);
                threexfour.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-threexfour.getTranslateY())*1.01);
                
                fourxone.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-fourxone.getTranslateY())*1.01);
                fourxtwo.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-fourxtwo.getTranslateY())*1.01);
                fourxthree.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-fourxthree.getTranslateY())*1.01);
                fourxfour.setTranslateY(onextwo.getTranslateY()-(onextwo.getTranslateY()-fourxfour.getTranslateY())*1.01);
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
                onextwo.setTranslateX(onexthree.getTranslateX()-((onexthree.getTranslateX()-onextwo.getTranslateX())*1.01));
                onexone.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-onexone.getTranslateX())*1.01);
                onexfour.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-onexfour.getTranslateX())*1.01);
                
                twoxone.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-twoxone.getTranslateX())*1.01);
                twoxtwo.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-twoxtwo.getTranslateX())*1.01);
                twoxthree.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-twoxthree.getTranslateX())*1.01);
                twoxfour.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-twoxfour.getTranslateX())*1.01);
                
                threexone.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-threexone.getTranslateX())*1.01);
                threextwo.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-threextwo.getTranslateX())*1.01);
                threexthree.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-threexthree.getTranslateX())*1.01);
                threexfour.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-threexfour.getTranslateX())*1.01);
                
                fourxone.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-fourxone.getTranslateX())*1.01);
                fourxtwo.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-fourxtwo.getTranslateX())*1.01);
                fourxthree.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-fourxthree.getTranslateX())*1.01);
                fourxfour.setTranslateX(onexthree.getTranslateX()-(onexthree.getTranslateX()-fourxfour.getTranslateX())*1.01);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(onexthree.getTranslateY()-((onexthree.getTranslateY()-onextwo.getTranslateY())*1.01));
                onexone.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-onexone.getTranslateY())*1.01);
                onexfour.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-onexfour.getTranslateY())*1.01);
                
                twoxone.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-twoxone.getTranslateY())*1.01);
                twoxtwo.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-twoxtwo.getTranslateY())*1.01);
                twoxthree.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-twoxthree.getTranslateY())*1.01);
                twoxfour.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-twoxfour.getTranslateY())*1.01);
                
                threexone.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-threexone.getTranslateY())*1.01);
                threextwo.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-threextwo.getTranslateY())*1.01);
                threexthree.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-threexthree.getTranslateY())*1.01);
                threexfour.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-threexfour.getTranslateY())*1.01);
                
                fourxone.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-fourxone.getTranslateY())*1.01);
                fourxtwo.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-fourxtwo.getTranslateY())*1.01);
                fourxthree.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-fourxthree.getTranslateY())*1.01);
                fourxfour.setTranslateY(onexthree.getTranslateY()-(onexthree.getTranslateY()-fourxfour.getTranslateY())*1.01);
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
                onextwo.setTranslateX(onexfour.getTranslateX()-((onexfour.getTranslateX()-onextwo.getTranslateX())*1.01));
                onexthree.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-onexthree.getTranslateX())*1.01);
                onexone.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-onexone.getTranslateX())*1.01);
                
                twoxone.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-twoxone.getTranslateX())*1.01);
                twoxtwo.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-twoxtwo.getTranslateX())*1.01);
                twoxthree.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-twoxthree.getTranslateX())*1.01);
                twoxfour.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-twoxfour.getTranslateX())*1.01);
                
                threexone.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-threexone.getTranslateX())*1.01);
                threextwo.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-threextwo.getTranslateX())*1.01);
                threexthree.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-threexthree.getTranslateX())*1.01);
                threexfour.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-threexfour.getTranslateX())*1.01);
                
                fourxone.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-fourxone.getTranslateX())*1.01);
                fourxtwo.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-fourxtwo.getTranslateX())*1.01);
                fourxthree.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-fourxthree.getTranslateX())*1.01);
                fourxfour.setTranslateX(onexfour.getTranslateX()-(onexfour.getTranslateX()-fourxfour.getTranslateX())*1.01);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(onexfour.getTranslateY()-((onexfour.getTranslateY()-onextwo.getTranslateY())*1.01));
                onexthree.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-onexthree.getTranslateY())*1.01);
                onexfour.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-onexfour.getTranslateY())*1.01);
                
                twoxone.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-twoxone.getTranslateY())*1.01);
                twoxtwo.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-twoxtwo.getTranslateY())*1.01);
                twoxthree.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-twoxthree.getTranslateY())*1.01);
                twoxfour.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-twoxfour.getTranslateY())*1.01);
                
                threexone.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-threexone.getTranslateY())*1.01);
                threextwo.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-threextwo.getTranslateY())*1.01);
                threexthree.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-threexthree.getTranslateY())*1.01);
                threexfour.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-threexfour.getTranslateY())*1.01);
                
                fourxone.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-fourxone.getTranslateY())*1.01);
                fourxtwo.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-fourxtwo.getTranslateY())*1.01);
                fourxthree.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-fourxthree.getTranslateY())*1.01);
                fourxfour.setTranslateY(onexfour.getTranslateY()-(onexfour.getTranslateY()-fourxfour.getTranslateY())*1.01);
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
                onextwo.setTranslateX(twoxone.getTranslateX()-((twoxone.getTranslateX()-onextwo.getTranslateX())*1.01));
                onexthree.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-onexthree.getTranslateX())*1.01);
                onexfour.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-onexfour.getTranslateX())*1.01);
                
                onexone.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-onexone.getTranslateX())*1.01);
                twoxtwo.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-twoxtwo.getTranslateX())*1.01);
                twoxthree.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-twoxthree.getTranslateX())*1.01);
                twoxfour.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-twoxfour.getTranslateX())*1.01);
                
                threexone.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-threexone.getTranslateX())*1.01);
                threextwo.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-threextwo.getTranslateX())*1.01);
                threexthree.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-threexthree.getTranslateX())*1.01);
                threexfour.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-threexfour.getTranslateX())*1.01);
                
                fourxone.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-fourxone.getTranslateX())*1.01);
                fourxtwo.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-fourxtwo.getTranslateX())*1.01);
                fourxthree.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-fourxthree.getTranslateX())*1.01);
                fourxfour.setTranslateX(twoxone.getTranslateX()-(twoxone.getTranslateX()-fourxfour.getTranslateX())*1.01);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(twoxone.getTranslateY()-((twoxone.getTranslateY()-onextwo.getTranslateY())*1.01));
                onexthree.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-onexthree.getTranslateY())*1.01);
                onexfour.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-onexfour.getTranslateY())*1.01);
                
                twoxone.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-twoxone.getTranslateY())*1.01);
                twoxtwo.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-twoxtwo.getTranslateY())*1.01);
                twoxthree.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-twoxthree.getTranslateY())*1.01);
                twoxfour.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-twoxfour.getTranslateY())*1.01);
                
                threexone.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-threexone.getTranslateY())*1.01);
                threextwo.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-threextwo.getTranslateY())*1.01);
                threexthree.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-threexthree.getTranslateY())*1.01);
                threexfour.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-threexfour.getTranslateY())*1.01);
                
                fourxone.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-fourxone.getTranslateY())*1.01);
                fourxtwo.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-fourxtwo.getTranslateY())*1.01);
                fourxthree.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-fourxthree.getTranslateY())*1.01);
                fourxfour.setTranslateY(twoxone.getTranslateY()-(twoxone.getTranslateY()-fourxfour.getTranslateY())*1.01);
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
                onextwo.setTranslateX(twoxtwo.getTranslateX()-((twoxtwo.getTranslateX()-onextwo.getTranslateX())*1.01));
                onexthree.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-onexthree.getTranslateX())*1.01);
                onexfour.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-onexfour.getTranslateX())*1.01);
                
                twoxone.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-twoxone.getTranslateX())*1.01);
                twoxtwo.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-twoxtwo.getTranslateX())*1.01);
                twoxthree.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-twoxthree.getTranslateX())*1.01);
                twoxfour.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-twoxfour.getTranslateX())*1.01);
                
                threexone.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-threexone.getTranslateX())*1.01);
                threextwo.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-threextwo.getTranslateX())*1.01);
                threexthree.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-threexthree.getTranslateX())*1.01);
                threexfour.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-threexfour.getTranslateX())*1.01);
                
                fourxone.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-fourxone.getTranslateX())*1.01);
                fourxtwo.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-fourxtwo.getTranslateX())*1.01);
                fourxthree.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-fourxthree.getTranslateX())*1.01);
                fourxfour.setTranslateX(twoxtwo.getTranslateX()-(twoxtwo.getTranslateX()-fourxfour.getTranslateX())*1.01);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(twoxtwo.getTranslateY()-((twoxtwo.getTranslateY()-onextwo.getTranslateY())*1.01));
                onexthree.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-onexthree.getTranslateY())*1.01);
                onexfour.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-onexfour.getTranslateY())*1.01);
                
                twoxone.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-twoxone.getTranslateY())*1.01);
                twoxtwo.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-twoxtwo.getTranslateY())*1.01);
                twoxthree.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-twoxthree.getTranslateY())*1.01);
                twoxfour.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-twoxfour.getTranslateY())*1.01);
                
                threexone.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-threexone.getTranslateY())*1.01);
                threextwo.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-threextwo.getTranslateY())*1.01);
                threexthree.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-threexthree.getTranslateY())*1.01);
                threexfour.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-threexfour.getTranslateY())*1.01);
                
                fourxone.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-fourxone.getTranslateY())*1.01);
                fourxtwo.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-fourxtwo.getTranslateY())*1.01);
                fourxthree.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-fourxthree.getTranslateY())*1.01);
                fourxfour.setTranslateY(twoxtwo.getTranslateY()-(twoxtwo.getTranslateY()-fourxfour.getTranslateY())*1.01);
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
                onextwo.setTranslateX(onexone.getTranslateX()-((onexone.getTranslateX()-onextwo.getTranslateX())*1.01));
                onexthree.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-onexthree.getTranslateX())*1.01);
                onexfour.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-onexfour.getTranslateX())*1.01);
                
                twoxone.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-twoxone.getTranslateX())*1.01);
                twoxtwo.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-twoxtwo.getTranslateX())*1.01);
                onexone.setTranslateX(onexone.getTranslateX()-(onexone.getTranslateX()-onexone.getTranslateX())*1.01);
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
                onextwo.setTranslateX(twoxfour.getTranslateX()-((twoxfour.getTranslateX()-onextwo.getTranslateX())*1.01));
                onexthree.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-onexthree.getTranslateX())*1.01);
                onexfour.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-onexfour.getTranslateX())*1.01);
                
                twoxone.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-twoxone.getTranslateX())*1.01);
                twoxtwo.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-twoxtwo.getTranslateX())*1.01);
                twoxthree.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-twoxthree.getTranslateX())*1.01);
                onexone.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-onexone.getTranslateX())*1.01);
                
                threexone.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-threexone.getTranslateX())*1.01);
                threextwo.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-threextwo.getTranslateX())*1.01);
                threexthree.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-threexthree.getTranslateX())*1.01);
                threexfour.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-threexfour.getTranslateX())*1.01);
                
                fourxone.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-fourxone.getTranslateX())*1.01);
                fourxtwo.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-fourxtwo.getTranslateX())*1.01);
                fourxthree.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-fourxthree.getTranslateX())*1.01);
                fourxfour.setTranslateX(twoxfour.getTranslateX()-(twoxfour.getTranslateX()-fourxfour.getTranslateX())*1.01);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(twoxfour.getTranslateY()-((twoxfour.getTranslateY()-onextwo.getTranslateY())*1.01));
                onexthree.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-onexthree.getTranslateY())*1.01);
                onexfour.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-onexfour.getTranslateY())*1.01);
                
                twoxone.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-twoxone.getTranslateY())*1.01);
                twoxtwo.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-twoxtwo.getTranslateY())*1.01);
                twoxthree.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-twoxthree.getTranslateY())*1.01);
                twoxfour.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-twoxfour.getTranslateY())*1.01);
                
                threexone.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-threexone.getTranslateY())*1.01);
                threextwo.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-threextwo.getTranslateY())*1.01);
                threexthree.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-threexthree.getTranslateY())*1.01);
                threexfour.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-threexfour.getTranslateY())*1.01);
                
                fourxone.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-fourxone.getTranslateY())*1.01);
                fourxtwo.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-fourxtwo.getTranslateY())*1.01);
                fourxthree.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-fourxthree.getTranslateY())*1.01);
                fourxfour.setTranslateY(twoxfour.getTranslateY()-(twoxfour.getTranslateY()-fourxfour.getTranslateY())*1.01);
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
                onextwo.setTranslateX(threexone.getTranslateX()-((threexone.getTranslateX()-onextwo.getTranslateX())*1.01));
                onexthree.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-onexthree.getTranslateX())*1.01);
                onexfour.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-onexfour.getTranslateX())*1.01);
                
                twoxone.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-twoxone.getTranslateX())*1.01);
                twoxtwo.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-twoxtwo.getTranslateX())*1.01);
                twoxthree.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-twoxthree.getTranslateX())*1.01);
                twoxfour.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-twoxfour.getTranslateX())*1.01);
                
                onexone.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-onexone.getTranslateX())*1.01);
                threextwo.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-threextwo.getTranslateX())*1.01);
                threexthree.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-threexthree.getTranslateX())*1.01);
                threexfour.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-threexfour.getTranslateX())*1.01);
                
                fourxone.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-fourxone.getTranslateX())*1.01);
                fourxtwo.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-fourxtwo.getTranslateX())*1.01);
                fourxthree.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-fourxthree.getTranslateX())*1.01);
                fourxfour.setTranslateX(threexone.getTranslateX()-(threexone.getTranslateX()-fourxfour.getTranslateX())*1.01);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(threexone.getTranslateY()-((threexone.getTranslateY()-onextwo.getTranslateY())*1.01));
                onexthree.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-onexthree.getTranslateY())*1.01);
                onexfour.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-onexfour.getTranslateY())*1.01);
                
                twoxone.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-twoxone.getTranslateY())*1.01);
                twoxtwo.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-twoxtwo.getTranslateY())*1.01);
                twoxthree.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-twoxthree.getTranslateY())*1.01);
                twoxfour.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-twoxfour.getTranslateY())*1.01);
                
                threexone.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-threexone.getTranslateY())*1.01);
                threextwo.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-threextwo.getTranslateY())*1.01);
                threexthree.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-threexthree.getTranslateY())*1.01);
                threexfour.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-threexfour.getTranslateY())*1.01);
                
                fourxone.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-fourxone.getTranslateY())*1.01);
                fourxtwo.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-fourxtwo.getTranslateY())*1.01);
                fourxthree.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-fourxthree.getTranslateY())*1.01);
                fourxfour.setTranslateY(threexone.getTranslateY()-(threexone.getTranslateY()-fourxfour.getTranslateY())*1.01);
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
                onextwo.setTranslateX(threextwo.getTranslateX()-((threextwo.getTranslateX()-onextwo.getTranslateX())*1.01));
                onexthree.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-onexthree.getTranslateX())*1.01);
                onexfour.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-onexfour.getTranslateX())*1.01);
                
                twoxone.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-twoxone.getTranslateX())*1.01);
                twoxtwo.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-twoxtwo.getTranslateX())*1.01);
                twoxthree.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-twoxthree.getTranslateX())*1.01);
                twoxfour.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-twoxfour.getTranslateX())*1.01);
                
                threexone.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-threexone.getTranslateX())*1.01);
                onexone.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-onexone.getTranslateX())*1.01);
                threexthree.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-threexthree.getTranslateX())*1.01);
                threexfour.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-threexfour.getTranslateX())*1.01);
                
                fourxone.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-fourxone.getTranslateX())*1.01);
                fourxtwo.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-fourxtwo.getTranslateX())*1.01);
                fourxthree.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-fourxthree.getTranslateX())*1.01);
                fourxfour.setTranslateX(threextwo.getTranslateX()-(threextwo.getTranslateX()-fourxfour.getTranslateX())*1.01);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(threextwo.getTranslateY()-((threextwo.getTranslateY()-onextwo.getTranslateY())*1.01));
                onexthree.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-onexthree.getTranslateY())*1.01);
                onexfour.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-onexfour.getTranslateY())*1.01);
                
                twoxone.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-twoxone.getTranslateY())*1.01);
                twoxtwo.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-twoxtwo.getTranslateY())*1.01);
                twoxthree.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-twoxthree.getTranslateY())*1.01);
                twoxfour.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-twoxfour.getTranslateY())*1.01);
                
                threexone.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-threexone.getTranslateY())*1.01);
                threextwo.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-threextwo.getTranslateY())*1.01);
                threexthree.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-threexthree.getTranslateY())*1.01);
                threexfour.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-threexfour.getTranslateY())*1.01);
                
                fourxone.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-fourxone.getTranslateY())*1.01);
                fourxtwo.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-fourxtwo.getTranslateY())*1.01);
                fourxthree.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-fourxthree.getTranslateY())*1.01);
                fourxfour.setTranslateY(threextwo.getTranslateY()-(threextwo.getTranslateY()-fourxfour.getTranslateY())*1.01);
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
                onextwo.setTranslateX(threexthree.getTranslateX()-((threexthree.getTranslateX()-onextwo.getTranslateX())*1.01));
                onexthree.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-onexthree.getTranslateX())*1.01);
                onexfour.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-onexfour.getTranslateX())*1.01);
                
                twoxone.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-twoxone.getTranslateX())*1.01);
                twoxtwo.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-twoxtwo.getTranslateX())*1.01);
                twoxthree.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-twoxthree.getTranslateX())*1.01);
                twoxfour.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-twoxfour.getTranslateX())*1.01);
                
                threexone.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-threexone.getTranslateX())*1.01);
                threextwo.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-threextwo.getTranslateX())*1.01);
                onexone.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-onexone.getTranslateX())*1.01);
                threexfour.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-threexfour.getTranslateX())*1.01);
                
                fourxone.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-fourxone.getTranslateX())*1.01);
                fourxtwo.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-fourxtwo.getTranslateX())*1.01);
                fourxthree.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-fourxthree.getTranslateX())*1.01);
                fourxfour.setTranslateX(threexthree.getTranslateX()-(threexthree.getTranslateX()-fourxfour.getTranslateX())*1.01);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(threexthree.getTranslateY()-((threexthree.getTranslateY()-onextwo.getTranslateY())*1.01));
                onexthree.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-onexthree.getTranslateY())*1.01);
                onexfour.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-onexfour.getTranslateY())*1.01);
                
                twoxone.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-twoxone.getTranslateY())*1.01);
                twoxtwo.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-twoxtwo.getTranslateY())*1.01);
                twoxthree.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-twoxthree.getTranslateY())*1.01);
                twoxfour.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-twoxfour.getTranslateY())*1.01);
                
                threexone.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-threexone.getTranslateY())*1.01);
                threextwo.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-threextwo.getTranslateY())*1.01);
                threexthree.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-threexthree.getTranslateY())*1.01);
                threexfour.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-threexfour.getTranslateY())*1.01);
                
                fourxone.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-fourxone.getTranslateY())*1.01);
                fourxtwo.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-fourxtwo.getTranslateY())*1.01);
                fourxthree.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-fourxthree.getTranslateY())*1.01);
                fourxfour.setTranslateY(threexthree.getTranslateY()-(threexthree.getTranslateY()-fourxfour.getTranslateY())*1.01);
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
                onextwo.setTranslateX(threexfour.getTranslateX()-((threexfour.getTranslateX()-onextwo.getTranslateX())*1.01));
                onexthree.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-onexthree.getTranslateX())*1.01);
                onexfour.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-onexfour.getTranslateX())*1.01);
                
                twoxone.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-twoxone.getTranslateX())*1.01);
                twoxtwo.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-twoxtwo.getTranslateX())*1.01);
                twoxthree.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-twoxthree.getTranslateX())*1.01);
                twoxfour.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-twoxfour.getTranslateX())*1.01);
                
                threexone.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-threexone.getTranslateX())*1.01);
                threextwo.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-threextwo.getTranslateX())*1.01);
                threexthree.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-threexthree.getTranslateX())*1.01);
                onexone.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-onexone.getTranslateX())*1.01);
                
                fourxone.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-fourxone.getTranslateX())*1.01);
                fourxtwo.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-fourxtwo.getTranslateX())*1.01);
                fourxthree.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-fourxthree.getTranslateX())*1.01);
                fourxfour.setTranslateX(threexfour.getTranslateX()-(threexfour.getTranslateX()-fourxfour.getTranslateX())*1.01);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(threexfour.getTranslateY()-((threexfour.getTranslateY()-onextwo.getTranslateY())*1.01));
                onexthree.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-onexthree.getTranslateY())*1.01);
                onexfour.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-onexfour.getTranslateY())*1.01);
                
                twoxone.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-twoxone.getTranslateY())*1.01);
                twoxtwo.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-twoxtwo.getTranslateY())*1.01);
                twoxthree.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-twoxthree.getTranslateY())*1.01);
                twoxfour.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-twoxfour.getTranslateY())*1.01);
                
                threexone.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-threexone.getTranslateY())*1.01);
                threextwo.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-threextwo.getTranslateY())*1.01);
                threexthree.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-threexthree.getTranslateY())*1.01);
                threexfour.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-threexfour.getTranslateY())*1.01);
                
                fourxone.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-fourxone.getTranslateY())*1.01);
                fourxtwo.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-fourxtwo.getTranslateY())*1.01);
                fourxthree.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-fourxthree.getTranslateY())*1.01);
                fourxfour.setTranslateY(threexfour.getTranslateY()-(threexfour.getTranslateY()-fourxfour.getTranslateY())*1.01);
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
                onextwo.setTranslateX(fourxone.getTranslateX()-((fourxone.getTranslateX()-onextwo.getTranslateX())*1.01));
                onexthree.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-onexthree.getTranslateX())*1.01);
                onexfour.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-onexfour.getTranslateX())*1.01);
                
                twoxone.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-twoxone.getTranslateX())*1.01);
                twoxtwo.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-twoxtwo.getTranslateX())*1.01);
                twoxthree.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-twoxthree.getTranslateX())*1.01);
                twoxfour.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-twoxfour.getTranslateX())*1.01);
                
                threexone.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-threexone.getTranslateX())*1.01);
                threextwo.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-threextwo.getTranslateX())*1.01);
                threexthree.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-threexthree.getTranslateX())*1.01);
                threexfour.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-threexfour.getTranslateX())*1.01);
                
                onexone.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-onexone.getTranslateX())*1.01);
                fourxtwo.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-fourxtwo.getTranslateX())*1.01);
                fourxthree.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-fourxthree.getTranslateX())*1.01);
                fourxfour.setTranslateX(fourxone.getTranslateX()-(fourxone.getTranslateX()-fourxfour.getTranslateX())*1.01);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(fourxone.getTranslateY()-((fourxone.getTranslateY()-onextwo.getTranslateY())*1.01));
                onexthree.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-onexthree.getTranslateY())*1.01);
                onexfour.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-onexfour.getTranslateY())*1.01);
                
                twoxone.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-twoxone.getTranslateY())*1.01);
                twoxtwo.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-twoxtwo.getTranslateY())*1.01);
                twoxthree.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-twoxthree.getTranslateY())*1.01);
                twoxfour.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-twoxfour.getTranslateY())*1.01);
                
                threexone.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-threexone.getTranslateY())*1.01);
                threextwo.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-threextwo.getTranslateY())*1.01);
                threexthree.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-threexthree.getTranslateY())*1.01);
                threexfour.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-threexfour.getTranslateY())*1.01);
                
                fourxone.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-fourxone.getTranslateY())*1.01);
                fourxtwo.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-fourxtwo.getTranslateY())*1.01);
                fourxthree.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-fourxthree.getTranslateY())*1.01);
                fourxfour.setTranslateY(fourxone.getTranslateY()-(fourxone.getTranslateY()-fourxfour.getTranslateY())*1.01);
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
                onextwo.setTranslateX(fourxtwo.getTranslateX()-((fourxtwo.getTranslateX()-onextwo.getTranslateX())*1.01));
                onexthree.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-onexthree.getTranslateX())*1.01);
                onexfour.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-onexfour.getTranslateX())*1.01);
                
                twoxone.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-twoxone.getTranslateX())*1.01);
                twoxtwo.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-twoxtwo.getTranslateX())*1.01);
                twoxthree.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-twoxthree.getTranslateX())*1.01);
                twoxfour.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-twoxfour.getTranslateX())*1.01);
                
                threexone.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-threexone.getTranslateX())*1.01);
                threextwo.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-threextwo.getTranslateX())*1.01);
                threexthree.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-threexthree.getTranslateX())*1.01);
                threexfour.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-threexfour.getTranslateX())*1.01);
                
                fourxone.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-fourxone.getTranslateX())*1.01);
                onexone.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-onexone.getTranslateX())*1.01);
                fourxthree.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-fourxthree.getTranslateX())*1.01);
                fourxfour.setTranslateX(fourxtwo.getTranslateX()-(fourxtwo.getTranslateX()-fourxfour.getTranslateX())*1.01);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(fourxtwo.getTranslateY()-((fourxtwo.getTranslateY()-onextwo.getTranslateY())*1.01));
                onexthree.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-onexthree.getTranslateY())*1.01);
                onexfour.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-onexfour.getTranslateY())*1.01);
                
                twoxone.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-twoxone.getTranslateY())*1.01);
                twoxtwo.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-twoxtwo.getTranslateY())*1.01);
                twoxthree.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-twoxthree.getTranslateY())*1.01);
                twoxfour.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-twoxfour.getTranslateY())*1.01);
                
                threexone.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-threexone.getTranslateY())*1.01);
                threextwo.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-threextwo.getTranslateY())*1.01);
                threexthree.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-threexthree.getTranslateY())*1.01);
                threexfour.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-threexfour.getTranslateY())*1.01);
                
                fourxone.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-fourxone.getTranslateY())*1.01);
                fourxtwo.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-fourxtwo.getTranslateY())*1.01);
                fourxthree.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-fourxthree.getTranslateY())*1.01);
                fourxfour.setTranslateY(fourxtwo.getTranslateY()-(fourxtwo.getTranslateY()-fourxfour.getTranslateY())*1.01);
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
                onextwo.setTranslateX(fourxthree.getTranslateX()-((fourxthree.getTranslateX()-onextwo.getTranslateX())*1.01));
                onexthree.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-onexthree.getTranslateX())*1.01);
                onexfour.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-onexfour.getTranslateX())*1.01);
                
                twoxone.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-twoxone.getTranslateX())*1.01);
                twoxtwo.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-twoxtwo.getTranslateX())*1.01);
                twoxthree.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-twoxthree.getTranslateX())*1.01);
                twoxfour.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-twoxfour.getTranslateX())*1.01);
                
                threexone.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-threexone.getTranslateX())*1.01);
                threextwo.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-threextwo.getTranslateX())*1.01);
                threexthree.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-threexthree.getTranslateX())*1.01);
                threexfour.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-threexfour.getTranslateX())*1.01);
                
                fourxone.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-fourxone.getTranslateX())*1.01);
                fourxtwo.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-fourxtwo.getTranslateX())*1.01);
                onexone.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-onexone.getTranslateX())*1.01);
                fourxfour.setTranslateX(fourxthree.getTranslateX()-(fourxthree.getTranslateX()-fourxfour.getTranslateX())*1.01);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(fourxthree.getTranslateY()-((fourxthree.getTranslateY()-onextwo.getTranslateY())*1.01));
                onexthree.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-onexthree.getTranslateY())*1.01);
                onexfour.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-onexfour.getTranslateY())*1.01);
                
                twoxone.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-twoxone.getTranslateY())*1.01);
                twoxtwo.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-twoxtwo.getTranslateY())*1.01);
                twoxthree.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-twoxthree.getTranslateY())*1.01);
                twoxfour.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-twoxfour.getTranslateY())*1.01);
                
                threexone.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-threexone.getTranslateY())*1.01);
                threextwo.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-threextwo.getTranslateY())*1.01);
                threexthree.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-threexthree.getTranslateY())*1.01);
                threexfour.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-threexfour.getTranslateY())*1.01);
                
                fourxone.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-fourxone.getTranslateY())*1.01);
                fourxtwo.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-fourxtwo.getTranslateY())*1.01);
                fourxthree.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-fourxthree.getTranslateY())*1.01);
                fourxfour.setTranslateY(fourxthree.getTranslateY()-(fourxthree.getTranslateY()-fourxfour.getTranslateY())*1.01);
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
                onextwo.setTranslateX(fourxfour.getTranslateX()-((fourxfour.getTranslateX()-onextwo.getTranslateX())*1.01));
                onexthree.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-onexthree.getTranslateX())*1.01);
                onexfour.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-onexfour.getTranslateX())*1.01);
                
                twoxone.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-twoxone.getTranslateX())*1.01);
                twoxtwo.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-twoxtwo.getTranslateX())*1.01);
                twoxthree.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-twoxthree.getTranslateX())*1.01);
                twoxfour.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-twoxfour.getTranslateX())*1.01);
                
                threexone.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-threexone.getTranslateX())*1.01);
                threextwo.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-threextwo.getTranslateX())*1.01);
                threexthree.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-threexthree.getTranslateX())*1.01);
                threexfour.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-threexfour.getTranslateX())*1.01);
                
                fourxone.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-fourxone.getTranslateX())*1.01);
                fourxtwo.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-fourxtwo.getTranslateX())*1.01);
                fourxthree.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-fourxthree.getTranslateX())*1.01);
                onexone.setTranslateX(fourxfour.getTranslateX()-(fourxfour.getTranslateX()-onexone.getTranslateX())*1.01);
                //          TRANSLATE MANIPULATION FOR Y
                onextwo.setTranslateY(fourxfour.getTranslateY()-((fourxfour.getTranslateY()-onextwo.getTranslateY())*1.01));
                onexthree.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-onexthree.getTranslateY())*1.01);
                onexfour.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-onexfour.getTranslateY())*1.01);
                
                twoxone.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-twoxone.getTranslateY())*1.01);
                twoxtwo.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-twoxtwo.getTranslateY())*1.01);
                twoxthree.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-twoxthree.getTranslateY())*1.01);
                twoxfour.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-twoxfour.getTranslateY())*1.01);
                
                threexone.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-threexone.getTranslateY())*1.01);
                threextwo.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-threextwo.getTranslateY())*1.01);
                threexthree.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-threexthree.getTranslateY())*1.01);
                threexfour.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-threexfour.getTranslateY())*1.01);
                
                fourxone.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-fourxone.getTranslateY())*1.01);
                fourxtwo.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-fourxtwo.getTranslateY())*1.01);
                fourxthree.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-fourxthree.getTranslateY())*1.01);
                onexone.setTranslateY(fourxfour.getTranslateY()-(fourxfour.getTranslateY()-onexone.getTranslateY())*1.01);
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
