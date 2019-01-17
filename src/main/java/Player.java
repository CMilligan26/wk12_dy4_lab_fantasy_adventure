import java.util.ArrayList;

public class Player {
    private String name;
    private int hitPoints;
    private int experiencePoints;
    private int magicPoints;
    private ArrayList<IEquipable> equipped;
    private ArrayList<IAddable> inventory;
    private IWieldable wielding;

    public Player(String name) {
        this.name = name;
    }

    public void use(IUsable itemToUse){

    }

    public void wield(IWieldable itemToWield){

    }

    public void addItem(Content itemToAdd){

    }

    public void dropItem(Content itemToDrop, Room room){

    }

    public void equip(IEquipable itemToEquip){

    }

    public void unequip(IEquipable itemToUnequip){

    }
}
