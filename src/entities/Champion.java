/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Admin
 */
public class Champion {
    
    private String name;
    private int life;
    private int attack;
    private int armor;
    
    public Champion(){
        
    }
    
     public Champion(String name, int life) {
        this.name = name;
        this.life = life;
    }

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
    
    public void takeDamage(Champion other){
      int damage = other.getAttack() - armor;
      if (other.getAttack() < armor){
          life += -1;
      }else{
          life += -damage;
      }
      
      if (life <= 0){
          life = 0;
      }
    }
    
    public String status(){
        if (life <= 0){
            return name
               +": "
               + life
               +" of life (Death)";
        }else{
            return name
               +": "
               + life
               +" of life";
            }
    }
}
