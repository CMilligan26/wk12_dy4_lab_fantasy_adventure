import java.util.ArrayList;

public class Paladin extends Player implements ICanWearArmor, ICanWieldWeapons, ICanHealOthers {
    public Paladin(String name) {
        super(name);
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
