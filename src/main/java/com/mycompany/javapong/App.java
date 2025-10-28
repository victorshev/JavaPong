package com.mycompany.javapong;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */

public class App extends Application {

    @Override
    public void start(Stage stage) {
        var root = new Pane();
        var scene = new Scene(root);

        stage.setTitle("Java Ping Pong");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();

        // Initialize GameEngine and UIManager
        var engine = new GameEngine(root, scene);
        var ui = new UIManager(root, engine);
        ui.createMainMenu();
    }

    public static void main(String[] args) {
        launch();
    }
}