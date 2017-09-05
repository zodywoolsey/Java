/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threedeeproject;
 
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.DrawMode;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
 
public class ThreeDeeProject extends Application {
    int x = -20;
    int y = -20;
    int z = -20;
 
    public Parent createContent() throws Exception {
 
        // Box
        Box testBox = new Box(2, 2, 2);
        testBox.setMaterial(new PhongMaterial(Color.RED));
        testBox.setDrawMode(DrawMode.LINE);
 
        // Create and position camera
        PerspectiveCamera camera = new PerspectiveCamera(true);
        camera.getTransforms().addAll (
                new Rotate(y, Rotate.Y_AXIS),
                new Rotate(x, Rotate.X_AXIS),
                new Translate(0, 0, z));
 
        camera.setFieldOfView(30);
        
        // Build the Scene Graph
        Group root = new Group();       
        root.getChildren().add(camera);
        root.getChildren().add(testBox);
 
        // Use a SubScene       
        SubScene subScene = new SubScene(root,1000,800);
        subScene.setFill(Color.ALICEBLUE);
        subScene.setCamera(camera);
        Group group = new Group();
        group.getChildren().add(subScene);
        return group;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setResizable(false);
        Scene scene = new Scene(createContent());
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.show();
        
    }

    /**
     * Java main for when running without JavaFX launcher
     */
    public static void main(String[] args) {
        launch(args);
        System.out.println('h');
    }
}