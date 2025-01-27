package hero;

import armor.Armor;
import weapon.Weapon;

import java.util.SplittableRandom;

public class Paladin extends Hero {
    public Paladin(String name, int hp, Armor armor, Weapon weapon, String face) {
        super(name, hp, armor, weapon, face);
    }

    @Override
    public void getDamage1(int damage) {
        SplittableRandom random = new SplittableRandom();
        boolean chance = random.nextInt(5) == 0;
        if (chance) {
            damage = 0;
            System.out.println("Skill Skill Skill - - - SUPER SHIELD");
        }
        super.getDamage1(damage);
    }
}
