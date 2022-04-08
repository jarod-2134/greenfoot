public class Snake extends Animal {

    public Snake() {
        reveal();
        swim();
        run();
    }

    @Override
    public void reveal() {
        System.out.println("I am a snake. You have to be afraid of me.");
    }
    
 @Override
    public void run() {
        String className = this.getClass().getSimpleName().toLowerCase();
        System.out.println("This " + className + " cannot run or doesn't like it.");
    }

}
