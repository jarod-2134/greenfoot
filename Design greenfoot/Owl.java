public class Owl extends Animal{
    public Owl() {
        reveal();
        super.swimAction = new NoSwimmer();
        super.runAction = new NoRunner();
    }

    @Override
    public void reveal() {
        System.out.println("I am an owl. You don't have to be afraid of me.");
    }
}