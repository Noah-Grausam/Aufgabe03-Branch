/*
Name: Noah Grausam
Date: 12.10.2021
GitHub: https://github.com/Noah-Grausam/Aufgabe03-Branch
*/

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600);
        stage.setTitle("Temp. Converter");

        stage.setScene(scene);
        stage.show();
    }
}
