public class Wolf extends Animal{

    public Wolf() {
        reveal();
        super.swimAction = new Swimmer();
        super.runAction = new Runner();
    }

    @Override
    public void reveal() {
        System.out.println("I am a wolf. You have to be afraid of me.");
    }
    
}
