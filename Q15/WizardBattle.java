package JavaPractice.Q15;

import java.util.Scanner;

public class WizardBattle {
    private Wizard w1;
    private Wizard w2;

    public void battle(Wizard w1, Wizard w2) {
        while (w1.getHealth() > 0 && w2.getHealth() > 0 && w1.getMana()>0 && w2.getMana()>0){
            Scanner scan = new Scanner(System.in);
            w1.displayDetails();
            System.out.println("Wizard " + w1.getName() + " choose a Spell to Cast");
            String s1 = scan.nextLine();
            boolean found = false;
            for (Spell s : w1.spells) {
                if (s.getName().equalsIgnoreCase(s1)) {
                    found = true;
                    w1.castSpell(s, w2);
                    break;
                }
            }
            if (!found) {
                System.out.println("Spell Not Found");
            }
            if (w2.getHealth() <= 0 || w2.getMana() <= 0) break;
            w2.displayDetails();
            System.out.println("Wizard " + w2.getName() + " choose a Spell to Cast");
            String s2 = scan.nextLine();
            boolean found2 = false;
            for (Spell s : w2.spells) {
                if (s.getName().equalsIgnoreCase(s2)) {
                    found2 = true;
                    w2.castSpell(s, w1);
                    break;
                }
            }
            if (!found2) {
                System.out.println("Spell Not Found");
            }
            if (w1.getHealth() <= 0 || w1.getMana() <= 0) break;
        }
        if (w1.getHealth()<=0){
            System.out.println("Wizard: "+w2.getName()+" has won the battle");
        }else if (w1.getMana()<=0){
            System.out.println("Wizard: "+w2.getName()+" has won the battle, "+w1.getName()+" has no Mana left");
        }
        else if (w2.getHealth()<=0){
            System.out.println("Wizard: "+w1.getName()+" has won the battle");
        }
        else if (w2.getMana()<=0){
            System.out.println("Wizard: "+w1.getName()+" has won the battle, "+w2.getName()+" has no Mana left");
        }
    }
}
