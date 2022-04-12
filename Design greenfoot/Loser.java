import greenfoot.*;
import java.util.*;

public class Loser implements GameInterface {
    private Actor actor;
    public int score;

    public void game(Actor actor) {
        this.actor = actor;
        loser();
    }

    public void loser() {
       World world = actor.getWorld();
       score = Scoreboard.getScore();
       if(score<0){
           world.addObject(new Announcement(), 300, 300);
           Greenfoot.stop();
       }
    }
}
