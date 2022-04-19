import greenfoot.*; 

public abstract class Being extends Actor implements ObserverInterface
{
    protected MoveInterface moveInterface;
    protected FindInterface findInterface;
    protected GameController gameController;

    public Being(GameController gameController) {
        this.gameController=gameController;
    }

    public Being() {
    }

    public void act() 
    {       
        moveInterface.move(this);
        findInterface.find(this);
    }

    public GameController getGameController() {
        return gameController;
    }

    public void setGameController(GameController gameController) {
        this.gameController = gameController;
    }

    public void update(GameController gameController) {
        this.moveInterface.speedup();
    }
}