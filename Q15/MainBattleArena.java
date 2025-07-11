package JavaPractice.Q15;

import java.util.ArrayList;

public class MainBattleArena {
    public static void main(String[] args){
        Spell s1=new Spell("FireBall",3,40);
        Spell s2=new Spell("Poison",2,30);
        Spell s3=new Spell("Earthquake",5,50);
        Spell s4=new Spell("Tornado",1,20);
        Spell s5=new Spell("Freeze",4,45);
        Spell s6=new Spell("SnowBall",4,45);
        ArrayList<Spell> spells1=new ArrayList<>();
        spells1.add(s1);
        spells1.add(s2);
        spells1.add(s5);
        ArrayList<Spell> spells2=new ArrayList<>();
        spells2.add(s3);
        spells2.add(s4);
        spells2.add(s6);
        Wizard w1=new Wizard("Hashir",10,spells1);
        Wizard w2=new Wizard("Danish",10,spells2);
        WizardBattle wizardBattle=new WizardBattle();
        wizardBattle.battle(w1,w2);
    }
}
