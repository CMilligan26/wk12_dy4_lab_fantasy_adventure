package items;

import behaviours.IAddable;
import behaviours.IWieldable;

public class Spell implements IWieldable, IAddable {
    String name;

    public Spell(String name) {
        this.name = name;
    }

}
