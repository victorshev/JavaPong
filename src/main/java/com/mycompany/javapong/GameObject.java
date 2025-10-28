/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapong;

/**
 *
 * @author victo
 */
public abstract class GameObject {
    protected double x, y; 
    protected double width, height; 
    
    public GameObject(double x, double y, double width, double height) {
        this.x = x; 
        this.y = y; 
        this.width = width; 
        this.height = height;
    }
    
    public abstract void update(); // Implenented by each subclass
}
