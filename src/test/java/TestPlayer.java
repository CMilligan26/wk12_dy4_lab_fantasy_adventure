import behaviours.IAddable;
import items.Content;
import items.Paladin;
import items.Player;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestPlayer {

	private Paladin player;

	@Before
	public void setUp() {
		player = new Paladin("Roland");
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
		Weapon sword = new Weapon("Sword");
		player.addItem(sword);
		ArrayList<IAddable> things = player.getInventory();
		assertEquals(sword, (Content)(things.get(0)));
	}

}
