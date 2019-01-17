package items;

import behaviours.IDamage;

public class DamageSpell extends Spell implements IDamage {
    public DamageSpell(String name) {
        super(name);
    }
}
