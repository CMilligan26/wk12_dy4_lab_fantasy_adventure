package items;

import behaviours.IHeal;

public class HealingSpell extends Spell implements IHeal {
    public HealingSpell(String name) {
        super(name);
    }
}
