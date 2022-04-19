import greenfoot.*; 

public interface GameControllerInterface  
{
    public void registerObserver(ObserverInterface observer);
	public void removeObserver(ObserverInterface observer);
	public void notifyObservers();
}