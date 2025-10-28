/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapong;

import javafx.scene.layout.Pane;
import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author victo
 */

public class GameEngine {
    private final Pane root;
    private final Scene scene;
    private Ball ball;
    private Paddle leftPaddle;
    private Paddle rightPaddle;
    private AnimationTimer timer;

    public GameEngine(Pane root, Scene scene) {
        this.root = root;
        this.scene = scene;
    }

    public void startGame() {
        ball = new Ball(400, 300);
        leftPaddle = new Paddle(50, 250);
        rightPaddle = new Paddle(750, 250);

        root.getChildren().addAll(ball.getShape(), leftPaddle.getShape(), rightPaddle.getShape());

        setupControls();
        startAnimation();
    }

    private void setupControls() {
        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case W:
                    leftPaddle.moveUp();
                    break;
                case S:
                    leftPaddle.moveDown();
                    break;
                case UP:
                    rightPaddle.moveUp();
                    break;
                case DOWN:
                    rightPaddle.moveDown();
                    break;
                default:
                    break;
            }
        });
    }

    private void startAnimation() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                ball.update();
                ball.checkCollision(leftPaddle, rightPaddle);
            }
        };
        timer.start();
    }
}
