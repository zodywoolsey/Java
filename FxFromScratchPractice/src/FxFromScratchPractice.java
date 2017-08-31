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
    
    @Override
    public void start(Stage primaryStage) {
        int i;
        Button btn = new Button();// defines button btn
        Button ok = new Button();
        ok.setText("OK");
        ok.setTranslateX(100);
        ok.setTranslateY(100);
        ok.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event){
                System.out.println("You Pressed OK");
            }
        });
        btn.setText("Say 'Hello World'");// sets btn text
        btn.setOnAction(new EventHandler<ActionEvent>() {//creates an action on click for the button: btn
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        root.getChildren().add(ok);
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        for(i = 0; i < 100; i++1){
        primaryStage.show();
        ok.translateXProperty(i);
        primaryStage.show();
    }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
