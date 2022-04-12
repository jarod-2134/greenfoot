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
    private boolean poisonous;
    public Flower()
    {
        setImage("sm-flower-pink.gif");
    }
    
    public Flower(boolean  poisonousParameter)
    {
        poisonous=poisonousParameter;
        if(poisonous==true)
        {
            setImage("sm-flower-blue.gif");
        }else
        {
            setImage("sm-flower-pink.gif");
        }
    }
    
     public boolean getPoisonous()
    {
        return this.poisonous;
    }
    
     public int sampleMethod(int y)
    {
        this.poisonous=poisonous;
        return x+y;
    }
}
