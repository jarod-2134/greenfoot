public class Wolf extends Animal{
    public Wolf() {
    }

    @Override
    public void reveal() {
        System.out.println("I am a wolf. You have to be afraid of me.");
    }
    
    @Override
    public void swim() {
        String className = this.getClass().getSimpleName().toLowerCase();
        System.out.println("This " + className + " cannot swim or doesn't like it.");
    }
}
