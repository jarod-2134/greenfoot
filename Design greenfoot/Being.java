import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baseclass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Being extends Actor
{
    protected MoveInterface moveInterface;
    protected FindInterface findInterface;
    protected KeyInterface keyInterface;

    public void act() 
    {       
        moveInterface.move(this);
        findInterface.find(this);
        keyInterface.keys(this);
    } 
}