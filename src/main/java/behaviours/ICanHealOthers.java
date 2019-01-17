package behaviours;

import items.Item;
import items.Player;

import java.util.ArrayList;

public interface ICanHealOthers {
    public void wield(Item item, ArrayList<Player> players);
}
