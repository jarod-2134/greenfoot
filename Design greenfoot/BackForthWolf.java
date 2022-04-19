import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BackForthWolf extends Being
{
    private MoveInterface moveInterface;
    private FindInterface findInterface;
    
    public BackForthWolf(GameController gameController) {
        this.moveInterface = new MoveBackForth();
        this.findInterface = new FindLittleRedCap();
        this.gameController=gameController;
        this.gameController.registerObserver(this);
    }

    public void act(){
        moveInterface.move(this);
        findInterface.find(this);
    }
}
