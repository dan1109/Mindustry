package io.anuke.mindustry;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ObjectMap;

import io.anuke.mindustry.entities.Player;
import io.anuke.mindustry.entities.Weapon;
import io.anuke.mindustry.resource.Item;
import io.anuke.mindustry.resource.Recipe;
import io.anuke.mindustry.world.Tile;

/**ick, global state*/
public class Vars{
	public static final float placerange = 66;
	public static final float respawntime = 60*4;
	public static final float wavespace = 20*60;
	public static final float enemyspawnspace = 65;
	public static final float breakduration = 30;
	public static boolean debug = true;
	
	public static final Vector2 vector = new Vector2();
	
	public static final int tilesize = 8;
	
	public static Control control;
	public static UI ui;
	
	public static final ObjectMap<Item, Integer> items = new ObjectMap<>();
	public static final ObjectMap<Weapon, Boolean> weapons = new ObjectMap<Weapon, Boolean>();
	public static Weapon currentWeapon;
	
	public static Player player;
	
	public static float breaktime = 0;
	
	public static final String[] maps = {"delta", "canyon", "pit", "maze"};
	public static Pixmap[] mapPixmaps;
	public static Texture[] mapTextures;
	public static int worldsize = 128;
	public static int pixsize = worldsize*tilesize;
	public static Tile[][] tiles = new Tile[worldsize][worldsize];
	
	public static Recipe recipe;
	public static int rotation;
	
	public static int wave = 1;
	public static float wavetime;
	public static int enemies = 0;

	public static Tile core;
	public static Array<Tile> spawnpoints = new Array<Tile>();
	
	public static boolean playing = false;
	public static boolean paused = false;
	public static boolean showedTutorial = false;
	
	public static String[] aboutText = {
		"Made by [ROYAL]Anuken[] for the" + "\nGDL Metal Monstrosity jam.",
		"",
		"Sources used:",
		"- [YELLOW]bfxr.com[] for sound effects",
		"- [RED]freemusicarchive.org[] for music",
		"- Music made by [GREEN]RoccoW[]",
	};
	
	public static String[] tutorialText = {
		"[GREEN]Default Controls:",
		"[WHITE][YELLOW][[WASD][] to move, [YELLOW][[R][] to rotate blocks.",
		"Hold [YELLOW][[R-MOUSE][] to destroy blocks, click [YELLOW][[L-MOUSE][] to place them.",
		"[YELLOW][[L-MOUSE][] to shoot.",
		"",
		"[GOLD]Every 20 seconds, a new wave will appear.",
		"Build turrets to defend the core.",
		"If the core is destroyed, you lose the game.",
		"",
		"[LIME]To collect building resources, move them into the core with conveyors.",
		"[LIME]Place [ORANGE]drills[] on the right material,they will automatically mine material",
		"and dump it to nearby conveyors or turrets.",
		"",
		"[SCARLET]To produce steel, feed coal and iron into a smelter."
	};
}