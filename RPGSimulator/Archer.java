package JavaPractice.RPGSimulator;

public class Archer extends Character{
    public Archer(String name,int health,int attackPower){
        super(name, health, attackPower);
    }

    @Override
    public void attack(Character enemy) {
        enemy.setHealth(this.attackPower);
        enemy.setHealth(this.attackPower);
    }
}
