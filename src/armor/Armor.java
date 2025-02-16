package armor;

public class Armor {

    private final int armorRating;
    private int durability;

    public Armor(int armorRating, int durability){
        this.armorRating = armorRating;
        this.durability = durability;
    }

    public int reduceDamage(int damage){
        if (durability <= 0){
            return damage;
        }
        durability -= 1;
        return Math.max(damage - durability, 0);
    }

    public int getArmorRating() {
        return armorRating;
    }

    public int getDurability() {
        return durability;
    }
}
