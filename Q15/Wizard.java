package JavaPractice.Q15;

import java.util.ArrayList;

public class Wizard {

    protected String name;
    protected int mana;
    protected int health;
    protected ArrayList<Spell> spells;

    public Wizard(String name, int mana, ArrayList<Spell> spells) {
        this.name = name;
        this.mana = mana;
        this.health = 100;
        this.spells = new ArrayList<>();
        this.spells.addAll(spells);
    }

    public void learnSpell(Spell s) {
        this.spells.add(s);
    }

    public void displayDetails() {
        System.out.println("Spells :");
        for (Spell s : spells) {
            s.displaySpellDetails();
        }
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getName() {
        return name;
    }

    public void castSpell(Spell s, Wizard w) {
        if (s.getManaCost() > this.getMana()) {
            System.out.println("Not enough Mana for Spell: " + s.getName());
        } else {
            System.out.println("Spell " + s.getName() + " being Casted on " + w.getName());
            this.setMana(this.getMana() - s.getManaCost());
            w.setHealth(w.getHealth() - s.getDamage());
            System.out.println("Damage Done: " + s.getDamage());
            if (w.getHealth() > 0) {
                System.out.println(w.getName() + "| Health: |" + w.getHealth() + " | Mana: | " + w.getMana() + " |");
                System.out.println(this.getName() + "| Health: |" + this.getHealth() + " | Mana: | " + this.getMana() + " |");
            }
        }
    }
}