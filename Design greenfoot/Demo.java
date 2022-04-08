public class Demo {

    public static void main(String[] args) {
        Animal owl = new Owl();
        owl.reveal();
        owl.swim();

        Animal snake = new Snake();
        snake.reveal();
        snake.swim();

        Animal bear = new Bear();
        bear.reveal();
        bear.swim();
        
        Animal wolf = new Wolf();
        wolf.reveal();
        wolf.swim();
    }
}