abstract class Animal {

    abstract void reveal();
    abstract void swim();

}

class Cat extends Animal{

@Override
public void reveal(){
System.out.println("I am a cat and I can eat you!");
}
public void swim(){
System.out.println("I can swim");
}
}

class Bear extends Animal {

    @Override
    public void reveal() {
        System.out.println("I am a bear and I can eat you!");
    }
    public void swim(){
    System.out.println("I cant swim");
    }

}



class Main {
  public static void main(String[] args) {
    Cat myCat = new Cat();
    Bear myBear = new Bear();
    myBear.reveal();
    myBear.swim();
    myCat.reveal();
    myCat.swim();
  }
}
