/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petsapp;

/**
 *
 * @author 30128198
 */
public class Dog extends Pet {
    public Dog() {
        super();
    }
    
    public Dog(String name, int age, String favToy) {
        super(name,age,favToy);
    }
    
    public void bark() {
        System.out.println("Woof Woof");
    }
}
