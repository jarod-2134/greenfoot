import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class FindFlower implements FindInterface {
    private Actor actor;
    protected int score = 0;

    public void find(Actor actor) {
        this.actor = actor;
        pickFlowers();
    }

    public void pickFlowers() {
        List list = (actor.getWorld().getObjectsAt(actor.getX(), actor.getY(), Flower.class));
        if (list.size() == 1) {
            Flower flower = (Flower) list.get(0);
            actor.getWorld().removeObject(flower);

            if(flower.getPoisonous())
            {
                score=score-3;

            }else {
                score++;
            }
            Level1 Level1 = (Level1)actor.getWorld();
            World world = actor.getWorld();
            world.removeObjects(world.getObjects(Scoreboard.class));
            world.addObject (new Scoreboard(score), 75,25);
        }

    }
}
