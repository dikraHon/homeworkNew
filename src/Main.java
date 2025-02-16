import armor.HardArmor;
import armor.LightArmor;
import armor.MediumArmor;
import battleField.BattleField;
import hero.Archer;
import hero.Hero;
import hero.Paladin;
import hero.Rogue;
import weapon.Arch;
import weapon.Dagger;
import weapon.Sword;
import java.util.Random;
import java.util.Scanner;

/*Добавил игровое поле "BattleField",
 возможность нанести критический урон для лучника класс "Archer",
 критический промах для бандита класс "Rogue" и
 полное блокирование урона класс "Paladin"*/

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Hero heroOne = chooseYourHero(random);
        Hero heroTwo = chooseYourHero(random);
        assert heroOne != null;
        assert heroTwo != null;
        playGame(heroOne, heroTwo);
    }

    public static Hero chooseYourHero(Random random){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 3, где 1 - паладин, 2 - разбойник 3 - лучник ");
        int result = scanner.nextInt();
        return switch (result) {
            case 1 -> new Paladin("Paladin", 40, new HardArmor(20, 5),
                    new Sword(7, random), "@");
            case 2 -> new Rogue("Rog", 30, new MediumArmor(10, 5),
                    new Dagger(13, random), "&");
            case 3 -> new Archer("Archer", 20, new LightArmor(5, 10),
                    new Arch(17, random), "$");
            default -> null;
        };
    }


    private static void playGame(Hero player1, Hero player2) {
        BattleField border = new BattleField();
        border.setBorder(player1.getFace(), player2.getFace(), 4, 3, 4,15);
        Random x = new Random();
        Random y = new Random();

        while (player1.isLife() && player2.isLife()) {

            border.setBorder(player1.getFace(), player2.getFace(),
                    4, 9,
                    4,11);

            takeTurn(player1, player2);

            border.setBorder(player1.getFace(), player2.getFace(),
                    x.nextInt(1, 4), y.nextInt(1, 18),
                    x.nextInt(1,4), y.nextInt(1, 18));

            if (!player2.isLife()) break;
            takeTurn(player2, player1);
            if (!player1.isLife()) break;
        }

        System.out.println("\nИгра окончена!");
        if (player1.isLife()) {
            border.setBorder(player1.getFace(), " ",
                4, y.nextInt(1, 18),
                4, x.nextInt(1, 18));
            System.out.println(player1.getClassHero() + " победил!");

        } else {
            border.setBorder(" ", player2.getFace(),
                4, y.nextInt(1, 18),
                4, x.nextInt(1, 18));
            System.out.println(player2.getClassHero() + " победил!");

        }
    }

    private static void takeTurn(Hero attacker, Hero defender) {
        int damage;
        Random random =new Random();
        Dice trowDice = new Dice(random);
        System.out.println("Ход " + attacker.getClassHero() + "hp " + attacker.getHp());
        damage = attacker.attack(trowDice.getRandom());
        System.out.println("damage " + damage);
        defender.getDamage1(damage);
    }
}
