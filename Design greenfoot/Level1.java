import greenfoot.*;  
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Level1 extends World
{
    private int pinkFlowers = 15;
    
    public Level1()
    {   
        super(600, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new LittleRedCap(), 295, 550);
        
        addObject(new Wolf(), 295, 150);
        
        addObject(new BackForthWolf(), 95, 250);
        
        addObject(new House(),500,50);
        
        addObject(new Scoreboard(0),75,25);
        
          for ( int counter = 0; counter < pinkFlowers; counter=counter+1){
            addObject (new Flower(getRandomNumber(0, 2)),
            getRandomNumber(100,500),
            getRandomNumber(100,500));
        }
    }
    
      public int getRandomNumber(int min, int max)
     { Random random = new Random(); //de class Random die standaard bij Java wordt meegeleverd
        int  n = random.nextInt(max-min) + min; //maak gebruik van de methode nextInt met een int als parameter
        return n; //geef de int n terugRandom random = new Random(); //de class Random die standaard bij Java wordt meegeleverd
    }
}
