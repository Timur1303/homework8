package kg.geektech.homework8.players;

public abstract class Heroes extends GameEntity implements HavingSuperAbility {

    private AbilityType abilityType;

    public Heroes(int health, int damage, AbilityType abilityType) {
        super(health, damage);
        this.abilityType = abilityType;
    }
}
