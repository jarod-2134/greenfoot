import greenfoot.*;
import java.util.*;

public class Winner implements GameInterface {
    private Actor actor;
    protected int score = 0;

    public void game(Actor actor) {
        this.actor = actor;
    }

    public void winner() {
        List list = (actor.getWorld().getObjectsAt(actor.getX(), actor.getY(), House.class));
        if (list.size() == 1) {

            if (this.score == 10) {
                World world = actor.getWorld();
                world.addObject(new WinnerAnnouncement(), 300, 300);

            }
        }
    }
}
