import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

import java.awt.Color;
import java.util.ArrayList;

public class BlusterCritterRunner {


    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(4, 4), new QuickCrab());
        world.add(new Location(5, 8), new QuickCrab());
        world.add(new Location(6, 8), new QuickCrab());
        world.add(new Location(7, 8), new QuickCrab());
        world.add(new Location(8, 8), new QuickCrab());
        world.show();
    }
}