import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FindFlower implements FindInterface {
    private Actor actor;
    
    public void find (Actor actor){
    pickflowers();
    }
    
    public void pickflowers()
    {
        if(canSee(Flower.class))
        {
            Flower flower = (Flower) getOneObjectAtOffset(0, 0, Flower.class);
            if(flower.getPoisonous())
            {
                removeObject (LittleRedCap.class);
                score=score-3;

            }else {
                score++;
            }
            removeObject (Flower.class);
            Level1 Level1 = (Level1)getWorld();
            World world = getWorld();
            world.removeObjects(world.getObjects(Scoreboard.class));
            world.addObject (new Scoreboard(score), 75,25);

        }
    }
}
