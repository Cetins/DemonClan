package Quests.Players.Healers;

import Quests.ITarget;
import Quests.Helpers.Spells;
import Quests.Players.Player;

public class Cleric extends Player {

    private Spells spell;

    public Cleric(int healthLevel, Spells spell) {
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