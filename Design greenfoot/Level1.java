import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.util.List;

public class Level1 extends World
{

    private final int PINKFLOWERS = 20;
    private final int BLUEFLOWERS = 2;
    private int margin = 50;
    GameController gameController;

    public Level1()
    {    
        super(600, 600, 1); 
        gameController=new GameController();       
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        addObject (new BackForthWolf(this.gameController), 300, 120);
        addObject (new Wolf(this.gameController), 200, 300);
        addObject (new LittleRedCap(), 300, 500);
        addFlowers(true, BLUEFLOWERS);
        addFlowers(false, PINKFLOWERS);
    }

    public int getRandomNumber(int min, int max)
    {
        Random random= new Random();
        int n= random.nextInt(max-min) + min;
        return n;
    }

    public void addFlowers(boolean poisonous, int flowers) {
        for (int i = 0; i < flowers; i++) {
            int x = getRandomNumber(margin,600-margin);
            int y = getRandomNumber(margin*3,600-margin);
            List list = getObjectsAt(x, y, Flower.class);
            //
            if (list.size()>0){
                //get a new random number
                x = getRandomNumber (margin,600-margin);
                y = getRandomNumber (margin*3,600-margin);
            }
            gameController.setPoisonous(poisonous);
            addObject(new Flower(gameController),x, y);
        }
    }
}