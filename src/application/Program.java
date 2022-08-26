/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Champion;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Champion c1, c2 = new Champion();
        
        System.out.println("Enter data of First Champion: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Initial life: ");
        int life = sc.nextInt();
        System.out.print("Attack: ");
        int attack = sc.nextInt();
        System.out.print("Armor: ");
        int armor = sc.nextInt();
        sc.nextLine();
        c1 = new Champion(name, life, attack, armor);
        
        System.out.println();
        System.out.println("Enter data of Second Champion: ");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Initial life: ");
        life = sc.nextInt();
        System.out.print("Attack: ");
        attack = sc.nextInt();
        System.out.print("Armor: ");
        armor = sc.nextInt();
        c2 = new Champion(name, life, attack, armor);
        
        System.out.println();
        System.out.println("How many round would you like?" );
        int round = sc.nextInt();
        
        System.out.println();
       for(int i = 0; i < round; i++){
           System.out.println("Final Result round "+ i + ":");
           System.out.println(c1.getName()+": "+ c1.takeDamage(c2) + " of life");
        }    
            
        
                
        
        
        
        sc.close();
        
    }
    
}
