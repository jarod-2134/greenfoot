import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the flowers in the game.
 * 
 * @author (Jarod de Graaf) 
 * @version (12-4-2017)
 */
public class Flower extends Actor
{
    private int x;
    private boolean ifpoisonous;
    public Flower()
    {
        setImage("sm-flower-pink.gif");
    }
    
    public Flower(int poisonous)
    {
        if(poisonous == 1)
        {
            setImage("sm-flower-blue.gif");
            ifpoisonous = true;
        }else
        {
            setImage("sm-flower-pink.gif");
            ifpoisonous = false;
        }
    }
    
     public boolean getPoisonous()
    {
        return this.ifpoisonous;
    }

}
