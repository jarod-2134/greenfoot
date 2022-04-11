import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FindLittleRedCap implements FindInterface {
    private Actor actor;
    
    public void find(Actor actor){
    this.actor=actor;
    eatLittleRedCap(); 
    }
    
     public void eatLittleRedCap()
    {
        if(canSee(LittleRedCap.class))
        {
            removeObject (LittleRedCap.class);
        }
    }
}
