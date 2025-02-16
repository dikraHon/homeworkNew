import java.util.Random;

public class Arch extends Weapon{
    Arch(int damage, Random r) {
        super(damage, r);
    }
    @Override
    public int getDamage() {
        int crete = getRandom().nextInt(0, 1);
        return super.getDamage() + crete;
    }
}
