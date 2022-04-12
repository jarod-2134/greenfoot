import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class FindLittleRedCap implements FindInterface {
    private Actor actor;
    public int score;

    public void find(Actor actor) {
        this.actor = actor;
        eatLittleRedCap();

    }

    public void eatLittleRedCap() {
        List list = (actor.getWorld().getObjectsAt(actor.getX(), actor.getY(), LittleRedCap.class));
        if (list.size() == 1) {
            LittleRedCap littleRedCap = (LittleRedCap) list.get(0);
            actor.getWorld().removeObject(littleRedCap);
            World world = actor.getWorld();
            world.addObject (new Announcement(), 300, 300);
            Greenfoot.stop();
        }

    }
}
