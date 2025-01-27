package weapon;

import java.util.Random;

public class Arch extends Weapon {
    public Arch(int damage, Random random) {
        super(damage, random);
    }

    @Override
    public int getDamage() {
        int crete = getRandom().nextInt(0, 1);
        return super.getDamage() + crete;
    }
}
