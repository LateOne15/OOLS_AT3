/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lotteryapp;
import java.util.Random;

/**
 *
 * @author 30128198
 */
public class Lotto {
    private String companyName;
    private int[] numbers = {0,0,0,0,0,0};
    
    public Lotto() {
        companyName = "ABC Lottery Co.";
        generateNumbers();
    }
    
    public Lotto(String name) {
        companyName = name;
        generateNumbers();
    }
    
    private void generateNumbers() {
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            numbers[i] = rand.nextInt(1,8);
        }
    }
    
    public String playLotto(int[] winningNumbers) {
        int matching = 0;
        for (int i = 0; i < 6; i++) {
            if (winningNumbers[i] == numbers[i]) {
                matching++;
            }
        }
        int prize = 0;
        switch(matching) {
            default:
                prize = 0;
                break;
                
            case 1:
                prize = 100;
                break;
                
            case 2:
                prize = 200;          
                break;
                
            case 3:
                prize = 400;
                break;
                
            case 4:
                prize = 800;
                break;
                
            case 5:
                prize = 1600;
                break;
                
            case 6:
                prize = 3200;
                break;
        }
        String returning = "";
        returning += "### "+companyName+" ###";
        returning += "\nWinning numbers:";
        for (int num : winningNumbers) {
            returning += " "+num;
        }
        returning += "\nLotto numbers:  ";
        for (int num : numbers) {
            returning += " "+num;
        }
        returning += "\nPrize is $"+prize+".0";
        return returning;
    }
}
