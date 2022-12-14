package DemonClan.Players.Spellers;

import DemonClan.Helpers.Spells;
import DemonClan.Interfaces.ITarget;
import DemonClan.Players.Player;

public class Speller extends Player {

    private Spells spell;

    public Speller(String name, int healthLevel, Spells spell) {
        super(name, healthLevel);
        this.spell = spell;
    }

    public Spells getSpell() {
        return spell;
    }

    public void setSpell(Spells spell) {
        this.spell = spell;
    }

    public void giveDamage(ITarget target) {
        int damagePoints = this.spell.getDamage() * this.spell.getSpeed();
        target.takeDamage(damagePoints);
    }


}
