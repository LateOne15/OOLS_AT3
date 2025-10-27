/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petsapp;

/**
 *
 * @author 30128198
 */
public class Cat extends Pet {
    public Cat() {
        super();
    }
    
    public Cat(String name, int age, String favToy) {
        super(name,age,favToy);
    }
    
    public void meow() {
        System.out.println("Meow Meow");
    }
}
