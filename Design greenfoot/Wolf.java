import greenfoot.*;

public class Wolf extends Being {

    private MoveInterface moveInterface;
    private FindInterface findInterface;
    
    public Wolf(GameController gameController) {
        moveInterface = new MoveRandom();
        findInterface = new FindLittleRedCap();
        this.gameController=gameController;
        this.gameController.registerObserver(this);
    }

    public void act() {
        moveInterface.move(this);
        findInterface.find(this);
    }
}
