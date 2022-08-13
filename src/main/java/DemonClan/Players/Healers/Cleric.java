package DemonClan.Players.Healers;

import DemonClan.ITarget;
import DemonClan.Helpers.Spells;
import DemonClan.Players.Player;

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
