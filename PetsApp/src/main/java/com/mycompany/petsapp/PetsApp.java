/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.petsapp;

/**
 *
 * @author 30128198
 */
public class PetsApp {

    public static void main(String[] args) {
        Pet p = new Pet();
        System.out.println("Pet:");
        p.speak();
        System.out.println("");
        
        p = new Dog();
        System.out.println("Dog:");
        p.speak();
        ((Dog)p).bark();
        System.out.println("");
        
        p = new Cat();
        System.out.println("Cat:");
        p.speak();
        ((Cat)p).meow();
    }
}
