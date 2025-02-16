package armor;

import java.util.Random;

public class LightArmor extends Armor {
    Random random;
    public LightArmor(int armorRating, int durability) {
        super(armorRating, durability);
        random = new Random();
    }
    @Override
    public int reduceDamage(int damage) {
        return super.reduceDamage(damage) - random.nextInt(0, 2);
    }
}
