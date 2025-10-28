/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapong;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author victo
 */


public class Paddle {
    private final Rectangle shape;

    public Paddle(double x, double y) {
        shape = new Rectangle(x, y, 15, 100);
        shape.setFill(Color.WHITE);
    }

    public Rectangle getShape() {
        return shape;
    }

    public void moveUp() {
        shape.setY(Math.max(shape.getY() - 15, 0));
    }

    public void moveDown() {
        shape.setY(Math.min(shape.getY() + 15, 700));
    }
}
