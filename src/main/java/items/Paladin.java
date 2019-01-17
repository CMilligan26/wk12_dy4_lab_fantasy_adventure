package items;

import behaviours.ICanHealOthers;
import behaviours.ICanWearArmor;
import behaviours.ICanWieldWeapons;
import behaviours.IWearable;

import java.util.ArrayList;

public class Paladin extends Player implements ICanWearArmor, ICanWieldWeapons, ICanHealOthers {
    public Paladin(String name) {

        super(name);
	      this.setHitPoints(100);
		    this.setExperiencePoints(1000);
		    this.setMagicPoints(200);

    }


    @Override
    public void wield(Item item, ArrayList<Player> players) {

    }

    @Override
    public void equip(IWearable itemToWear) {

    }

    @Override
    public void wieldWeapon(Weapon weaponToWield) {

    }
}
