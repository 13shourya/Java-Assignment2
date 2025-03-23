package com.shourya.assignment2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Label welcomeText = new Label("Welcome to Assignment 2!");
        StackPane root = new StackPane(welcomeText);
        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("JavaFX Assignment 2");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
