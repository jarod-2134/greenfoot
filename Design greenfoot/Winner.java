import greenfoot.*;
import java.util.*;

public class Winner implements GameInterface {
    private Actor actor;
    public int score;

    public void game(Actor actor) {
        this.actor = actor;
        winner();
    }

    public void winner() {
        World world = actor.getWorld();
        score = Scoreboard.getScore();

        List list = (actor.getWorld().getObjectsAt(actor.getX(), actor.getY(), House.class));
        if (list.size() == 1 && score > 4) {
        if(score > 4){
           world.addObject(new WinnerAnnouncement(), 300, 300);
           Greenfoot.stop();
        }
        
    }
    }
}
