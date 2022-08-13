package DemonClan.Players.Spellers;

import DemonClan.Helpers.Spells;
import DemonClan.ITarget;

public class Warlock  extends Speller {

    public Warlock(int healthLevel, Spells spell) {
        super(healthLevel, spell);
    }

    public void spellStorm(ITarget target) {
        int stormDamage = this.getSpell().getDamage() * 3;
        target.takeDamage(stormDamage);
    }
}
