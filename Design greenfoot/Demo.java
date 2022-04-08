public class Demo {

    public static void main(String[] args) {
        Animal owl = new Owl();
        owl.run();
        owl.swim();
        owl.setRunAction(new Runner());
        owl.run();
    }
}