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
    

    //Created timeline in hopes of making animations upon button click
    final Timeline timeLine = new Timeline();
    
    @Override
    public void start(Stage primaryStage) {
        //Created the size and spacing of the buttons
        double buttonSize = 30;
        double buttonSpace = 40;
        double expandFactor = 1.02;
        double buttonLoc = 70;
        
        Button[][] but = new Button[4][4];
        
        for (int i = 0; i < but[0].length; i++){
            for (int j = 0; j < but[0].length; j++){
                but[i][j] = new Button();
            }
        }
        
        //1111111111111111111111111111111111111111111111111111111111111111111111
     
        but[0][0].setTranslateX((buttonSpace*0)-buttonLoc);
        but[0][0].setTranslateY((buttonSpace*0)-buttonLoc);
        but[0][0].setMinSize(buttonSize, buttonSize);
        but[0][0].setMaxSize(buttonSize, buttonSize);
        but[0][0].setText("[Start]");
        but[0][0].setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                //          TRANSLATE MANIPULATION FOR X
                but[0][1].setTranslateX(but[0][0].getTranslateX()-((but[0][0].getTranslateX()-but[0][1].getTranslateX())*expandFactor));
                but[0][2].setTranslateX(but[0][0].getTranslateX()-(but[0][0].getTranslateX()-but[0][2].getTranslateX())*expandFactor);
                but[0][3].setTranslateX(but[0][0].getTranslateX()-(but[0][0].getTranslateX()-but[0][3].getTranslateX())*expandFactor);
                
                but[1][0].setTranslateX(but[0][0].getTranslateX()-(but[0][0].getTranslateX()-but[1][0].getTranslateX())*expandFactor);
                but[1][1].setTranslateX(but[0][0].getTranslateX()-(but[0][0].getTranslateX()-but[1][1].getTranslateX())*expandFactor);
                but[1][2].setTranslateX(but[0][0].getTranslateX()-(but[0][0].getTranslateX()-but[1][2].getTranslateX())*expandFactor);
                but[1][3].setTranslateX(but[0][0].getTranslateX()-(but[0][0].getTranslateX()-but[1][3].getTranslateX())*expandFactor);
                
                but[2][0].setTranslateX(but[0][0].getTranslateX()-(but[0][0].getTranslateX()-but[2][0].getTranslateX())*expandFactor);
                but[2][1].setTranslateX(but[0][0].getTranslateX()-(but[0][0].getTranslateX()-but[2][1].getTranslateX())*expandFactor);
                but[2][2].setTranslateX(but[0][0].getTranslateX()-(but[0][0].getTranslateX()-but[2][2].getTranslateX())*expandFactor);
                but[2][3].setTranslateX(but[0][0].getTranslateX()-(but[0][0].getTranslateX()-but[2][3].getTranslateX())*expandFactor);
                
                but[3][0].setTranslateX(but[0][0].getTranslateX()-(but[0][0].getTranslateX()-but[3][0].getTranslateX())*expandFactor);
                but[3][1].setTranslateX(but[0][0].getTranslateX()-(but[0][0].getTranslateX()-but[3][1].getTranslateX())*expandFactor);
                but[3][2].setTranslateX(but[0][0].getTranslateX()-(but[0][0].getTranslateX()-but[3][2].getTranslateX())*expandFactor);
                but[3][3].setTranslateX(but[0][0].getTranslateX()-(but[0][0].getTranslateX()-but[3][3].getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                but[0][1].setTranslateY(but[0][0].getTranslateY()-((but[0][0].getTranslateY()-but[0][1].getTranslateY())*expandFactor));
                but[0][2].setTranslateY(but[0][0].getTranslateY()-(but[0][0].getTranslateY()-but[0][2].getTranslateY())*expandFactor);
                but[0][3].setTranslateY(but[0][0].getTranslateY()-(but[0][0].getTranslateY()-but[0][3].getTranslateY())*expandFactor);
                
                but[1][0].setTranslateY(but[0][0].getTranslateY()-(but[0][0].getTranslateY()-but[1][0].getTranslateY())*expandFactor);
                but[1][1].setTranslateY(but[0][0].getTranslateY()-(but[0][0].getTranslateY()-but[1][1].getTranslateY())*expandFactor);
                but[1][2].setTranslateY(but[0][0].getTranslateY()-(but[0][0].getTranslateY()-but[1][2].getTranslateY())*expandFactor);
                but[1][3].setTranslateY(but[0][0].getTranslateY()-(but[0][0].getTranslateY()-but[1][3].getTranslateY())*expandFactor);
                
                but[2][0].setTranslateY(but[0][0].getTranslateY()-(but[0][0].getTranslateY()-but[2][0].getTranslateY())*expandFactor);
                but[2][1].setTranslateY(but[0][0].getTranslateY()-(but[0][0].getTranslateY()-but[2][1].getTranslateY())*expandFactor);
                but[2][2].setTranslateY(but[0][0].getTranslateY()-(but[0][0].getTranslateY()-but[2][2].getTranslateY())*expandFactor);
                but[2][3].setTranslateY(but[0][0].getTranslateY()-(but[0][0].getTranslateY()-but[2][3].getTranslateY())*expandFactor);
                
                but[3][0].setTranslateY(but[0][0].getTranslateY()-(but[0][0].getTranslateY()-but[3][0].getTranslateY())*expandFactor);
                but[3][1].setTranslateY(but[0][0].getTranslateY()-(but[0][0].getTranslateY()-but[3][1].getTranslateY())*expandFactor);
                but[3][2].setTranslateY(but[0][0].getTranslateY()-(but[0][0].getTranslateY()-but[3][2].getTranslateY())*expandFactor);
                but[3][3].setTranslateY(but[0][0].getTranslateY()-(but[0][0].getTranslateY()-but[3][3].getTranslateY())*expandFactor);
            }
        });
        //1111111111111111111111111111111111111111111111111111111111111111111111
//     
        but[0][1].setTranslateX((buttonSpace*1)-buttonLoc);
        but[0][1].setTranslateY((buttonSpace*0)-buttonLoc);
        but[0][1].setMinSize(buttonSize, buttonSize);
        but[0][1].setMaxSize(buttonSize, buttonSize);
        but[0][1].setText("");
        but[0][1].setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                but[0][0].setTranslateX(but[0][1].getTranslateX()-((but[0][1].getTranslateX()-but[0][0].getTranslateX())*expandFactor));
                but[0][2].setTranslateX(but[0][1].getTranslateX()-(but[0][1].getTranslateX()-but[0][2].getTranslateX())*expandFactor);
                but[0][3].setTranslateX(but[0][1].getTranslateX()-(but[0][1].getTranslateX()-but[0][3].getTranslateX())*expandFactor);
                
                but[1][0].setTranslateX(but[0][1].getTranslateX()-(but[0][1].getTranslateX()-but[1][0].getTranslateX())*expandFactor);
                but[1][1].setTranslateX(but[0][1].getTranslateX()-(but[0][1].getTranslateX()-but[1][1].getTranslateX())*expandFactor);
                but[1][2].setTranslateX(but[0][1].getTranslateX()-(but[0][1].getTranslateX()-but[1][2].getTranslateX())*expandFactor);
                but[1][3].setTranslateX(but[0][1].getTranslateX()-(but[0][1].getTranslateX()-but[1][3].getTranslateX())*expandFactor);
                
                but[2][0].setTranslateX(but[0][1].getTranslateX()-(but[0][1].getTranslateX()-but[2][0].getTranslateX())*expandFactor);
                but[2][1].setTranslateX(but[0][1].getTranslateX()-(but[0][1].getTranslateX()-but[2][1].getTranslateX())*expandFactor);
                but[2][2].setTranslateX(but[0][1].getTranslateX()-(but[0][1].getTranslateX()-but[2][2].getTranslateX())*expandFactor);
                but[2][3].setTranslateX(but[0][1].getTranslateX()-(but[0][1].getTranslateX()-but[2][3].getTranslateX())*expandFactor);
                
                but[3][0].setTranslateX(but[0][1].getTranslateX()-(but[0][1].getTranslateX()-but[3][0].getTranslateX())*expandFactor);
                but[3][1].setTranslateX(but[0][1].getTranslateX()-(but[0][1].getTranslateX()-but[3][1].getTranslateX())*expandFactor);
                but[3][2].setTranslateX(but[0][1].getTranslateX()-(but[0][1].getTranslateX()-but[3][2].getTranslateX())*expandFactor);
                but[3][3].setTranslateX(but[0][1].getTranslateX()-(but[0][1].getTranslateX()-but[3][3].getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                but[0][1].setTranslateY(but[0][1].getTranslateY()-((but[0][1].getTranslateY()-but[0][1].getTranslateY())*expandFactor));
                but[0][2].setTranslateY(but[0][1].getTranslateY()-(but[0][1].getTranslateY()-but[0][2].getTranslateY())*expandFactor);
                but[0][3].setTranslateY(but[0][1].getTranslateY()-(but[0][1].getTranslateY()-but[0][3].getTranslateY())*expandFactor);
                
                but[1][0].setTranslateY(but[0][1].getTranslateY()-(but[0][1].getTranslateY()-but[1][0].getTranslateY())*expandFactor);
                but[0][0].setTranslateY(but[0][1].getTranslateY()-(but[0][1].getTranslateY()-but[0][0].getTranslateY())*expandFactor);
                but[1][2].setTranslateY(but[0][1].getTranslateY()-(but[0][1].getTranslateY()-but[1][2].getTranslateY())*expandFactor);
                but[1][3].setTranslateY(but[0][1].getTranslateY()-(but[0][1].getTranslateY()-but[1][3].getTranslateY())*expandFactor);
                
                but[2][0].setTranslateY(but[0][1].getTranslateY()-(but[0][1].getTranslateY()-but[2][0].getTranslateY())*expandFactor);
                but[2][1].setTranslateY(but[0][1].getTranslateY()-(but[0][1].getTranslateY()-but[2][1].getTranslateY())*expandFactor);
                but[2][2].setTranslateY(but[0][1].getTranslateY()-(but[0][1].getTranslateY()-but[2][2].getTranslateY())*expandFactor);
                but[2][3].setTranslateY(but[0][1].getTranslateY()-(but[0][1].getTranslateY()-but[2][3].getTranslateY())*expandFactor);
                
                but[3][0].setTranslateY(but[0][1].getTranslateY()-(but[0][1].getTranslateY()-but[3][0].getTranslateY())*expandFactor);
                but[3][1].setTranslateY(but[0][1].getTranslateY()-(but[0][1].getTranslateY()-but[3][1].getTranslateY())*expandFactor);
                but[3][2].setTranslateY(but[0][1].getTranslateY()-(but[0][1].getTranslateY()-but[3][2].getTranslateY())*expandFactor);
                but[3][3].setTranslateY(but[0][1].getTranslateY()-(but[0][1].getTranslateY()-but[3][3].getTranslateY())*expandFactor);
            }
        });
        //1111111111111111111111111111111111111111111111111111111111111111111111
       
        but[0][2].setTranslateX((buttonSpace*2)-buttonLoc);
        but[0][2].setTranslateY((buttonSpace*0)-buttonLoc);
        but[0][2].setMinSize(buttonSize, buttonSize);
        but[0][2].setMaxSize(buttonSize, buttonSize);
        but[0][2].setText("");
        but[0][2].setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                but[0][1].setTranslateX(but[0][2].getTranslateX()-((but[0][2].getTranslateX()-but[0][1].getTranslateX())*expandFactor));
                but[0][0].setTranslateX(but[0][2].getTranslateX()-(but[0][2].getTranslateX()-but[0][0].getTranslateX())*expandFactor);
                but[0][3].setTranslateX(but[0][2].getTranslateX()-(but[0][2].getTranslateX()-but[0][3].getTranslateX())*expandFactor);
                
                but[1][0].setTranslateX(but[0][2].getTranslateX()-(but[0][2].getTranslateX()-but[1][0].getTranslateX())*expandFactor);
                but[1][1].setTranslateX(but[0][2].getTranslateX()-(but[0][2].getTranslateX()-but[1][1].getTranslateX())*expandFactor);
                but[1][2].setTranslateX(but[0][2].getTranslateX()-(but[0][2].getTranslateX()-but[1][2].getTranslateX())*expandFactor);
                but[1][3].setTranslateX(but[0][2].getTranslateX()-(but[0][2].getTranslateX()-but[1][3].getTranslateX())*expandFactor);
                
                but[2][0].setTranslateX(but[0][2].getTranslateX()-(but[0][2].getTranslateX()-but[2][0].getTranslateX())*expandFactor);
                but[2][1].setTranslateX(but[0][2].getTranslateX()-(but[0][2].getTranslateX()-but[2][1].getTranslateX())*expandFactor);
                but[2][2].setTranslateX(but[0][2].getTranslateX()-(but[0][2].getTranslateX()-but[2][2].getTranslateX())*expandFactor);
                but[2][3].setTranslateX(but[0][2].getTranslateX()-(but[0][2].getTranslateX()-but[2][3].getTranslateX())*expandFactor);
                
                but[3][0].setTranslateX(but[0][2].getTranslateX()-(but[0][2].getTranslateX()-but[3][0].getTranslateX())*expandFactor);
                but[3][1].setTranslateX(but[0][2].getTranslateX()-(but[0][2].getTranslateX()-but[3][1].getTranslateX())*expandFactor);
                but[3][2].setTranslateX(but[0][2].getTranslateX()-(but[0][2].getTranslateX()-but[3][2].getTranslateX())*expandFactor);
                but[3][3].setTranslateX(but[0][2].getTranslateX()-(but[0][2].getTranslateX()-but[3][3].getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                but[0][1].setTranslateY(but[0][2].getTranslateY()-((but[0][2].getTranslateY()-but[0][1].getTranslateY())*expandFactor));
                but[0][0].setTranslateY(but[0][2].getTranslateY()-(but[0][2].getTranslateY()-but[0][0].getTranslateY())*expandFactor);
                but[0][3].setTranslateY(but[0][2].getTranslateY()-(but[0][2].getTranslateY()-but[0][3].getTranslateY())*expandFactor);
                
                but[1][0].setTranslateY(but[0][2].getTranslateY()-(but[0][2].getTranslateY()-but[1][0].getTranslateY())*expandFactor);
                but[1][1].setTranslateY(but[0][2].getTranslateY()-(but[0][2].getTranslateY()-but[1][1].getTranslateY())*expandFactor);
                but[1][2].setTranslateY(but[0][2].getTranslateY()-(but[0][2].getTranslateY()-but[1][2].getTranslateY())*expandFactor);
                but[1][3].setTranslateY(but[0][2].getTranslateY()-(but[0][2].getTranslateY()-but[1][3].getTranslateY())*expandFactor);
                
                but[2][0].setTranslateY(but[0][2].getTranslateY()-(but[0][2].getTranslateY()-but[2][0].getTranslateY())*expandFactor);
                but[2][1].setTranslateY(but[0][2].getTranslateY()-(but[0][2].getTranslateY()-but[2][1].getTranslateY())*expandFactor);
                but[2][2].setTranslateY(but[0][2].getTranslateY()-(but[0][2].getTranslateY()-but[2][2].getTranslateY())*expandFactor);
                but[2][3].setTranslateY(but[0][2].getTranslateY()-(but[0][2].getTranslateY()-but[2][3].getTranslateY())*expandFactor);
                
                but[3][0].setTranslateY(but[0][2].getTranslateY()-(but[0][2].getTranslateY()-but[3][0].getTranslateY())*expandFactor);
                but[3][1].setTranslateY(but[0][2].getTranslateY()-(but[0][2].getTranslateY()-but[3][1].getTranslateY())*expandFactor);
                but[3][2].setTranslateY(but[0][2].getTranslateY()-(but[0][2].getTranslateY()-but[3][2].getTranslateY())*expandFactor);
                but[3][3].setTranslateY(but[0][2].getTranslateY()-(but[0][2].getTranslateY()-but[3][3].getTranslateY())*expandFactor);
            }
        });
        //1111111111111111111111111111111111111111111111111111111111111111111111
      
        but[0][3].setTranslateX((buttonSpace*3)-buttonLoc);
        but[0][3].setTranslateY((buttonSpace*0)-buttonLoc);
        but[0][3].setMinSize(buttonSize, buttonSize);
        but[0][3].setMaxSize(buttonSize, buttonSize);
        but[0][3].setText("");
        but[0][3].setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                but[0][1].setTranslateX(but[0][3].getTranslateX()-((but[0][3].getTranslateX()-but[0][1].getTranslateX())*expandFactor));
                but[0][2].setTranslateX(but[0][3].getTranslateX()-(but[0][3].getTranslateX()-but[0][2].getTranslateX())*expandFactor);
                but[0][0].setTranslateX(but[0][3].getTranslateX()-(but[0][3].getTranslateX()-but[0][0].getTranslateX())*expandFactor);
                
                but[1][0].setTranslateX(but[0][3].getTranslateX()-(but[0][3].getTranslateX()-but[1][0].getTranslateX())*expandFactor);
                but[1][1].setTranslateX(but[0][3].getTranslateX()-(but[0][3].getTranslateX()-but[1][1].getTranslateX())*expandFactor);
                but[1][2].setTranslateX(but[0][3].getTranslateX()-(but[0][3].getTranslateX()-but[1][2].getTranslateX())*expandFactor);
                but[1][3].setTranslateX(but[0][3].getTranslateX()-(but[0][3].getTranslateX()-but[1][3].getTranslateX())*expandFactor);
                
                but[2][0].setTranslateX(but[0][3].getTranslateX()-(but[0][3].getTranslateX()-but[2][0].getTranslateX())*expandFactor);
                but[2][1].setTranslateX(but[0][3].getTranslateX()-(but[0][3].getTranslateX()-but[2][1].getTranslateX())*expandFactor);
                but[2][2].setTranslateX(but[0][3].getTranslateX()-(but[0][3].getTranslateX()-but[2][2].getTranslateX())*expandFactor);
                but[2][3].setTranslateX(but[0][3].getTranslateX()-(but[0][3].getTranslateX()-but[2][3].getTranslateX())*expandFactor);
                
                but[3][0].setTranslateX(but[0][3].getTranslateX()-(but[0][3].getTranslateX()-but[3][0].getTranslateX())*expandFactor);
                but[3][1].setTranslateX(but[0][3].getTranslateX()-(but[0][3].getTranslateX()-but[3][1].getTranslateX())*expandFactor);
                but[3][2].setTranslateX(but[0][3].getTranslateX()-(but[0][3].getTranslateX()-but[3][2].getTranslateX())*expandFactor);
                but[3][3].setTranslateX(but[0][3].getTranslateX()-(but[0][3].getTranslateX()-but[3][3].getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                but[0][1].setTranslateY(but[0][3].getTranslateY()-((but[0][3].getTranslateY()-but[0][1].getTranslateY())*expandFactor));
                but[0][2].setTranslateY(but[0][3].getTranslateY()-(but[0][3].getTranslateY()-but[0][2].getTranslateY())*expandFactor);
                but[0][3].setTranslateY(but[0][3].getTranslateY()-(but[0][3].getTranslateY()-but[0][3].getTranslateY())*expandFactor);
                
                but[1][0].setTranslateY(but[0][3].getTranslateY()-(but[0][3].getTranslateY()-but[1][0].getTranslateY())*expandFactor);
                but[1][1].setTranslateY(but[0][3].getTranslateY()-(but[0][3].getTranslateY()-but[1][1].getTranslateY())*expandFactor);
                but[1][2].setTranslateY(but[0][3].getTranslateY()-(but[0][3].getTranslateY()-but[1][2].getTranslateY())*expandFactor);
                but[1][3].setTranslateY(but[0][3].getTranslateY()-(but[0][3].getTranslateY()-but[1][3].getTranslateY())*expandFactor);
                
                but[2][0].setTranslateY(but[0][3].getTranslateY()-(but[0][3].getTranslateY()-but[2][0].getTranslateY())*expandFactor);
                but[2][1].setTranslateY(but[0][3].getTranslateY()-(but[0][3].getTranslateY()-but[2][1].getTranslateY())*expandFactor);
                but[2][2].setTranslateY(but[0][3].getTranslateY()-(but[0][3].getTranslateY()-but[2][2].getTranslateY())*expandFactor);
                but[2][3].setTranslateY(but[0][3].getTranslateY()-(but[0][3].getTranslateY()-but[2][3].getTranslateY())*expandFactor);
                
                but[3][0].setTranslateY(but[0][3].getTranslateY()-(but[0][3].getTranslateY()-but[3][0].getTranslateY())*expandFactor);
                but[3][1].setTranslateY(but[0][3].getTranslateY()-(but[0][3].getTranslateY()-but[3][1].getTranslateY())*expandFactor);
                but[3][2].setTranslateY(but[0][3].getTranslateY()-(but[0][3].getTranslateY()-but[3][2].getTranslateY())*expandFactor);
                but[3][3].setTranslateY(but[0][3].getTranslateY()-(but[0][3].getTranslateY()-but[3][3].getTranslateY())*expandFactor);
            }
        });
        //2222222222222222222222222222222222222222222222222222222222222222222222
     
        but[1][0].setTranslateX((buttonSpace*0)-buttonLoc);
        but[1][0].setTranslateY((buttonSpace*1)-buttonLoc);
        but[1][0].setMinSize(buttonSize, buttonSize);
        but[1][0].setMaxSize(buttonSize, buttonSize);
        but[1][0].setText("");
        but[1][0].setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                but[0][1].setTranslateX(but[1][0].getTranslateX()-((but[1][0].getTranslateX()-but[0][1].getTranslateX())*expandFactor));
                but[0][2].setTranslateX(but[1][0].getTranslateX()-(but[1][0].getTranslateX()-but[0][2].getTranslateX())*expandFactor);
                but[0][3].setTranslateX(but[1][0].getTranslateX()-(but[1][0].getTranslateX()-but[0][3].getTranslateX())*expandFactor);
                
                but[0][0].setTranslateX(but[1][0].getTranslateX()-(but[1][0].getTranslateX()-but[0][0].getTranslateX())*expandFactor);
                but[1][1].setTranslateX(but[1][0].getTranslateX()-(but[1][0].getTranslateX()-but[1][1].getTranslateX())*expandFactor);
                but[1][2].setTranslateX(but[1][0].getTranslateX()-(but[1][0].getTranslateX()-but[1][2].getTranslateX())*expandFactor);
                but[1][3].setTranslateX(but[1][0].getTranslateX()-(but[1][0].getTranslateX()-but[1][3].getTranslateX())*expandFactor);
                
                but[2][0].setTranslateX(but[1][0].getTranslateX()-(but[1][0].getTranslateX()-but[2][0].getTranslateX())*expandFactor);
                but[2][1].setTranslateX(but[1][0].getTranslateX()-(but[1][0].getTranslateX()-but[2][1].getTranslateX())*expandFactor);
                but[2][2].setTranslateX(but[1][0].getTranslateX()-(but[1][0].getTranslateX()-but[2][2].getTranslateX())*expandFactor);
                but[2][3].setTranslateX(but[1][0].getTranslateX()-(but[1][0].getTranslateX()-but[2][3].getTranslateX())*expandFactor);
                
                but[3][0].setTranslateX(but[1][0].getTranslateX()-(but[1][0].getTranslateX()-but[3][0].getTranslateX())*expandFactor);
                but[3][1].setTranslateX(but[1][0].getTranslateX()-(but[1][0].getTranslateX()-but[3][1].getTranslateX())*expandFactor);
                but[3][2].setTranslateX(but[1][0].getTranslateX()-(but[1][0].getTranslateX()-but[3][2].getTranslateX())*expandFactor);
                but[3][3].setTranslateX(but[1][0].getTranslateX()-(but[1][0].getTranslateX()-but[3][3].getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                but[0][1].setTranslateY(but[1][0].getTranslateY()-((but[1][0].getTranslateY()-but[0][1].getTranslateY())*expandFactor));
                but[0][2].setTranslateY(but[1][0].getTranslateY()-(but[1][0].getTranslateY()-but[0][2].getTranslateY())*expandFactor);
                but[0][3].setTranslateY(but[1][0].getTranslateY()-(but[1][0].getTranslateY()-but[0][3].getTranslateY())*expandFactor);
                
                but[1][0].setTranslateY(but[1][0].getTranslateY()-(but[1][0].getTranslateY()-but[1][0].getTranslateY())*expandFactor);
                but[1][1].setTranslateY(but[1][0].getTranslateY()-(but[1][0].getTranslateY()-but[1][1].getTranslateY())*expandFactor);
                but[1][2].setTranslateY(but[1][0].getTranslateY()-(but[1][0].getTranslateY()-but[1][2].getTranslateY())*expandFactor);
                but[1][3].setTranslateY(but[1][0].getTranslateY()-(but[1][0].getTranslateY()-but[1][3].getTranslateY())*expandFactor);
                
                but[2][0].setTranslateY(but[1][0].getTranslateY()-(but[1][0].getTranslateY()-but[2][0].getTranslateY())*expandFactor);
                but[2][1].setTranslateY(but[1][0].getTranslateY()-(but[1][0].getTranslateY()-but[2][1].getTranslateY())*expandFactor);
                but[2][2].setTranslateY(but[1][0].getTranslateY()-(but[1][0].getTranslateY()-but[2][2].getTranslateY())*expandFactor);
                but[2][3].setTranslateY(but[1][0].getTranslateY()-(but[1][0].getTranslateY()-but[2][3].getTranslateY())*expandFactor);
                
                but[3][0].setTranslateY(but[1][0].getTranslateY()-(but[1][0].getTranslateY()-but[3][0].getTranslateY())*expandFactor);
                but[3][1].setTranslateY(but[1][0].getTranslateY()-(but[1][0].getTranslateY()-but[3][1].getTranslateY())*expandFactor);
                but[3][2].setTranslateY(but[1][0].getTranslateY()-(but[1][0].getTranslateY()-but[3][2].getTranslateY())*expandFactor);
                but[3][3].setTranslateY(but[1][0].getTranslateY()-(but[1][0].getTranslateY()-but[3][3].getTranslateY())*expandFactor);
            }
        });
        //2222222222222222222222222222222222222222222222222222222222222222222222
     
        but[1][1].setTranslateX((buttonSpace*1)-buttonLoc);
        but[1][1].setTranslateY((buttonSpace*1)-buttonLoc);
        but[1][1].setMinSize(buttonSize, buttonSize);
        but[1][1].setMaxSize(buttonSize, buttonSize);
        but[1][1].setText("");
        but[1][1].setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                but[0][1].setTranslateX(but[1][1].getTranslateX()-((but[1][1].getTranslateX()-but[0][1].getTranslateX())*expandFactor));
                but[0][2].setTranslateX(but[1][1].getTranslateX()-(but[1][1].getTranslateX()-but[0][2].getTranslateX())*expandFactor);
                but[0][3].setTranslateX(but[1][1].getTranslateX()-(but[1][1].getTranslateX()-but[0][3].getTranslateX())*expandFactor);
                
                but[1][0].setTranslateX(but[1][1].getTranslateX()-(but[1][1].getTranslateX()-but[1][0].getTranslateX())*expandFactor);
                but[0][0].setTranslateX(but[1][1].getTranslateX()-(but[1][1].getTranslateX()-but[0][0].getTranslateX())*expandFactor);
                but[1][2].setTranslateX(but[1][1].getTranslateX()-(but[1][1].getTranslateX()-but[1][2].getTranslateX())*expandFactor);
                but[1][3].setTranslateX(but[1][1].getTranslateX()-(but[1][1].getTranslateX()-but[1][3].getTranslateX())*expandFactor);
                
                but[2][0].setTranslateX(but[1][1].getTranslateX()-(but[1][1].getTranslateX()-but[2][0].getTranslateX())*expandFactor);
                but[2][1].setTranslateX(but[1][1].getTranslateX()-(but[1][1].getTranslateX()-but[2][1].getTranslateX())*expandFactor);
                but[2][2].setTranslateX(but[1][1].getTranslateX()-(but[1][1].getTranslateX()-but[2][2].getTranslateX())*expandFactor);
                but[2][3].setTranslateX(but[1][1].getTranslateX()-(but[1][1].getTranslateX()-but[2][3].getTranslateX())*expandFactor);
                
                but[3][0].setTranslateX(but[1][1].getTranslateX()-(but[1][1].getTranslateX()-but[3][0].getTranslateX())*expandFactor);
                but[3][1].setTranslateX(but[1][1].getTranslateX()-(but[1][1].getTranslateX()-but[3][1].getTranslateX())*expandFactor);
                but[3][2].setTranslateX(but[1][1].getTranslateX()-(but[1][1].getTranslateX()-but[3][2].getTranslateX())*expandFactor);
                but[3][3].setTranslateX(but[1][1].getTranslateX()-(but[1][1].getTranslateX()-but[3][3].getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                but[0][1].setTranslateY(but[1][1].getTranslateY()-((but[1][1].getTranslateY()-but[0][1].getTranslateY())*expandFactor));
                but[0][2].setTranslateY(but[1][1].getTranslateY()-(but[1][1].getTranslateY()-but[0][2].getTranslateY())*expandFactor);
                but[0][3].setTranslateY(but[1][1].getTranslateY()-(but[1][1].getTranslateY()-but[0][3].getTranslateY())*expandFactor);
                
                but[1][0].setTranslateY(but[1][1].getTranslateY()-(but[1][1].getTranslateY()-but[1][0].getTranslateY())*expandFactor);
                but[0][0].setTranslateY(but[1][1].getTranslateY()-(but[1][1].getTranslateY()-but[0][0].getTranslateY())*expandFactor);
                but[1][2].setTranslateY(but[1][1].getTranslateY()-(but[1][1].getTranslateY()-but[1][2].getTranslateY())*expandFactor);
                but[1][3].setTranslateY(but[1][1].getTranslateY()-(but[1][1].getTranslateY()-but[1][3].getTranslateY())*expandFactor);
                
                but[2][0].setTranslateY(but[1][1].getTranslateY()-(but[1][1].getTranslateY()-but[2][0].getTranslateY())*expandFactor);
                but[2][1].setTranslateY(but[1][1].getTranslateY()-(but[1][1].getTranslateY()-but[2][1].getTranslateY())*expandFactor);
                but[2][2].setTranslateY(but[1][1].getTranslateY()-(but[1][1].getTranslateY()-but[2][2].getTranslateY())*expandFactor);
                but[2][3].setTranslateY(but[1][1].getTranslateY()-(but[1][1].getTranslateY()-but[2][3].getTranslateY())*expandFactor);
                
                but[3][0].setTranslateY(but[1][1].getTranslateY()-(but[1][1].getTranslateY()-but[3][0].getTranslateY())*expandFactor);
                but[3][1].setTranslateY(but[1][1].getTranslateY()-(but[1][1].getTranslateY()-but[3][1].getTranslateY())*expandFactor);
                but[3][2].setTranslateY(but[1][1].getTranslateY()-(but[1][1].getTranslateY()-but[3][2].getTranslateY())*expandFactor);
                but[3][3].setTranslateY(but[1][1].getTranslateY()-(but[1][1].getTranslateY()-but[3][3].getTranslateY())*expandFactor);
            }
        });
        //2222222222222222222222222222222222222222222222222222222222222222222222
       
        but[1][2].setTranslateX((buttonSpace*2)-buttonLoc);
        but[1][2].setTranslateY((buttonSpace*1)-buttonLoc);
        but[1][2].setMinSize(buttonSize, buttonSize);
        but[1][2].setMaxSize(buttonSize, buttonSize);
        but[1][2].setText("");
        but[1][2].setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                but[0][1].setTranslateX(but[1][2].getTranslateX()-((but[1][2].getTranslateX()-but[0][1].getTranslateX())*expandFactor));
                but[0][2].setTranslateX(but[1][2].getTranslateX()-(but[1][2].getTranslateX()-but[0][2].getTranslateX())*expandFactor);
                but[0][3].setTranslateX(but[1][2].getTranslateX()-(but[1][2].getTranslateX()-but[0][3].getTranslateX())*expandFactor);
                
                but[1][0].setTranslateX(but[1][2].getTranslateX()-(but[1][2].getTranslateX()-but[1][0].getTranslateX())*expandFactor);
                but[1][1].setTranslateX(but[1][2].getTranslateX()-(but[1][2].getTranslateX()-but[1][1].getTranslateX())*expandFactor);
                but[0][0].setTranslateX(but[1][2].getTranslateX()-(but[1][2].getTranslateX()-but[0][0].getTranslateX())*expandFactor);
                but[1][3].setTranslateX(but[1][2].getTranslateX()-(but[1][2].getTranslateX()-but[1][3].getTranslateX())*expandFactor);
                
                but[2][0].setTranslateX(but[1][2].getTranslateX()-(but[1][2].getTranslateX()-but[2][0].getTranslateX())*expandFactor);
                but[2][1].setTranslateX(but[1][2].getTranslateX()-(but[1][2].getTranslateX()-but[2][1].getTranslateX())*expandFactor);
                but[2][2].setTranslateX(but[1][2].getTranslateX()-(but[1][2].getTranslateX()-but[2][2].getTranslateX())*expandFactor);
                but[2][3].setTranslateX(but[1][2].getTranslateX()-(but[1][2].getTranslateX()-but[2][3].getTranslateX())*expandFactor);
                
                but[3][0].setTranslateX(but[1][2].getTranslateX()-(but[1][2].getTranslateX()-but[3][0].getTranslateX())*expandFactor);
                but[3][1].setTranslateX(but[1][2].getTranslateX()-(but[1][2].getTranslateX()-but[3][1].getTranslateX())*expandFactor);
                but[3][2].setTranslateX(but[1][2].getTranslateX()-(but[1][2].getTranslateX()-but[3][2].getTranslateX())*expandFactor);
                but[3][3].setTranslateX(but[1][2].getTranslateX()-(but[1][2].getTranslateX()-but[3][3].getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                but[0][1].setTranslateY(but[1][2].getTranslateY()-((but[1][2].getTranslateY()-but[0][1].getTranslateY())*expandFactor));
                but[0][2].setTranslateY(but[1][2].getTranslateY()-(but[1][2].getTranslateY()-but[0][2].getTranslateY())*expandFactor);
                but[0][3].setTranslateY(but[1][2].getTranslateY()-(but[1][2].getTranslateY()-but[0][3].getTranslateY())*expandFactor);
                
                but[1][0].setTranslateY(but[1][2].getTranslateY()-(but[1][2].getTranslateY()-but[1][0].getTranslateY())*expandFactor);
                but[1][1].setTranslateY(but[1][2].getTranslateY()-(but[1][2].getTranslateY()-but[1][1].getTranslateY())*expandFactor);
                but[0][0].setTranslateY(but[1][2].getTranslateY()-(but[1][2].getTranslateY()-but[0][0].getTranslateY())*expandFactor);
                but[1][3].setTranslateY(but[1][2].getTranslateY()-(but[1][2].getTranslateY()-but[1][3].getTranslateY())*expandFactor);
                
                but[2][0].setTranslateY(but[1][2].getTranslateY()-(but[1][2].getTranslateY()-but[2][0].getTranslateY())*expandFactor);
                but[2][1].setTranslateY(but[1][2].getTranslateY()-(but[1][2].getTranslateY()-but[2][1].getTranslateY())*expandFactor);
                but[2][2].setTranslateY(but[1][2].getTranslateY()-(but[1][2].getTranslateY()-but[2][2].getTranslateY())*expandFactor);
                but[2][3].setTranslateY(but[1][2].getTranslateY()-(but[1][2].getTranslateY()-but[2][3].getTranslateY())*expandFactor);
                
                but[3][0].setTranslateY(but[1][2].getTranslateY()-(but[1][2].getTranslateY()-but[3][0].getTranslateY())*expandFactor);
                but[3][1].setTranslateY(but[1][2].getTranslateY()-(but[1][2].getTranslateY()-but[3][1].getTranslateY())*expandFactor);
                but[3][2].setTranslateY(but[1][2].getTranslateY()-(but[1][2].getTranslateY()-but[3][2].getTranslateY())*expandFactor);
                but[3][3].setTranslateY(but[1][2].getTranslateY()-(but[1][2].getTranslateY()-but[3][3].getTranslateY())*expandFactor);
            }
        });
        //2222222222222222222222222222222222222222222222222222222222222222222222
      
        but[1][3].setTranslateX((buttonSpace*3)-buttonLoc);
        but[1][3].setTranslateY((buttonSpace*1)-buttonLoc);
        but[1][3].setMinSize(buttonSize, buttonSize);
        but[1][3].setMaxSize(buttonSize, buttonSize);
        but[1][3].setText("");
        but[1][3].setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                but[0][1].setTranslateX(but[1][3].getTranslateX()-((but[1][3].getTranslateX()-but[0][1].getTranslateX())*expandFactor));
                but[0][2].setTranslateX(but[1][3].getTranslateX()-(but[1][3].getTranslateX()-but[0][2].getTranslateX())*expandFactor);
                but[0][3].setTranslateX(but[1][3].getTranslateX()-(but[1][3].getTranslateX()-but[0][3].getTranslateX())*expandFactor);
                
                but[1][0].setTranslateX(but[1][3].getTranslateX()-(but[1][3].getTranslateX()-but[1][0].getTranslateX())*expandFactor);
                but[1][1].setTranslateX(but[1][3].getTranslateX()-(but[1][3].getTranslateX()-but[1][1].getTranslateX())*expandFactor);
                but[1][2].setTranslateX(but[1][3].getTranslateX()-(but[1][3].getTranslateX()-but[1][2].getTranslateX())*expandFactor);
                but[0][0].setTranslateX(but[1][3].getTranslateX()-(but[1][3].getTranslateX()-but[0][0].getTranslateX())*expandFactor);
                
                but[2][0].setTranslateX(but[1][3].getTranslateX()-(but[1][3].getTranslateX()-but[2][0].getTranslateX())*expandFactor);
                but[2][1].setTranslateX(but[1][3].getTranslateX()-(but[1][3].getTranslateX()-but[2][1].getTranslateX())*expandFactor);
                but[2][2].setTranslateX(but[1][3].getTranslateX()-(but[1][3].getTranslateX()-but[2][2].getTranslateX())*expandFactor);
                but[2][3].setTranslateX(but[1][3].getTranslateX()-(but[1][3].getTranslateX()-but[2][3].getTranslateX())*expandFactor);
                
                but[3][0].setTranslateX(but[1][3].getTranslateX()-(but[1][3].getTranslateX()-but[3][0].getTranslateX())*expandFactor);
                but[3][1].setTranslateX(but[1][3].getTranslateX()-(but[1][3].getTranslateX()-but[3][1].getTranslateX())*expandFactor);
                but[3][2].setTranslateX(but[1][3].getTranslateX()-(but[1][3].getTranslateX()-but[3][2].getTranslateX())*expandFactor);
                but[3][3].setTranslateX(but[1][3].getTranslateX()-(but[1][3].getTranslateX()-but[3][3].getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                but[0][1].setTranslateY(but[1][3].getTranslateY()-((but[1][3].getTranslateY()-but[0][1].getTranslateY())*expandFactor));
                but[0][2].setTranslateY(but[1][3].getTranslateY()-(but[1][3].getTranslateY()-but[0][2].getTranslateY())*expandFactor);
                but[0][3].setTranslateY(but[1][3].getTranslateY()-(but[1][3].getTranslateY()-but[0][3].getTranslateY())*expandFactor);
                
                but[1][0].setTranslateY(but[1][3].getTranslateY()-(but[1][3].getTranslateY()-but[1][0].getTranslateY())*expandFactor);
                but[1][1].setTranslateY(but[1][3].getTranslateY()-(but[1][3].getTranslateY()-but[1][1].getTranslateY())*expandFactor);
                but[1][2].setTranslateY(but[1][3].getTranslateY()-(but[1][3].getTranslateY()-but[1][2].getTranslateY())*expandFactor);
                but[0][0].setTranslateY(but[1][3].getTranslateY()-(but[1][3].getTranslateY()-but[0][0].getTranslateY())*expandFactor);
                
                but[2][0].setTranslateY(but[1][3].getTranslateY()-(but[1][3].getTranslateY()-but[2][0].getTranslateY())*expandFactor);
                but[2][1].setTranslateY(but[1][3].getTranslateY()-(but[1][3].getTranslateY()-but[2][1].getTranslateY())*expandFactor);
                but[2][2].setTranslateY(but[1][3].getTranslateY()-(but[1][3].getTranslateY()-but[2][2].getTranslateY())*expandFactor);
                but[2][3].setTranslateY(but[1][3].getTranslateY()-(but[1][3].getTranslateY()-but[2][3].getTranslateY())*expandFactor);
                
                but[3][0].setTranslateY(but[1][3].getTranslateY()-(but[1][3].getTranslateY()-but[3][0].getTranslateY())*expandFactor);
                but[3][1].setTranslateY(but[1][3].getTranslateY()-(but[1][3].getTranslateY()-but[3][1].getTranslateY())*expandFactor);
                but[3][2].setTranslateY(but[1][3].getTranslateY()-(but[1][3].getTranslateY()-but[3][2].getTranslateY())*expandFactor);
                but[3][3].setTranslateY(but[1][3].getTranslateY()-(but[1][3].getTranslateY()-but[3][3].getTranslateY())*expandFactor);
            }
        });
        //3333333333333333333333333333333333333333333333333333333333333333333333
       
        but[2][0].setTranslateX((buttonSpace*0)-buttonLoc);
        but[2][0].setTranslateY((buttonSpace*2)-buttonLoc);
        but[2][0].setMinSize(buttonSize, buttonSize);
        but[2][0].setMaxSize(buttonSize, buttonSize);
        but[2][0].setText("");
        but[2][0].setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                but[0][1].setTranslateX(but[2][0].getTranslateX()-((but[2][0].getTranslateX()-but[0][1].getTranslateX())*expandFactor));
                but[0][2].setTranslateX(but[2][0].getTranslateX()-(but[2][0].getTranslateX()-but[0][2].getTranslateX())*expandFactor);
                but[0][3].setTranslateX(but[2][0].getTranslateX()-(but[2][0].getTranslateX()-but[0][3].getTranslateX())*expandFactor);
                
                but[1][0].setTranslateX(but[2][0].getTranslateX()-(but[2][0].getTranslateX()-but[1][0].getTranslateX())*expandFactor);
                but[1][1].setTranslateX(but[2][0].getTranslateX()-(but[2][0].getTranslateX()-but[1][1].getTranslateX())*expandFactor);
                but[1][2].setTranslateX(but[2][0].getTranslateX()-(but[2][0].getTranslateX()-but[1][2].getTranslateX())*expandFactor);
                but[1][3].setTranslateX(but[2][0].getTranslateX()-(but[2][0].getTranslateX()-but[1][3].getTranslateX())*expandFactor);
                
                but[0][0].setTranslateX(but[2][0].getTranslateX()-(but[2][0].getTranslateX()-but[0][0].getTranslateX())*expandFactor);
                but[2][1].setTranslateX(but[2][0].getTranslateX()-(but[2][0].getTranslateX()-but[2][1].getTranslateX())*expandFactor);
                but[2][2].setTranslateX(but[2][0].getTranslateX()-(but[2][0].getTranslateX()-but[2][2].getTranslateX())*expandFactor);
                but[2][3].setTranslateX(but[2][0].getTranslateX()-(but[2][0].getTranslateX()-but[2][3].getTranslateX())*expandFactor);
                
                but[3][0].setTranslateX(but[2][0].getTranslateX()-(but[2][0].getTranslateX()-but[3][0].getTranslateX())*expandFactor);
                but[3][1].setTranslateX(but[2][0].getTranslateX()-(but[2][0].getTranslateX()-but[3][1].getTranslateX())*expandFactor);
                but[3][2].setTranslateX(but[2][0].getTranslateX()-(but[2][0].getTranslateX()-but[3][2].getTranslateX())*expandFactor);
                but[3][3].setTranslateX(but[2][0].getTranslateX()-(but[2][0].getTranslateX()-but[3][3].getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                but[0][1].setTranslateY(but[2][0].getTranslateY()-((but[2][0].getTranslateY()-but[0][1].getTranslateY())*expandFactor));
                but[0][2].setTranslateY(but[2][0].getTranslateY()-(but[2][0].getTranslateY()-but[0][2].getTranslateY())*expandFactor);
                but[0][3].setTranslateY(but[2][0].getTranslateY()-(but[2][0].getTranslateY()-but[0][3].getTranslateY())*expandFactor);
                
                but[1][0].setTranslateY(but[2][0].getTranslateY()-(but[2][0].getTranslateY()-but[1][0].getTranslateY())*expandFactor);
                but[1][1].setTranslateY(but[2][0].getTranslateY()-(but[2][0].getTranslateY()-but[1][1].getTranslateY())*expandFactor);
                but[1][2].setTranslateY(but[2][0].getTranslateY()-(but[2][0].getTranslateY()-but[1][2].getTranslateY())*expandFactor);
                but[1][3].setTranslateY(but[2][0].getTranslateY()-(but[2][0].getTranslateY()-but[1][3].getTranslateY())*expandFactor);
                
                but[0][0].setTranslateY(but[2][0].getTranslateY()-(but[2][0].getTranslateY()-but[0][0].getTranslateY())*expandFactor);
                but[2][1].setTranslateY(but[2][0].getTranslateY()-(but[2][0].getTranslateY()-but[2][1].getTranslateY())*expandFactor);
                but[2][2].setTranslateY(but[2][0].getTranslateY()-(but[2][0].getTranslateY()-but[2][2].getTranslateY())*expandFactor);
                but[2][3].setTranslateY(but[2][0].getTranslateY()-(but[2][0].getTranslateY()-but[2][3].getTranslateY())*expandFactor);
                
                but[3][0].setTranslateY(but[2][0].getTranslateY()-(but[2][0].getTranslateY()-but[3][0].getTranslateY())*expandFactor);
                but[3][1].setTranslateY(but[2][0].getTranslateY()-(but[2][0].getTranslateY()-but[3][1].getTranslateY())*expandFactor);
                but[3][2].setTranslateY(but[2][0].getTranslateY()-(but[2][0].getTranslateY()-but[3][2].getTranslateY())*expandFactor);
                but[3][3].setTranslateY(but[2][0].getTranslateY()-(but[2][0].getTranslateY()-but[3][3].getTranslateY())*expandFactor);
            }
        });
        //3333333333333333333333333333333333333333333333333333333333333333333333
       
        but[2][1].setTranslateX((buttonSpace*1)-buttonLoc);
        but[2][1].setTranslateY((buttonSpace*2)-buttonLoc);
        but[2][1].setMinSize(buttonSize, buttonSize);
        but[2][1].setMaxSize(buttonSize, buttonSize);
        but[2][1].setText("");
        but[2][1].setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                but[0][1].setTranslateX(but[2][1].getTranslateX()-((but[2][1].getTranslateX()-but[0][1].getTranslateX())*expandFactor));
                but[0][2].setTranslateX(but[2][1].getTranslateX()-(but[2][1].getTranslateX()-but[0][2].getTranslateX())*expandFactor);
                but[0][3].setTranslateX(but[2][1].getTranslateX()-(but[2][1].getTranslateX()-but[0][3].getTranslateX())*expandFactor);
                
                but[1][0].setTranslateX(but[2][1].getTranslateX()-(but[2][1].getTranslateX()-but[1][0].getTranslateX())*expandFactor);
                but[1][1].setTranslateX(but[2][1].getTranslateX()-(but[2][1].getTranslateX()-but[1][1].getTranslateX())*expandFactor);
                but[1][2].setTranslateX(but[2][1].getTranslateX()-(but[2][1].getTranslateX()-but[1][2].getTranslateX())*expandFactor);
                but[1][3].setTranslateX(but[2][1].getTranslateX()-(but[2][1].getTranslateX()-but[1][3].getTranslateX())*expandFactor);
                
                but[2][0].setTranslateX(but[2][1].getTranslateX()-(but[2][1].getTranslateX()-but[2][0].getTranslateX())*expandFactor);
                but[0][0].setTranslateX(but[2][1].getTranslateX()-(but[2][1].getTranslateX()-but[0][0].getTranslateX())*expandFactor);
                but[2][2].setTranslateX(but[2][1].getTranslateX()-(but[2][1].getTranslateX()-but[2][2].getTranslateX())*expandFactor);
                but[2][3].setTranslateX(but[2][1].getTranslateX()-(but[2][1].getTranslateX()-but[2][3].getTranslateX())*expandFactor);
                
                but[3][0].setTranslateX(but[2][1].getTranslateX()-(but[2][1].getTranslateX()-but[3][0].getTranslateX())*expandFactor);
                but[3][1].setTranslateX(but[2][1].getTranslateX()-(but[2][1].getTranslateX()-but[3][1].getTranslateX())*expandFactor);
                but[3][2].setTranslateX(but[2][1].getTranslateX()-(but[2][1].getTranslateX()-but[3][2].getTranslateX())*expandFactor);
                but[3][3].setTranslateX(but[2][1].getTranslateX()-(but[2][1].getTranslateX()-but[3][3].getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                but[0][1].setTranslateY(but[2][1].getTranslateY()-((but[2][1].getTranslateY()-but[0][1].getTranslateY())*expandFactor));
                but[0][2].setTranslateY(but[2][1].getTranslateY()-(but[2][1].getTranslateY()-but[0][2].getTranslateY())*expandFactor);
                but[0][3].setTranslateY(but[2][1].getTranslateY()-(but[2][1].getTranslateY()-but[0][3].getTranslateY())*expandFactor);
                
                but[1][0].setTranslateY(but[2][1].getTranslateY()-(but[2][1].getTranslateY()-but[1][0].getTranslateY())*expandFactor);
                but[1][1].setTranslateY(but[2][1].getTranslateY()-(but[2][1].getTranslateY()-but[1][1].getTranslateY())*expandFactor);
                but[1][2].setTranslateY(but[2][1].getTranslateY()-(but[2][1].getTranslateY()-but[1][2].getTranslateY())*expandFactor);
                but[1][3].setTranslateY(but[2][1].getTranslateY()-(but[2][1].getTranslateY()-but[1][3].getTranslateY())*expandFactor);
                
                but[2][0].setTranslateY(but[2][1].getTranslateY()-(but[2][1].getTranslateY()-but[2][0].getTranslateY())*expandFactor);
                but[0][0].setTranslateY(but[2][1].getTranslateY()-(but[2][1].getTranslateY()-but[0][0].getTranslateY())*expandFactor);
                but[2][2].setTranslateY(but[2][1].getTranslateY()-(but[2][1].getTranslateY()-but[2][2].getTranslateY())*expandFactor);
                but[2][3].setTranslateY(but[2][1].getTranslateY()-(but[2][1].getTranslateY()-but[2][3].getTranslateY())*expandFactor);
                
                but[3][0].setTranslateY(but[2][1].getTranslateY()-(but[2][1].getTranslateY()-but[3][0].getTranslateY())*expandFactor);
                but[3][1].setTranslateY(but[2][1].getTranslateY()-(but[2][1].getTranslateY()-but[3][1].getTranslateY())*expandFactor);
                but[3][2].setTranslateY(but[2][1].getTranslateY()-(but[2][1].getTranslateY()-but[3][2].getTranslateY())*expandFactor);
                but[3][3].setTranslateY(but[2][1].getTranslateY()-(but[2][1].getTranslateY()-but[3][3].getTranslateY())*expandFactor);
            }
        });
        //3333333333333333333333333333333333333333333333333333333333333333333333
        
        but[2][2].setTranslateX((buttonSpace*2)-buttonLoc);
        but[2][2].setTranslateY((buttonSpace*2)-buttonLoc);
        but[2][2].setMinSize(buttonSize, buttonSize);
        but[2][2].setMaxSize(buttonSize, buttonSize);
        but[2][2].setText("");
        but[2][2].setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                but[0][1].setTranslateX(but[2][2].getTranslateX()-((but[2][2].getTranslateX()-but[0][1].getTranslateX())*expandFactor));
                but[0][2].setTranslateX(but[2][2].getTranslateX()-(but[2][2].getTranslateX()-but[0][2].getTranslateX())*expandFactor);
                but[0][3].setTranslateX(but[2][2].getTranslateX()-(but[2][2].getTranslateX()-but[0][3].getTranslateX())*expandFactor);
                
                but[1][0].setTranslateX(but[2][2].getTranslateX()-(but[2][2].getTranslateX()-but[1][0].getTranslateX())*expandFactor);
                but[1][1].setTranslateX(but[2][2].getTranslateX()-(but[2][2].getTranslateX()-but[1][1].getTranslateX())*expandFactor);
                but[1][2].setTranslateX(but[2][2].getTranslateX()-(but[2][2].getTranslateX()-but[1][2].getTranslateX())*expandFactor);
                but[1][3].setTranslateX(but[2][2].getTranslateX()-(but[2][2].getTranslateX()-but[1][3].getTranslateX())*expandFactor);
                
                but[2][0].setTranslateX(but[2][2].getTranslateX()-(but[2][2].getTranslateX()-but[2][0].getTranslateX())*expandFactor);
                but[2][1].setTranslateX(but[2][2].getTranslateX()-(but[2][2].getTranslateX()-but[2][1].getTranslateX())*expandFactor);
                but[0][0].setTranslateX(but[2][2].getTranslateX()-(but[2][2].getTranslateX()-but[0][0].getTranslateX())*expandFactor);
                but[2][3].setTranslateX(but[2][2].getTranslateX()-(but[2][2].getTranslateX()-but[2][3].getTranslateX())*expandFactor);
                
                but[3][0].setTranslateX(but[2][2].getTranslateX()-(but[2][2].getTranslateX()-but[3][0].getTranslateX())*expandFactor);
                but[3][1].setTranslateX(but[2][2].getTranslateX()-(but[2][2].getTranslateX()-but[3][1].getTranslateX())*expandFactor);
                but[3][2].setTranslateX(but[2][2].getTranslateX()-(but[2][2].getTranslateX()-but[3][2].getTranslateX())*expandFactor);
                but[3][3].setTranslateX(but[2][2].getTranslateX()-(but[2][2].getTranslateX()-but[3][3].getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                but[0][1].setTranslateY(but[2][2].getTranslateY()-((but[2][2].getTranslateY()-but[0][1].getTranslateY())*expandFactor));
                but[0][2].setTranslateY(but[2][2].getTranslateY()-(but[2][2].getTranslateY()-but[0][2].getTranslateY())*expandFactor);
                but[0][3].setTranslateY(but[2][2].getTranslateY()-(but[2][2].getTranslateY()-but[0][3].getTranslateY())*expandFactor);
                
                but[1][0].setTranslateY(but[2][2].getTranslateY()-(but[2][2].getTranslateY()-but[1][0].getTranslateY())*expandFactor);
                but[1][1].setTranslateY(but[2][2].getTranslateY()-(but[2][2].getTranslateY()-but[1][1].getTranslateY())*expandFactor);
                but[1][2].setTranslateY(but[2][2].getTranslateY()-(but[2][2].getTranslateY()-but[1][2].getTranslateY())*expandFactor);
                but[1][3].setTranslateY(but[2][2].getTranslateY()-(but[2][2].getTranslateY()-but[1][3].getTranslateY())*expandFactor);
                
                but[2][0].setTranslateY(but[2][2].getTranslateY()-(but[2][2].getTranslateY()-but[2][0].getTranslateY())*expandFactor);
                but[2][1].setTranslateY(but[2][2].getTranslateY()-(but[2][2].getTranslateY()-but[2][1].getTranslateY())*expandFactor);
                but[0][0].setTranslateY(but[2][2].getTranslateY()-(but[2][2].getTranslateY()-but[0][0].getTranslateY())*expandFactor);
                but[2][3].setTranslateY(but[2][2].getTranslateY()-(but[2][2].getTranslateY()-but[2][3].getTranslateY())*expandFactor);
                
                but[3][0].setTranslateY(but[2][2].getTranslateY()-(but[2][2].getTranslateY()-but[3][0].getTranslateY())*expandFactor);
                but[3][1].setTranslateY(but[2][2].getTranslateY()-(but[2][2].getTranslateY()-but[3][1].getTranslateY())*expandFactor);
                but[3][2].setTranslateY(but[2][2].getTranslateY()-(but[2][2].getTranslateY()-but[3][2].getTranslateY())*expandFactor);
                but[3][3].setTranslateY(but[2][2].getTranslateY()-(but[2][2].getTranslateY()-but[3][3].getTranslateY())*expandFactor);
            }
        });
        //3333333333333333333333333333333333333333333333333333333333333333333333
        
        but[2][3].setTranslateX((buttonSpace*3)-buttonLoc);
        but[2][3].setTranslateY((buttonSpace*2)-buttonLoc);
        but[2][3].setMinSize(buttonSize, buttonSize);
        but[2][3].setMaxSize(buttonSize, buttonSize);
        but[2][3].setText("");
        but[2][3].setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                but[0][1].setTranslateX(but[2][3].getTranslateX()-((but[2][3].getTranslateX()-but[0][1].getTranslateX())*expandFactor));
                but[0][2].setTranslateX(but[2][3].getTranslateX()-(but[2][3].getTranslateX()-but[0][2].getTranslateX())*expandFactor);
                but[0][3].setTranslateX(but[2][3].getTranslateX()-(but[2][3].getTranslateX()-but[0][3].getTranslateX())*expandFactor);
                
                but[1][0].setTranslateX(but[2][3].getTranslateX()-(but[2][3].getTranslateX()-but[1][0].getTranslateX())*expandFactor);
                but[1][1].setTranslateX(but[2][3].getTranslateX()-(but[2][3].getTranslateX()-but[1][1].getTranslateX())*expandFactor);
                but[1][2].setTranslateX(but[2][3].getTranslateX()-(but[2][3].getTranslateX()-but[1][2].getTranslateX())*expandFactor);
                but[1][3].setTranslateX(but[2][3].getTranslateX()-(but[2][3].getTranslateX()-but[1][3].getTranslateX())*expandFactor);
                
                but[2][0].setTranslateX(but[2][3].getTranslateX()-(but[2][3].getTranslateX()-but[2][0].getTranslateX())*expandFactor);
                but[2][1].setTranslateX(but[2][3].getTranslateX()-(but[2][3].getTranslateX()-but[2][1].getTranslateX())*expandFactor);
                but[2][2].setTranslateX(but[2][3].getTranslateX()-(but[2][3].getTranslateX()-but[2][2].getTranslateX())*expandFactor);
                but[0][0].setTranslateX(but[2][3].getTranslateX()-(but[2][3].getTranslateX()-but[0][0].getTranslateX())*expandFactor);
                
                but[3][0].setTranslateX(but[2][3].getTranslateX()-(but[2][3].getTranslateX()-but[3][0].getTranslateX())*expandFactor);
                but[3][1].setTranslateX(but[2][3].getTranslateX()-(but[2][3].getTranslateX()-but[3][1].getTranslateX())*expandFactor);
                but[3][2].setTranslateX(but[2][3].getTranslateX()-(but[2][3].getTranslateX()-but[3][2].getTranslateX())*expandFactor);
                but[3][3].setTranslateX(but[2][3].getTranslateX()-(but[2][3].getTranslateX()-but[3][3].getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                but[0][1].setTranslateY(but[2][3].getTranslateY()-((but[2][3].getTranslateY()-but[0][1].getTranslateY())*expandFactor));
                but[0][2].setTranslateY(but[2][3].getTranslateY()-(but[2][3].getTranslateY()-but[0][2].getTranslateY())*expandFactor);
                but[0][3].setTranslateY(but[2][3].getTranslateY()-(but[2][3].getTranslateY()-but[0][3].getTranslateY())*expandFactor);
                
                but[1][0].setTranslateY(but[2][3].getTranslateY()-(but[2][3].getTranslateY()-but[1][0].getTranslateY())*expandFactor);
                but[1][1].setTranslateY(but[2][3].getTranslateY()-(but[2][3].getTranslateY()-but[1][1].getTranslateY())*expandFactor);
                but[1][2].setTranslateY(but[2][3].getTranslateY()-(but[2][3].getTranslateY()-but[1][2].getTranslateY())*expandFactor);
                but[1][3].setTranslateY(but[2][3].getTranslateY()-(but[2][3].getTranslateY()-but[1][3].getTranslateY())*expandFactor);
                
                but[2][0].setTranslateY(but[2][3].getTranslateY()-(but[2][3].getTranslateY()-but[2][0].getTranslateY())*expandFactor);
                but[2][1].setTranslateY(but[2][3].getTranslateY()-(but[2][3].getTranslateY()-but[2][1].getTranslateY())*expandFactor);
                but[2][2].setTranslateY(but[2][3].getTranslateY()-(but[2][3].getTranslateY()-but[2][2].getTranslateY())*expandFactor);
                but[0][0].setTranslateY(but[2][3].getTranslateY()-(but[2][3].getTranslateY()-but[0][0].getTranslateY())*expandFactor);
                
                but[3][0].setTranslateY(but[2][3].getTranslateY()-(but[2][3].getTranslateY()-but[3][0].getTranslateY())*expandFactor);
                but[3][1].setTranslateY(but[2][3].getTranslateY()-(but[2][3].getTranslateY()-but[3][1].getTranslateY())*expandFactor);
                but[3][2].setTranslateY(but[2][3].getTranslateY()-(but[2][3].getTranslateY()-but[3][2].getTranslateY())*expandFactor);
                but[3][3].setTranslateY(but[2][3].getTranslateY()-(but[2][3].getTranslateY()-but[3][3].getTranslateY())*expandFactor);
            }
        });
        //4444444444444444444444444444444444444444444444444444444444444444444444
      
        but[3][0].setTranslateX((buttonSpace*0)-buttonLoc);
        but[3][0].setTranslateY((buttonSpace*3)-buttonLoc);
        but[3][0].setMinSize(buttonSize, buttonSize);
        but[3][0].setMaxSize(buttonSize, buttonSize);
        but[3][0].setText("");
        but[3][0].setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                but[0][1].setTranslateX(but[3][0].getTranslateX()-((but[3][0].getTranslateX()-but[0][1].getTranslateX())*expandFactor));
                but[0][2].setTranslateX(but[3][0].getTranslateX()-(but[3][0].getTranslateX()-but[0][2].getTranslateX())*expandFactor);
                but[0][3].setTranslateX(but[3][0].getTranslateX()-(but[3][0].getTranslateX()-but[0][3].getTranslateX())*expandFactor);
                
                but[1][0].setTranslateX(but[3][0].getTranslateX()-(but[3][0].getTranslateX()-but[1][0].getTranslateX())*expandFactor);
                but[1][1].setTranslateX(but[3][0].getTranslateX()-(but[3][0].getTranslateX()-but[1][1].getTranslateX())*expandFactor);
                but[1][2].setTranslateX(but[3][0].getTranslateX()-(but[3][0].getTranslateX()-but[1][2].getTranslateX())*expandFactor);
                but[1][3].setTranslateX(but[3][0].getTranslateX()-(but[3][0].getTranslateX()-but[1][3].getTranslateX())*expandFactor);
                
                but[2][0].setTranslateX(but[3][0].getTranslateX()-(but[3][0].getTranslateX()-but[2][0].getTranslateX())*expandFactor);
                but[2][1].setTranslateX(but[3][0].getTranslateX()-(but[3][0].getTranslateX()-but[2][1].getTranslateX())*expandFactor);
                but[2][2].setTranslateX(but[3][0].getTranslateX()-(but[3][0].getTranslateX()-but[2][2].getTranslateX())*expandFactor);
                but[2][3].setTranslateX(but[3][0].getTranslateX()-(but[3][0].getTranslateX()-but[2][3].getTranslateX())*expandFactor);
                
                but[0][0].setTranslateX(but[3][0].getTranslateX()-(but[3][0].getTranslateX()-but[0][0].getTranslateX())*expandFactor);
                but[3][1].setTranslateX(but[3][0].getTranslateX()-(but[3][0].getTranslateX()-but[3][1].getTranslateX())*expandFactor);
                but[3][2].setTranslateX(but[3][0].getTranslateX()-(but[3][0].getTranslateX()-but[3][2].getTranslateX())*expandFactor);
                but[3][3].setTranslateX(but[3][0].getTranslateX()-(but[3][0].getTranslateX()-but[3][3].getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                but[0][1].setTranslateY(but[3][0].getTranslateY()-((but[3][0].getTranslateY()-but[0][1].getTranslateY())*expandFactor));
                but[0][2].setTranslateY(but[3][0].getTranslateY()-(but[3][0].getTranslateY()-but[0][2].getTranslateY())*expandFactor);
                but[0][3].setTranslateY(but[3][0].getTranslateY()-(but[3][0].getTranslateY()-but[0][3].getTranslateY())*expandFactor);
                
                but[1][0].setTranslateY(but[3][0].getTranslateY()-(but[3][0].getTranslateY()-but[1][0].getTranslateY())*expandFactor);
                but[1][1].setTranslateY(but[3][0].getTranslateY()-(but[3][0].getTranslateY()-but[1][1].getTranslateY())*expandFactor);
                but[1][2].setTranslateY(but[3][0].getTranslateY()-(but[3][0].getTranslateY()-but[1][2].getTranslateY())*expandFactor);
                but[1][3].setTranslateY(but[3][0].getTranslateY()-(but[3][0].getTranslateY()-but[1][3].getTranslateY())*expandFactor);
                
                but[2][0].setTranslateY(but[3][0].getTranslateY()-(but[3][0].getTranslateY()-but[2][0].getTranslateY())*expandFactor);
                but[2][1].setTranslateY(but[3][0].getTranslateY()-(but[3][0].getTranslateY()-but[2][1].getTranslateY())*expandFactor);
                but[2][2].setTranslateY(but[3][0].getTranslateY()-(but[3][0].getTranslateY()-but[2][2].getTranslateY())*expandFactor);
                but[2][3].setTranslateY(but[3][0].getTranslateY()-(but[3][0].getTranslateY()-but[2][3].getTranslateY())*expandFactor);
                
                but[0][0].setTranslateY(but[3][0].getTranslateY()-(but[3][0].getTranslateY()-but[0][0].getTranslateY())*expandFactor);
                but[3][1].setTranslateY(but[3][0].getTranslateY()-(but[3][0].getTranslateY()-but[3][1].getTranslateY())*expandFactor);
                but[3][2].setTranslateY(but[3][0].getTranslateY()-(but[3][0].getTranslateY()-but[3][2].getTranslateY())*expandFactor);
                but[3][3].setTranslateY(but[3][0].getTranslateY()-(but[3][0].getTranslateY()-but[3][3].getTranslateY())*expandFactor);
            }
        });
        //4444444444444444444444444444444444444444444444444444444444444444444444
      
        but[3][1].setTranslateX((buttonSpace*1)-buttonLoc);
        but[3][1].setTranslateY((buttonSpace*3)-buttonLoc);
        but[3][1].setMinSize(buttonSize, buttonSize);
        but[3][1].setMaxSize(buttonSize, buttonSize);
        but[3][1].setText("");
        but[3][1].setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                but[0][1].setTranslateX(but[3][1].getTranslateX()-((but[3][1].getTranslateX()-but[0][1].getTranslateX())*expandFactor));
                but[0][2].setTranslateX(but[3][1].getTranslateX()-(but[3][1].getTranslateX()-but[0][2].getTranslateX())*expandFactor);
                but[0][3].setTranslateX(but[3][1].getTranslateX()-(but[3][1].getTranslateX()-but[0][3].getTranslateX())*expandFactor);
                
                but[1][0].setTranslateX(but[3][1].getTranslateX()-(but[3][1].getTranslateX()-but[1][0].getTranslateX())*expandFactor);
                but[1][1].setTranslateX(but[3][1].getTranslateX()-(but[3][1].getTranslateX()-but[1][1].getTranslateX())*expandFactor);
                but[1][2].setTranslateX(but[3][1].getTranslateX()-(but[3][1].getTranslateX()-but[1][2].getTranslateX())*expandFactor);
                but[1][3].setTranslateX(but[3][1].getTranslateX()-(but[3][1].getTranslateX()-but[1][3].getTranslateX())*expandFactor);
                
                but[2][0].setTranslateX(but[3][1].getTranslateX()-(but[3][1].getTranslateX()-but[2][0].getTranslateX())*expandFactor);
                but[2][1].setTranslateX(but[3][1].getTranslateX()-(but[3][1].getTranslateX()-but[2][1].getTranslateX())*expandFactor);
                but[2][2].setTranslateX(but[3][1].getTranslateX()-(but[3][1].getTranslateX()-but[2][2].getTranslateX())*expandFactor);
                but[2][3].setTranslateX(but[3][1].getTranslateX()-(but[3][1].getTranslateX()-but[2][3].getTranslateX())*expandFactor);
                
                but[3][0].setTranslateX(but[3][1].getTranslateX()-(but[3][1].getTranslateX()-but[3][0].getTranslateX())*expandFactor);
                but[0][0].setTranslateX(but[3][1].getTranslateX()-(but[3][1].getTranslateX()-but[0][0].getTranslateX())*expandFactor);
                but[3][2].setTranslateX(but[3][1].getTranslateX()-(but[3][1].getTranslateX()-but[3][2].getTranslateX())*expandFactor);
                but[3][3].setTranslateX(but[3][1].getTranslateX()-(but[3][1].getTranslateX()-but[3][3].getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                but[0][1].setTranslateY(but[3][1].getTranslateY()-((but[3][1].getTranslateY()-but[0][1].getTranslateY())*expandFactor));
                but[0][2].setTranslateY(but[3][1].getTranslateY()-(but[3][1].getTranslateY()-but[0][2].getTranslateY())*expandFactor);
                but[0][3].setTranslateY(but[3][1].getTranslateY()-(but[3][1].getTranslateY()-but[0][3].getTranslateY())*expandFactor);
                
                but[1][0].setTranslateY(but[3][1].getTranslateY()-(but[3][1].getTranslateY()-but[1][0].getTranslateY())*expandFactor);
                but[1][1].setTranslateY(but[3][1].getTranslateY()-(but[3][1].getTranslateY()-but[1][1].getTranslateY())*expandFactor);
                but[1][2].setTranslateY(but[3][1].getTranslateY()-(but[3][1].getTranslateY()-but[1][2].getTranslateY())*expandFactor);
                but[1][3].setTranslateY(but[3][1].getTranslateY()-(but[3][1].getTranslateY()-but[1][3].getTranslateY())*expandFactor);
                
                but[2][0].setTranslateY(but[3][1].getTranslateY()-(but[3][1].getTranslateY()-but[2][0].getTranslateY())*expandFactor);
                but[2][1].setTranslateY(but[3][1].getTranslateY()-(but[3][1].getTranslateY()-but[2][1].getTranslateY())*expandFactor);
                but[2][2].setTranslateY(but[3][1].getTranslateY()-(but[3][1].getTranslateY()-but[2][2].getTranslateY())*expandFactor);
                but[2][3].setTranslateY(but[3][1].getTranslateY()-(but[3][1].getTranslateY()-but[2][3].getTranslateY())*expandFactor);
                
                but[3][0].setTranslateY(but[3][1].getTranslateY()-(but[3][1].getTranslateY()-but[3][0].getTranslateY())*expandFactor);
                but[0][0].setTranslateY(but[3][1].getTranslateY()-(but[3][1].getTranslateY()-but[0][0].getTranslateY())*expandFactor);
                but[3][2].setTranslateY(but[3][1].getTranslateY()-(but[3][1].getTranslateY()-but[3][2].getTranslateY())*expandFactor);
                but[3][3].setTranslateY(but[3][1].getTranslateY()-(but[3][1].getTranslateY()-but[3][3].getTranslateY())*expandFactor);
            }
        });
        //4444444444444444444444444444444444444444444444444444444444444444444444
        
        but[3][2].setTranslateX((buttonSpace*2)-buttonLoc);
        but[3][2].setTranslateY((buttonSpace*3)-buttonLoc);
        but[3][2].setMinSize(buttonSize, buttonSize);
        but[3][2].setMaxSize(buttonSize, buttonSize);
        but[3][2].setText("");
        but[3][2].setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                but[0][1].setTranslateX(but[3][2].getTranslateX()-((but[3][2].getTranslateX()-but[0][1].getTranslateX())*expandFactor));
                but[0][2].setTranslateX(but[3][2].getTranslateX()-(but[3][2].getTranslateX()-but[0][2].getTranslateX())*expandFactor);
                but[0][3].setTranslateX(but[3][2].getTranslateX()-(but[3][2].getTranslateX()-but[0][3].getTranslateX())*expandFactor);
                
                but[1][0].setTranslateX(but[3][2].getTranslateX()-(but[3][2].getTranslateX()-but[1][0].getTranslateX())*expandFactor);
                but[1][1].setTranslateX(but[3][2].getTranslateX()-(but[3][2].getTranslateX()-but[1][1].getTranslateX())*expandFactor);
                but[1][2].setTranslateX(but[3][2].getTranslateX()-(but[3][2].getTranslateX()-but[1][2].getTranslateX())*expandFactor);
                but[1][3].setTranslateX(but[3][2].getTranslateX()-(but[3][2].getTranslateX()-but[1][3].getTranslateX())*expandFactor);
                
                but[2][0].setTranslateX(but[3][2].getTranslateX()-(but[3][2].getTranslateX()-but[2][0].getTranslateX())*expandFactor);
                but[2][1].setTranslateX(but[3][2].getTranslateX()-(but[3][2].getTranslateX()-but[2][1].getTranslateX())*expandFactor);
                but[2][2].setTranslateX(but[3][2].getTranslateX()-(but[3][2].getTranslateX()-but[2][2].getTranslateX())*expandFactor);
                but[2][3].setTranslateX(but[3][2].getTranslateX()-(but[3][2].getTranslateX()-but[2][3].getTranslateX())*expandFactor);
                
                but[3][0].setTranslateX(but[3][2].getTranslateX()-(but[3][2].getTranslateX()-but[3][0].getTranslateX())*expandFactor);
                but[3][1].setTranslateX(but[3][2].getTranslateX()-(but[3][2].getTranslateX()-but[3][1].getTranslateX())*expandFactor);
                but[0][0].setTranslateX(but[3][2].getTranslateX()-(but[3][2].getTranslateX()-but[0][0].getTranslateX())*expandFactor);
                but[3][3].setTranslateX(but[3][2].getTranslateX()-(but[3][2].getTranslateX()-but[3][3].getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                but[0][1].setTranslateY(but[3][2].getTranslateY()-((but[3][2].getTranslateY()-but[0][1].getTranslateY())*expandFactor));
                but[0][2].setTranslateY(but[3][2].getTranslateY()-(but[3][2].getTranslateY()-but[0][2].getTranslateY())*expandFactor);
                but[0][3].setTranslateY(but[3][2].getTranslateY()-(but[3][2].getTranslateY()-but[0][3].getTranslateY())*expandFactor);
                
                but[1][0].setTranslateY(but[3][2].getTranslateY()-(but[3][2].getTranslateY()-but[1][0].getTranslateY())*expandFactor);
                but[1][1].setTranslateY(but[3][2].getTranslateY()-(but[3][2].getTranslateY()-but[1][1].getTranslateY())*expandFactor);
                but[1][2].setTranslateY(but[3][2].getTranslateY()-(but[3][2].getTranslateY()-but[1][2].getTranslateY())*expandFactor);
                but[1][3].setTranslateY(but[3][2].getTranslateY()-(but[3][2].getTranslateY()-but[1][3].getTranslateY())*expandFactor);
                
                but[2][0].setTranslateY(but[3][2].getTranslateY()-(but[3][2].getTranslateY()-but[2][0].getTranslateY())*expandFactor);
                but[2][1].setTranslateY(but[3][2].getTranslateY()-(but[3][2].getTranslateY()-but[2][1].getTranslateY())*expandFactor);
                but[2][2].setTranslateY(but[3][2].getTranslateY()-(but[3][2].getTranslateY()-but[2][2].getTranslateY())*expandFactor);
                but[2][3].setTranslateY(but[3][2].getTranslateY()-(but[3][2].getTranslateY()-but[2][3].getTranslateY())*expandFactor);
                
                but[3][0].setTranslateY(but[3][2].getTranslateY()-(but[3][2].getTranslateY()-but[3][0].getTranslateY())*expandFactor);
                but[3][1].setTranslateY(but[3][2].getTranslateY()-(but[3][2].getTranslateY()-but[3][1].getTranslateY())*expandFactor);
                but[0][0].setTranslateY(but[3][2].getTranslateY()-(but[3][2].getTranslateY()-but[0][0].getTranslateY())*expandFactor);
                but[3][3].setTranslateY(but[3][2].getTranslateY()-(but[3][2].getTranslateY()-but[3][3].getTranslateY())*expandFactor);
            }
        });
        //4444444444444444444444444444444444444444444444444444444444444444444444
       
        but[3][3].setTranslateX((buttonSpace*3)-buttonLoc);
        but[3][3].setTranslateY((buttonSpace*3)-buttonLoc);
        but[3][3].setMinSize(buttonSize, buttonSize);
        but[3][3].setMaxSize(buttonSize, buttonSize);
        but[3][3].setText("");
        but[3][3].setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                but[0][1].setTranslateX(but[3][3].getTranslateX()-((but[3][3].getTranslateX()-but[0][1].getTranslateX())*expandFactor));
                but[0][2].setTranslateX(but[3][3].getTranslateX()-(but[3][3].getTranslateX()-but[0][2].getTranslateX())*expandFactor);
                but[0][3].setTranslateX(but[3][3].getTranslateX()-(but[3][3].getTranslateX()-but[0][3].getTranslateX())*expandFactor);
                
                but[1][0].setTranslateX(but[3][3].getTranslateX()-(but[3][3].getTranslateX()-but[1][0].getTranslateX())*expandFactor);
                but[1][1].setTranslateX(but[3][3].getTranslateX()-(but[3][3].getTranslateX()-but[1][1].getTranslateX())*expandFactor);
                but[1][2].setTranslateX(but[3][3].getTranslateX()-(but[3][3].getTranslateX()-but[1][2].getTranslateX())*expandFactor);
                but[1][3].setTranslateX(but[3][3].getTranslateX()-(but[3][3].getTranslateX()-but[1][3].getTranslateX())*expandFactor);
                
                but[2][0].setTranslateX(but[3][3].getTranslateX()-(but[3][3].getTranslateX()-but[2][0].getTranslateX())*expandFactor);
                but[2][1].setTranslateX(but[3][3].getTranslateX()-(but[3][3].getTranslateX()-but[2][1].getTranslateX())*expandFactor);
                but[2][2].setTranslateX(but[3][3].getTranslateX()-(but[3][3].getTranslateX()-but[2][2].getTranslateX())*expandFactor);
                but[2][3].setTranslateX(but[3][3].getTranslateX()-(but[3][3].getTranslateX()-but[2][3].getTranslateX())*expandFactor);
                
                but[3][0].setTranslateX(but[3][3].getTranslateX()-(but[3][3].getTranslateX()-but[3][0].getTranslateX())*expandFactor);
                but[3][1].setTranslateX(but[3][3].getTranslateX()-(but[3][3].getTranslateX()-but[3][1].getTranslateX())*expandFactor);
                but[3][2].setTranslateX(but[3][3].getTranslateX()-(but[3][3].getTranslateX()-but[3][2].getTranslateX())*expandFactor);
                but[0][0].setTranslateX(but[3][3].getTranslateX()-(but[3][3].getTranslateX()-but[0][0].getTranslateX())*expandFactor);
                //          TRANSLATE MANIPULATION FOR Y
                but[0][1].setTranslateY(but[3][3].getTranslateY()-((but[3][3].getTranslateY()-but[0][1].getTranslateY())*expandFactor));
                but[0][2].setTranslateY(but[3][3].getTranslateY()-(but[3][3].getTranslateY()-but[0][2].getTranslateY())*expandFactor);
                but[0][3].setTranslateY(but[3][3].getTranslateY()-(but[3][3].getTranslateY()-but[0][3].getTranslateY())*expandFactor);
                
                but[1][0].setTranslateY(but[3][3].getTranslateY()-(but[3][3].getTranslateY()-but[1][0].getTranslateY())*expandFactor);
                but[1][1].setTranslateY(but[3][3].getTranslateY()-(but[3][3].getTranslateY()-but[1][1].getTranslateY())*expandFactor);
                but[1][2].setTranslateY(but[3][3].getTranslateY()-(but[3][3].getTranslateY()-but[1][2].getTranslateY())*expandFactor);
                but[1][3].setTranslateY(but[3][3].getTranslateY()-(but[3][3].getTranslateY()-but[1][3].getTranslateY())*expandFactor);
                
                but[2][0].setTranslateY(but[3][3].getTranslateY()-(but[3][3].getTranslateY()-but[2][0].getTranslateY())*expandFactor);
                but[2][1].setTranslateY(but[3][3].getTranslateY()-(but[3][3].getTranslateY()-but[2][1].getTranslateY())*expandFactor);
                but[2][2].setTranslateY(but[3][3].getTranslateY()-(but[3][3].getTranslateY()-but[2][2].getTranslateY())*expandFactor);
                but[2][3].setTranslateY(but[3][3].getTranslateY()-(but[3][3].getTranslateY()-but[2][3].getTranslateY())*expandFactor);
                
                but[3][0].setTranslateY(but[3][3].getTranslateY()-(but[3][3].getTranslateY()-but[3][0].getTranslateY())*expandFactor);
                but[3][1].setTranslateY(but[3][3].getTranslateY()-(but[3][3].getTranslateY()-but[3][1].getTranslateY())*expandFactor);
                but[3][2].setTranslateY(but[3][3].getTranslateY()-(but[3][3].getTranslateY()-but[3][2].getTranslateY())*expandFactor);
                but[0][0].setTranslateY(but[3][3].getTranslateY()-(but[3][3].getTranslateY()-but[0][0].getTranslateY())*expandFactor);
            }
        });
        
        StackPane root = new StackPane();
        for (int i = 0; i < but[0].length; i++){
            for (int j = 0; j < but[0].length; j++){
                root.getChildren().add(but[i][j]);
            }
        }
        
        
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
        
}
