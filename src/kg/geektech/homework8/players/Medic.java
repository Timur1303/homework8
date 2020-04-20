package kg.geektech.homework8.players;

public class Medic extends Heroes {
    private int healPoints;

    public Medic(int health, int damage, int healPoints) {
        super(health, damage, AbilityType.HEAL);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility(Boss boss, Heroes[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (this != heroes[i] && heroes[i].getHealth() < 100) {
                heroes[i].setHealth(heroes[i].getHealth() + healPoints);
            }
        }
    }



}
