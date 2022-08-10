package Quests.Players;

import Quests.ITarget;
import Quests.Players.Helpers.Spells;

public class Speller extends Player{

    private Spells spell;

    public Speller(int healthLevel, Spells spell) {
        super(healthLevel);
        this.spell = spell;
    }

    public Spells getSpell() {
        return spell;
    }

    public void setSpell(Spells spell) {
        this.spell = spell;
    }

    public void damage(ITarget target) {
        int damagePoints = this.spell.getDamage() * this.spell.getSpeed();
        target.takeDamage(damagePoints);
    }
}
