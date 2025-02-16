package hero;

import armor.Armor;
import weapon.Weapon;

import java.util.SplittableRandom;

public class Archer extends Hero{
    public Archer(String name, int hp, Armor armor, Weapon weapon, String face) {
        super(name, hp, armor, weapon, face);
    }

    @Override
    public int attack(int diceResult) {
        SplittableRandom random = new SplittableRandom();
        boolean chance = random.nextInt(10) == 0;
        int superCrete = 0;
        if(chance) {
            superCrete = 10;
            System.out.println("Skill Skill Skill - - - SUPER CRETE");
        }
        return super.attack(diceResult) + superCrete;
    }
}
