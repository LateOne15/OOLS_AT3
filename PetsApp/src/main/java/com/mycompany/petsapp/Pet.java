/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petsapp;

/**
 *
 * @author 30128198
 */
public class Pet {
    private static int NextId = 1;
    public int id;
    public String name;
    public int age;
    public Toy favToy;
    
    public Pet() {
        this.id = NextId;
        NextId++;
        this.name = "Debbie";
        this.age = 2;
        this.favToy = new Toy("Ball");
    }
    
    public Pet(String name, int age, String favToy) {
        this.id = NextId;
        NextId++;
        this.name = name;
        this.age = age;
        this.favToy = new Toy(favToy);
    }
    
    public void speak() {
        System.out.println("Pet speaks");
    }
}
