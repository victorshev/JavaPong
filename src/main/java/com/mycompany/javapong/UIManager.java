/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapong;

import javafx.scene.layout.Pane;
import javafx.scene.control.Button;

/**
 *
 * @author victo
 */

public class UIManager {
    private final Pane rootPane;
    private final GameEngine engine;

    public UIManager(Pane rootPane, GameEngine engine) {
        this.rootPane = rootPane;
        this.engine = engine;
    }

    public void createMainMenu() {
        var startButton = new Button("Start Game");
        var exitButton = new Button("Exit");

        // Dynamic positioning (50% width, relative height)
        startButton.layoutXProperty().bind(rootPane.widthProperty().multiply(0.5).subtract(50));
        startButton.layoutYProperty().bind(rootPane.heightProperty().multiply(0.4));

        exitButton.layoutXProperty().bind(rootPane.widthProperty().multiply(0.5).subtract(50));
        exitButton.layoutYProperty().bind(rootPane.heightProperty().multiply(0.5));

        rootPane.getChildren().addAll(startButton, exitButton);

        startButton.setOnAction(e -> {
            rootPane.getChildren().clear();
            engine.startGame();
        });

        exitButton.setOnAction(e -> System.exit(0));
    }
}