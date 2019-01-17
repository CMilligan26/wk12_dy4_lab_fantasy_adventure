package items;

import behaviours.ICanCastSpells;

public class Mage extends Player implements ICanCastSpells {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void cast(Spell spellToCast) {

    }
}
