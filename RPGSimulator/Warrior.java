package JavaPractice.RPGSimulator;

public class Warrior extends Character{
    public Warrior(String name,int health,int attackPower){
        super(name, health, attackPower);
    }

    @Override
    public void attack(Character enemy) {
        enemy.setHealth(this.attackPower+10);
    }
}
