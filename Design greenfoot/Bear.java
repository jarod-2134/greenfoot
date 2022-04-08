public class Bear extends Animal {

    public Bear() {
        reveal();
        super.swimAction = new Swimmer();
        super.runAction = new Runner();
    }

    @Override
    public void reveal() {
        System.out.println("I am a bear. You have to be afraid of me.");
    }
    
}
