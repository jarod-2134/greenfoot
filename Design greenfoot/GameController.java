import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;

public class GameController implements GameControllerInterface  {

    private List<ObserverInterface> beings= new ArrayList();
    private String image;
    private boolean poisonous;

    public void notifyObservers() {
        for (ObserverInterface being : beings) {
            being.update(this);
        }
    }

    public void removeObserver(ObserverInterface being) {
        int i = beings.indexOf(being);
        if (i >= 0) {
            beings.remove(i);
        }
    }

    public void registerObserver(ObserverInterface observer) {
        beings.add(observer);
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return this.image;   
    }

    public void setPoisonous(boolean poisonous) { 
        this.poisonous = poisonous;
    }

    public boolean isPoisonous() {
        return this.poisonous;
    }

}