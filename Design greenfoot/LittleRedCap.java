import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LittleRedcap here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class LittleRedCap extends Actor {
    private MoveInterface moveInterface;
    private FindInterface findInterface;
    
    public LittleRedCap() {
        moveInterface = new MoveWithArrowsAdapter();
        findInterface = new FindFlower();
    }

    public void act() {
        moveInterface.move(this);
        findInterface.find(this);
    }
}
