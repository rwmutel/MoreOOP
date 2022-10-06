package lotr;

import java.util.Random;

abstract class Nobel extends Character {
    private static final Random randomGenerator = new Random();
    public Nobel(int minPower, int maxPower, int minHp, int maxHp) {
        super(randomGenerator.nextInt(maxPower - minPower) + minPower,
                randomGenerator.nextInt(maxHp - minHp) + minHp);
    }

    @Override
    public void kick(Character c){
        int damage = (int) (randomGenerator.nextDouble() * getPower());
        c.setHp(c.getHp() - damage);
        System.out.println(this.getClass().getName() + " kicks with " + damage + " damage!");
    }
}
