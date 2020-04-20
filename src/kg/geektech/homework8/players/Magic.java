package kg.geektech.homework8.players;

public class Magic extends Heroes {
    private int boostDamage;


    public Magic(int health, int damage, int boostDamage) {
        super(health, damage, AbilityType.BOOST);
        this.boostDamage = boostDamage;
    }

    @Override
    public void applySuperAbility(Boss boss, Heroes[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage() + boostDamage);
        }
        System.out.println("Magic boosted heroes damage");
    }
}
