public class Owl extends Animal{
    public Owl() {
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
}