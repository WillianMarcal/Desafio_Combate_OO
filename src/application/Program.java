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
        
        Champion champion;
        
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
        Champion c1 = new Champion(name, life, attack, armor);
        
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
        Champion c2 = new Champion(name, life, attack, armor);
      
       c1.takeDamage(c2);
       c2.takeDamage(c1); 
       
       System.out.println();
       System.out.print("How many round would you like? " );
       int round = sc.nextInt();
       
       System.out.println();
       for(int i = 1; i <= round; i++){
            System.out.println("Final Result round "+ i + ":");
            System.out.println(c1.status());
            System.out.println(c2.status());
           
             if(c1.getLife() == 0 || c2.getLife() == 0){
                i = 4;
                 System.out.println();
             }else{
                System.out.println("");
                c1.takeDamage(c2);
                c2.takeDamage(c1);
             }
        }    
       
        System.out.println("END OF FIGHT");
       
       
       sc.close();
        
    }
    
}
