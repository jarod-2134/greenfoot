public class Wolf extends Animal{

    public Wolf() {
        reveal();
        swim();
        run();
    }

    @Override
    public void reveal() {
        System.out.println("I am a wolf. You have to be afraid of me.");
    }
    
}
