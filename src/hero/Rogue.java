package hero;

import armor.Armor;
import weapon.Weapon;

import java.util.SplittableRandom;

public class Rogue extends Hero {
    public Rogue(String classHero, int hp, Armor armor, Weapon weapon, String face) {
        super(classHero, hp, armor, weapon, face);
    }

    @Override
    public void getDamage1(int damage) {
        SplittableRandom random = new SplittableRandom();
        boolean chance = random.nextInt(7) == 0;
        if (chance) {
            damage -= 10;
            System.out.println("Skill Skill Skill - - - SUPER CRETE MISS");
        }
        super.getDamage1(damage);
    }
}
