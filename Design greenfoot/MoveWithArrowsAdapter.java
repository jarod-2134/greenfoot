import greenfoot.*;

public class MoveWithArrowsAdapter implements MoveInterface {
    private Actor actor;

    public void move(Actor actor) {
        this.actor = actor;
        KeyArrows keyArrows = new KeyArrows();
        keyArrows.keys(actor);
    }
}
