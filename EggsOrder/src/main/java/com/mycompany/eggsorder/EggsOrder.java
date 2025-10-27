/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eggsorder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author 30128198
 */
public class EggsOrder {

    public static void main(String[] args) {
        File eggsIn = new File("eggs.txt");
        try(Scanner sc = new Scanner(eggsIn)) {
            String input = sc.next();
            if (StringUtils.isNumeric(input)) {
                int eggs = Integer.parseInt(input);
                String output = calculateTotalAmount(eggs);
                System.out.println(output);
                File eggsOut = new File("total_amount.txt");
                try(FileWriter fw = new FileWriter(eggsOut)) {
                    fw.write(output);
                }
                catch(IOException e) {
                    System.out.println("Error: Unable to save file.");
                }
            }
            else { System.out.println("Error: File is not in correct format."); }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: No eggs file exists.");
        }
    }
    
    public static String calculateTotalAmount(int eggs) {
        int looseEgg = eggs%12;
        int dozenEgg = (eggs-looseEgg) / 12;
        double dozenCost = dozenEgg*7.25;
        double looseCost = looseEgg*0.75;
        String returning = "You ordered "+eggs+" eggs.\n"
                + "That is "+dozenEgg+" dozen eggs at $7.25 per dozen and "+looseEgg
                +" additional eggs\nat $0.75 each for a total of $"+String.format("%.2f",dozenCost+looseCost)+".";
        return returning;
    }
}
