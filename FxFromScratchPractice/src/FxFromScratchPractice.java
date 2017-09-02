/**
 *
 * @author zodywoolsey
 * 
 */

import javafx.application.Application;//           |
import javafx.event.ActionEvent;//                 |
import javafx.event.EventHandler;//                |
import javafx.scene.Scene;//                       |
import javafx.scene.control.Button;//              |
//                                               __|__
import javafx.scene.layout.StackPane;//          \   /
//                                                \ /
import javafx.stage.Stage;//            importing all things javafx

public class FxFromScratchPractice extends Application {
    int locx;//These two variables are setup in this class' global space so that they can be used in the button logic to alter the "me" button
    int locy;
    @Override
    public void start(Stage primaryStage) throws InterruptedException {
        int i;
        locy = 25;
        locx = 25;
        
        //The creation of the pane is placed here so that it's properties can be bound to certain objects
        StackPane root = new StackPane();
        
        //This area creates the button: me to be used to test translation and ui element usage
        Button me = new Button();
        me.setText("Move Me!");
        me.setTranslateX(locx);
        me.setTranslateY(locy);
        
        //This area creates the button: Right and sets all of its properties and its onAction function
        Button right = new Button();
        right.setText("Right");
        right.translateXProperty().bind(root.widthProperty().divide(10));
        right.translateYProperty().bind(root.heightProperty().divide(3));
        right.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event){
                locx += 10;
                me.setTranslateX(locx);
            }
        });
        
        //This area creates the button: left and sets all of its properties and its onAction function
        Button left = new Button();
        left.setText("Left");// sets left text
        left.translateXProperty().bind(right.translateXProperty().subtract(60));
        left.translateYProperty().bind(right.translateYProperty());
        left.setOnAction(new EventHandler<ActionEvent>() {//creates an action on click for the button: left
            
            @Override
            public void handle(ActionEvent event) {
                locx -= 10;
                me.setTranslateX(locx);
            }
        });
        
        //Creates the move up button with similar setup to left and right
        Button up = new Button();
        up.setText("up");// sets up text
        up.translateXProperty().bind(right.translateXProperty().subtract(30));
        up.translateYProperty().bind(right.translateYProperty().subtract(40));
        up.setOnAction(new EventHandler<ActionEvent>() {//creates an action on click for the button: up
            
            @Override
            public void handle(ActionEvent event) {
                locy -= 10;
                me.setTranslateY(locy);
            }
        });
        
        //Creates the move down button with similar setup to the right, left, and up buttons
        Button down = new Button();
        down.setText("down");// sets down text
        down.translateXProperty().bind(right.translateXProperty().subtract(30));
        down.translateYProperty().bind(right.translateYProperty().add(40));
        down.setOnAction(new EventHandler<ActionEvent>() {//creates an action on click for the button: down
            
            @Override
            public void handle(ActionEvent event) {
                locy += 10;
                me.setTranslateY(locy);
            }
        });
        
        //This area adds the objects to the pane: root.
        root.getChildren().add(left);
        root.getChildren().add(right);
        root.getChildren().add(me);
        root.getChildren().add(down);
        root.getChildren().add(up);
        
        //This area creates the scene: scene and then sets the title, stage scene, and shows the stage
        Scene scene = new Scene(root, 500, 500);//This creates the scence using the "root" pane and set the size of the scene
        primaryStage.setTitle("Hello World!");//This just sets teh title of the stage
        primaryStage.setScene(scene);//This puts the "scene" scene into the stage to be shown
        primaryStage.show();//this shows the stage with the predefined scene and pane contained within
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);//This launches the damn thing
    }
    
}
