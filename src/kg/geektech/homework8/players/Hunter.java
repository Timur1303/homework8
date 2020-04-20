package kg.geektech.homework8.players;

public class Hunter extends Heroes {


    public Hunter(int health, int damage) {
        super(health, damage, AbilityType.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Boss boss, Heroes[] heroes) {
        heroes[3].setDamage(heroes[3].getDamage() + 15);
        System.out.println("Hunter increased damage for " + 15);
    }
}
