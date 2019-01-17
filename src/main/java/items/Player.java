package items;

import behaviours.IAddable;
import behaviours.IEquipable;
import behaviours.IUsable;
import behaviours.IWieldable;

import java.util.ArrayList;

public class Player {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public int getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(int magicPoints) {
        this.magicPoints = magicPoints;
    }

    private String name;
    private int hitPoints;
    private int experiencePoints;
    private int magicPoints;
    private ArrayList<IEquipable> equipped;
    private ArrayList<IAddable> inventory;
    private IWieldable wielding;

    public Player(String name) {

        this.name = name;
        this.equipped = new ArrayList<>();
        this.inventory = new ArrayList<>();
        this.wielding = null;
    }

    public void use(IUsable itemToUse){

    }

    public ArrayList<IEquipable> getEquipped() {
        return equipped;
    }

    public ArrayList<IAddable> getInventory() {
        return inventory;
    }

    public IWieldable getWielding() {
        return wielding;
    }

    public void wield(IWieldable itemToWield){

    }

    public void addItem(Content itemToAdd){
        this.inventory.add((IAddable) itemToAdd);
    }

    public void dropItem(Content itemToDrop, Room room){
        this.inventory.remove(itemToDrop);
        room.addItem(itemToDrop);
    }

    public void equip(IEquipable itemToEquip){

    }

    public void unequip(IEquipable itemToUnequip){

    }
}
