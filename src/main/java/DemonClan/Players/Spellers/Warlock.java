package DemonClan.Players.Spellers;

import DemonClan.Helpers.Spells;
import DemonClan.Interfaces.ITarget;

public class Warlock  extends Speller {

    public Warlock(String name, int healthLevel, Spells spell) {
        super(name, healthLevel, spell);
    }

    public void spellStorm(ITarget target) {
        int stormDamage = this.getSpell().getDamage() * 3;
        target.takeDamage(stormDamage);
    }
}
