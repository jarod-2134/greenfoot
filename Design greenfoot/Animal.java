public abstract class Animal {
    
    SwimAction swimAction;
    RunAction runAction;

    abstract void reveal();

    public void swim() {
        this.swimAction.swim();
    }
    
    public void run(){
       this.runAction.run();
    }

}
