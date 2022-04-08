public class Owl extends Animal{
    public Owl() {
        reveal();
        swim();
        run();
    }

    @Override
    public void reveal() {
        System.out.println("I am an owl. You don't have to be afraid of me.");
    }
    
    @Override
    public void swim() {
        String className = this.getClass().getSimpleName().toLowerCase();
        System.out.println("This " + className + " cannot swim or doesn't like it.");
    }

    @Override
    public void run() {
        String className = this.getClass().getSimpleName().toLowerCase();
        System.out.println("This " + className + " cannot run or doesn't like it.");
    }
}