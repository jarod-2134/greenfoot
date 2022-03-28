import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Dit is het eerste level.
 * 
 * @Naomi Uwugiaren
 */
public class Level1 extends World
{

    public Level1()
    {   
        super(600, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new LittleRedCap(), 295, 550);

    }
}
