import greenfoot.*; 

public interface GameController  
{
    public void registerObserver(ObserverInterface observer);
	public void removeObserver(ObserverInterface observer);
	public void notifyObservers();
}