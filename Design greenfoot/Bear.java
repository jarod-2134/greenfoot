public class Bear extends Animal {

    public Bear() {
        reveal();
        swim();
        run();
    }

    @Override
    public void reveal() {
        System.out.println("I am a bear. You have to be afraid of me.");
    }
    
}
