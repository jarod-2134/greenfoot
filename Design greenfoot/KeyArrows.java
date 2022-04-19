import greenfoot.*; 

public class KeyArrows implements KeyInterface {
    private Actor actor;
    private final int SPEED=5;

    public void keys(Actor actor)
    {
        this.actor=actor;
        if (Greenfoot.isKeyDown("left"))
        {
            actor.setLocation(actor.getX() -SPEED, actor.getY());
            actor.setImage("redcapleft.gif");
        }

        if (Greenfoot.isKeyDown("down"))
        {
            actor.setLocation(actor.getX(), actor.getY() + SPEED);
            actor.setImage("redcapfront.gif");

        }

        if (Greenfoot.isKeyDown("up"))
        {
            actor.setLocation(actor.getX(), actor.getY() - SPEED);
            actor.setImage("redcapbehind.gif");

        }

        if (Greenfoot.isKeyDown("right"))
        {
            actor.setLocation(actor.getX()+SPEED, actor.getY());
            actor.setImage("redcapright.gif");

        }
        
        if (Greenfoot.isKeyDown("a"))
        {
            actor.setLocation(actor.getX() -SPEED, actor.getY());
            actor.setImage("redcapleft.gif");
        }

        if (Greenfoot.isKeyDown("s"))
        {
            actor.setLocation(actor.getX(), actor.getY() + SPEED);
            actor.setImage("redcapfront.gif");

        }

        if (Greenfoot.isKeyDown("w"))
        {
            actor.setLocation(actor.getX(), actor.getY() - SPEED);
            actor.setImage("redcapbehind.gif");

        }

        if (Greenfoot.isKeyDown("d"))
        {
            actor.setLocation(actor.getX()+SPEED, actor.getY());
            actor.setImage("redcapright.gif");

        }
    }
}