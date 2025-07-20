package JavaPractice.RPGSimulator;

public abstract class Character {
        private String name;
        protected int health;
        protected int attackPower;

        public Character(String name, int health, int attackPower) {
            this.name = name;
            this.health = health;
            this.attackPower = attackPower;
        }

        public String getName() { return name; }
        public int getHealth() { return health; }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void attack(Character enemy); // Abstract Method (Polymorphism)
    }
