package _06_gridworld;

import java.awt.Color;
import java.util.Iterator;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GRIDWORLD {
void showWORLD() {
//making the world
World world = new World();
world.show();
Flower flo = new Flower();
for (int i = 0; i < 10; i++) {
	for (int l = 0; l < 10; l++) {
		try {
			Thread.sleep(111);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		flo.setColor(Color.PINK);
		Location loc = new Location(l,i);
		world.add(loc, flo);
		try {
			Thread.sleep(4);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		flo.setColor(Color.BLUE);
	}
}
}
}

