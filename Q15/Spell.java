package JavaPractice.Q15;

import java.util.ArrayList;

public class Spell {
    private final String name;
    private final int manaCost;
    private final int damage;
    public Spell(String name,int manaCost,int damage){
        this.name=name;
        this.manaCost=manaCost;
        this.damage=damage;
    }
    public void displaySpellDetails(){
        System.out.println(" Name: | "+this.name+" | Mana Cost: |"+this.manaCost+" | Damage: | "+this.damage+" |");
    }

    public int getManaCost() {
        return manaCost;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
}
