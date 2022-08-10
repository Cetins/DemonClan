package Quests.Players.Demons;

import Quests.IDamage;
import Quests.ITarget;
import Quests.Players.Helpers.Attacks;
import Quests.Players.Player;

public class Demon extends Player implements IDamage {

    private Attacks attack;

    public Demon(int healthLevel, Attacks attack) {
        super(healthLevel);
        this.attack = attack;
    }

    public Attacks getAttack() {
        return attack;
    }

    public void damage(ITarget target) {
        target.takeDamage(this.attack.getDamage() * this.attack.getSpeed());
    }
}
