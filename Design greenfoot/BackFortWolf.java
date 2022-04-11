import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BackFortWolf extends Actor
{
    private MoveInterface moveInterface;

    public BackFortWolf() {
        moveInterface = new MoveBackFort();
    }

    public void act(){
        moveInterface.move(this);
    }
}
