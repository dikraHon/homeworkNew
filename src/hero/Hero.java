import armor.Armor;
import weapon.Weapon;

public class Hero {
    private String name;
    private int hp;
    private Armor armor;
    private Weapon weapon;

    Hero(String name, int hp, Armor armor, Weapon weapon){
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.weapon = weapon;
    }
}
