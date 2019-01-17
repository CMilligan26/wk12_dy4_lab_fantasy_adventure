package items;

import behaviours.ICanWearArmor;
import behaviours.ICanWieldWeapons;
import behaviours.IWearable;

public class Dwarf extends Player implements ICanWieldWeapons, ICanWearArmor {
    public Dwarf(String name) {
        super(name);
    }

    @Override
    public void equip(IWearable itemToWear) {

    }

    @Override
    public void wieldWeapon(Weapon weaponToWield) {

    }
}
