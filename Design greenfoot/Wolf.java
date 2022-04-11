import greenfoot.*;

public class Wolf extends Actor {

    private MoveInterface moveInterface;
    private FindInterface findInterface;
    
    public Wolf() {
        moveInterface = new MoveRandom();
        findInterface = new FindLittleRedCap
    }

    public void act() {
        moveInterface.move(this);
        findInterface.find(this);
    }
}
