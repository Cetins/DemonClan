package DemonClan.Players.Spellers;

import DemonClan.Helpers.Spells;
import DemonClan.ITarget;

public class Wizard extends Speller{

    public Wizard(int healthLevel, Spells spell) {
        super(healthLevel, spell);
    }

    public void magicArrowSpell(ITarget target) {
        int magicArrow = this.getSpell().getDamage() * 4;
        target.takeDamage(magicArrow);
    }
}
