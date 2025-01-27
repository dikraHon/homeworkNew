package weapon;

import java.util.Random;

public class Weapon {

    private final int damage;
    private final Random random;

    public Weapon(int damage, Random random) {
        this.damage = damage;
        this.random = random;
    }

    public int getDamage() {
        return random.nextInt(0, damage);
    }

    public Random getRandom() {
        return random;
    }
}
