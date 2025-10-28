/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapong;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author victo
 */

public class Ball {
    private final Circle shape = new Circle();
    private double dx = 3;
    private double dy = 3;

    public Ball(double x, double y) {
        shape.setCenterX(x);
        shape.setCenterY(y);
        shape.setRadius(10);
        shape.setFill(Color.WHITE);
    }

    public Circle getShape() {
        return shape;
    }

    public void update() {
        shape.setCenterX(shape.getCenterX() + dx);
        shape.setCenterY(shape.getCenterY() + dy);

        if (shape.getCenterY() <= 0 || shape.getCenterY() >= 800) {
            dy *= -1;
        }
    }

    public void checkCollision(Paddle left, Paddle right) {
        if (shape.getBoundsInParent().intersects(left.getShape().getBoundsInParent()) ||
            shape.getBoundsInParent().intersects(right.getShape().getBoundsInParent())) {
            dx *= -1;
        }
    }
}
