import greenfoot.*;
import java.util.Random; 

public class MoveRandom implements MoveInterface
{
    private Actor actor;
    private final int RANDOMWALK=10;
    private final int MOVESPEED=5;

    public void move(Actor actor){
        this.actor=actor;
        actor.move(MOVESPEED);
        turnAtEdge();
        walkRandom();
    }

    private void turnAtEdge()
    {
        int turn=0;
        if(atWorldEdge())
        {
            //east
            if(actor.getX()>570)
            {
                turn=getRandomNumber(150-RANDOMWALK,210+RANDOMWALK);
            }
            //south
            if(actor.getY()>570)
            {
                turn=getRandomNumber(240-RANDOMWALK,300+RANDOMWALK);
            } 
            //weast
            if(actor.getY()<30)
            {
                turn=getRandomNumber(60-RANDOMWALK,120+RANDOMWALK);
            }
            //north
            if(actor.getX()<30)
            {
                
                turn=getRandomNumber(330-RANDOMWALK,390+RANDOMWALK);
            }

            actor.setRotation(turn);
        }
    }

    /**
     * causes a random walk
     */
    private void walkRandom()
    {
        int randomNumber = getRandomNumber(-RANDOMWALK, RANDOMWALK+1);
        actor.setRotation (actor.getRotation()+randomNumber);
    }

    public boolean atWorldEdge()
    {
        if(actor.getX() < 20 || actor.getX() > actor.getWorld().getWidth() - 20)
            return true;
        if(actor.getY() < 20 || actor.getY() > actor.getWorld().getHeight() - 20)
            return true;
        else
            return false;
    } 

    public int getRandomNumber(int min, int max)
    {
        Random random= new Random();
        int n= random.nextInt(max-min) + min;
        return n;
    }
}