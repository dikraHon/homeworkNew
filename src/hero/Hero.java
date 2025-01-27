package hero;

import armor.Armor;
import weapon.Weapon;

public class Hero {
    private final String classHero;
    private int hp;
    private final Armor armor;
    private final Weapon weapon;
    private final String face;

    public Hero(String classHero, int hp, Armor armor, Weapon weapon, String face) {
        this.classHero = classHero;
        this.hp = hp;
        this.armor = armor;
        this.weapon = weapon;
        this.face = face;
    }

    public int attack(int diceResult) {
        return weapon.getDamage() + diceResult;
    }

    public void getDamage1(int damage) {
        int finalDamage = armor.reduceDamage(damage);
        hp -= finalDamage;
        System.out.println("Armor " + armor.getArmorRating());
        System.out.println("durability " + armor.getDurability());
        System.out.println("finalDamage " + finalDamage);
    }

    public boolean isLife() {
        return hp >= 0;
    }

    public String getClassHero() {
        return classHero;
    }

    public int getHp() {
        return hp;
    }

    public String getFace() {
        return face;
    }
}
