/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petsapp;

/**
 *
 * @author 30128198
 */
public class Toy {
    private static int nextId = 1;
    public int id;
    public String name;
    
    public Toy(String name) {
        id = nextId;
        nextId++;
        this.name = name;
    }
}
