import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BackForthWolf extends Actor
{
    private MoveInterface moveInterface;
    private FindInterface findInterface;
    
    public BackForthWolf() {
        moveInterface = new MoveBackForth();
        findInterface = new FindLittleRedCap();
    }

    public void act(){
        moveInterface.move(this);
        findInterface.find(this);
    }
}
