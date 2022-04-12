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
    private GameInterface gameInterface;
    private GameInterface gameInterface2;

    public LittleRedCap() {
        moveInterface = new MoveWithArrowsAdapter();
        findInterface = new FindFlower();
        gameInterface = new Winner();
        gameInterface2 = new Loser();
    }

    public void act() {
        moveInterface.move(this);
        findInterface.find(this);
        gameInterface.game(this);
        gameInterface2.game(this);
    }
}
