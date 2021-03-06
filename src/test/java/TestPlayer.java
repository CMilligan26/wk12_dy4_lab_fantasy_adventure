import behaviours.IAddable;
import behaviours.IEquipable;
import items.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestPlayer {

	private Paladin player;
	private Weapon sword;

	@Before
	public void setUp() {
		player = new Paladin("Roland");
		sword = new Weapon("Sword");
		player.addItem(sword);
	}

	@Test
	public void playerHasName() {
		assertEquals("Roland",player.getName());
	}

	@Test
	public void playerHasHitPoints() {
		assertEquals(100, player.getHitPoints());
	}

	@Test
	public void playerHasExperience() {
		assertEquals(1000, player.getExperiencePoints());
	}

	@Test
	public void playerHasMagicPoints() {
		assertEquals(200, player.getMagicPoints());
	}

	@Test
	public void playerCanAddContent() {
		ArrayList<IAddable> things = player.getInventory();
		assertEquals(sword, (Content)(things.get(0)));
	}

	@Test
	public void playerCanDropItem() {
		Room ballroom = new Room("Ballroom", "You are in a ballroom, a room with balls.");
		player.dropItem(sword, ballroom);
		assertEquals(0,player.getInventory().size());
		assertEquals(1, ballroom.getContents().size());
		assertEquals(sword, ballroom.getContents().get(0));
	}

	@Test
	public void playerCanEquipItem(){
		player.equip(sword);
		ArrayList<IEquipable> equippedThings = player.getEquipped();
		ArrayList<IAddable> inventory = player.getInventory();
		assertEquals(sword, equippedThings.get(0));
		assertEquals(0, inventory.size());
	}

	@Test
	public void playerCannotEquipItemWhichIsNotInInventory() {
		Weapon mace = new Weapon("Mace of Base");
		player.equip(mace);
		ArrayList<IEquipable> equippedThings = player.getEquipped();
		assertEquals(0, equippedThings.size());
	}

	@Test
	public void playerCanUnequipItems(){
		player.equip(sword);
		player.unequip(sword);
		ArrayList<IEquipable> equippedThings = player.getEquipped();
		ArrayList<IAddable> inventory = player.getInventory();
		assertEquals(0, equippedThings.size());
		assertEquals(sword, inventory.get(0));
	}

	@Test
	public void playerCannotUnequipItemThatisNotEquipped() {
		player.equip(sword);
		Weapon mace = new Weapon("Mace of Base");
		player.unequip(mace);
		ArrayList<IEquipable> equippedThings = player.getEquipped();
		assertEquals(1, equippedThings.size());
	}
}
