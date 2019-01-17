package items;

import behaviours.IAddable;
import behaviours.IDamage;
import behaviours.IDroppable;
import behaviours.IWieldable;

public class Weapon extends Content implements IDroppable, IAddable, IWieldable, IDamage {

    public Weapon(String name) {
        super(name);
    }
}
