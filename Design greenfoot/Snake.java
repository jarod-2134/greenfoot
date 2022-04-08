public class Snake extends Animal {

    public Snake() {
        reveal();
        super.swimAction = new Swimmer();
        super.runAction = new NoRunner();
    }

    @Override
    public void reveal() {
        System.out.println("I am a snake. You have to be afraid of me.");
    }
}
