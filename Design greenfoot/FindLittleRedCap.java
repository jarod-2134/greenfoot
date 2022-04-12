import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class FindLittleRedCap implements FindInterface {
    private Actor actor;
    protected int score = 0;

    public void find(Actor actor) {
        this.actor = actor;
        eatLittleRedCap();
    }

    public void eatLittleRedCap() {
        List list = (actor.getWorld().getObjectsAt(actor.getX(), actor.getY(), LittleRedCap.class));
        if (list.size() == 1) {
            World world = actor.getWorld();
            world.removeObjects(world.getObjects(Scoreboard.class));
            world.addObject(new Scoreboard(score), 75, 25);

            LittleRedCap littleRedCap = (LittleRedCap) list.get(0);
            actor.getWorld().removeObject(littleRedCap);
            score = -10;
        }

    }
}
