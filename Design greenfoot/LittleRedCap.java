import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LittleRedcap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LittleRedCap extends BaseClass
{
    private int speed=1;
    
    public void act() 
    {
         keys();
    }
    
    public void keys()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + speed, getY());
            setImage("redcapright.gif");
        }

        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - speed);
            setImage("redcapbehind.gif");

        }

        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + speed);
            setImage("redcapfront.gif");

        }

        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()- speed, getY());
            setImage("redcapleft.gif");

        }
    }
}
