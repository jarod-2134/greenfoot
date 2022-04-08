public abstract class Animal {
    
    abstract void reveal();

    public void swim() {
        String className = this.getClass().getSimpleName().toLowerCase();
        System.out.println("This "  + className+  " is swimming.");
    }
    
    public void run(){
        String className =this.getClass().getSimpleName().toLowerCase();
        System.out.println("This " + className+ " is running.");
    }

}
