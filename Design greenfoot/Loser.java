import greenfoot.*;
import java.util.*;

public class Loser implements GameInterface {
    private Actor actor;
    protected int score = 0;

    public void game(Actor actor) {
        this.actor = actor;
        loser();
    }

    public void loser() {
        List list = (actor.getWorld().getObjectsAt(actor.getX(), actor.getY(), scoreboard.class));
        if (list.size() == 1) {

            if (this.score == 10) {
                World world = actor.getWorld();
                world.addObject(new WinnerAnnouncement(), 300, 300);

            }
        }
    }
}
