import greenfoot.*;
import java.util.*;

public class Loser implements GameInterface {
    private Actor actor;
    protected int score = 0;

    public void game(Actor actor) {
        this.actor = actor;
    }

    public void gameOver() {
        List list = (actor.getWorld().getObjectsAt(actor.getX(), actor.getY(), LittleRedCap.class));
        if (this.score < 0) {

            World world = actor.getWorld();
            Scoreboard scoreboard = actor.getWorld().getObjects(Scoreboard.class).get(0);
            this.score = scoreboard.getScore();
            world.addObject(new Announcement(), 300, 300);
            Greenfoot.stop();

        }
    }
}
