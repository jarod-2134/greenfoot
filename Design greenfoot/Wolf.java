import greenfoot.*;

public class Wolf extends Actor {

    private MoveInterface moveInterface;

    public Wolf() {
        moveInterface = new MoveRandom();
    }

    public void act() {
        moveInterface.move(this);
    }
}