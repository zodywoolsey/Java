

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.Scanner;
import javafx.scene.Cursor;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Zody
 */
public class Squares extends Application {
    static Scanner input = new Scanner(System.in);
    static int zStat;
    static ArrayList<Rectangle> rect = new ArrayList<>();
    @Override
    public void start(Stage primaryStage) {
        primaryStage.initStyle(StageStyle.UNIFIED);
        
        Button but = new Button();
        StackPane root = new StackPane();
        Scene scene = new Scene(root);
        
        
        but.setText("GO");
        but.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                for (int i = 0; i < rect.size(); i++){
                    root.getChildren().remove(rect.get(i));
                }
                rect.removeAll(rect);
                for (int i = 0; i < 1000; i++){
                    rect.add(new Rectangle(10,10));
                    rect.get(i).setFill(Color.rgb((int)(100+Math.random()*154), (int)(100+Math.random()*154), (int)(100+Math.random()*154)));
                }
                for (int i = 0; i < rect.size(); i++){
                    root.getChildren().add(rect.get(i));
                    rect.get(i).setTranslateX((scene.getWidth()/2)-Math.random()*scene.getWidth());
                    rect.get(i).setTranslateY((scene.getHeight()/2)-Math.random()*scene.getHeight());
                }
//                root.getChildren().remove(but);
            }
        });
        
        
        root.getChildren().add(but);
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
