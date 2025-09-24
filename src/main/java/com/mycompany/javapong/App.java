package com.mycompany.javapong;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
        var label = new Label("Hello, this is my Java Pong game");
        var scene = new Scene(new StackPane(label), 800, 680);
        stage.setScene(scene);
        stage.setTitle("Pong Game");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}