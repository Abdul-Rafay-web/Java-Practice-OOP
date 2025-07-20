package JavaPractice.RPGSimulator;

public class Mage extends Character{
    public Mage(String name,int health,int attackPower){
        super(name, health, attackPower);
    }

    @Override
    public void attack(Character enemy) {
        enemy.setHealth(this.attackPower);
    }
}
