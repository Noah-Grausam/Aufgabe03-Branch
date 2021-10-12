/*
Name: Noah Grausam
Date: 12.10.2021
GitHub: https://github.com/Noah-Grausam/Aufgabe03-Branch
*/

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 200, 200);
        stage.setTitle("Temp. Converter");

        VBox vBox = new VBox();

        Label l1 = new Label("Grad Celsius");
        TextField tf1 = new TextField();

        Label l2 = new Label("Grad Fahrenheit");
        TextField tf2 = new TextField();

        EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        };
        EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        };

        Button b1 = new Button("Convert C -> F");
        b1.setOnAction(event1);
        Button b2 = new Button("Convert F -> C");
        b2.setOnAction(event2);

        vBox.getChildren().addAll(l1, tf1, l2, tf2, b1, b2);

        root.getChildren().add(vBox);
        stage.setScene(scene);
        stage.show();
    }
}
