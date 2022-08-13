package DemonClan.Players.Spellers;

import DemonClan.Helpers.Spells;
import DemonClan.Interfaces.ITarget;

public class Wizard extends Speller{

    public Wizard(String name, int healthLevel, Spells spell) {
        super(name, healthLevel, spell);
    }

    public void magicArrowSpell(ITarget target) {
        int magicArrow = this.getSpell().getDamage() * 4;
        target.takeDamage(magicArrow);
    }
}
