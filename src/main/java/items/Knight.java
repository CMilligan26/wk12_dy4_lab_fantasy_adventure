package items;

import behaviours.ICanWearArmor;
import behaviours.ICanWieldWeapons;
import behaviours.IWearable;

public class Knight extends Player implements ICanWieldWeapons, ICanWearArmor {
    public Knight(String name) {
        super(name);
    }

    @Override
    public void equip(IWearable itemToWear) {

    }

    @Override
    public void wieldWeapon(Weapon weaponToWield) {

    }
}
