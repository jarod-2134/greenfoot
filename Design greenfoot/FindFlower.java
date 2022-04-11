import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FindFlower implements FindInterface {
    private Actor actor;
    
    public void find (Actor actor){
        this.actor=actor;
    pickflowers();
    }
    
    public void pickflowers()
    {
        if(canSee(Flower.class))
        {
            removeObject (Flower.class);
        }
    }
}
