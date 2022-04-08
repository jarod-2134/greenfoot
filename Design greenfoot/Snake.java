public class Snake extends Animal {
    public Snake() {
    }

    @Override
    public void reveal() {
        System.out.println("I am a snake. You have to be afraid of me.");
    }
    
    @Override
    public void swim() {
        String className = this.getClass().getSimpleName().toLowerCase();
        System.out.println("This " + className + " can swim.");
    }
}
