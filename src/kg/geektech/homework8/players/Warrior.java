package kg.geektech.homework8.players;

public class Warrior extends Heroes {


    public Warrior(int health, int damage) {
        super(health, damage, AbilityType.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Heroes[] heroes) {
        heroes[0].setDamage(heroes[0].getDamage() * 2);
        System.out.println("Warrior multiplied own damage");

    }
}
