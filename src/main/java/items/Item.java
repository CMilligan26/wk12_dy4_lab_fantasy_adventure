package items;

import behaviours.IAddable;
import behaviours.IDroppable;

public class Item extends Content implements IDroppable, IAddable {

    public Item(String name) {
        super(name);
    }
}
