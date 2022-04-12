import greenfoot.*; 

public class MoveBackForth implements MoveInterface
{
    private Actor actor;

    public void move(Actor actor){
        this.actor=actor;
        actor.move(3);
        atWorldEdge();
        turnAtEdge();
    }

    private boolean atWorldEdge()
    {
        if(actor.getX() < 20 || actor.getX() > actor.getWorld().getWidth() - 20)
            return true;
        if(actor.getY() < 20 || actor.getY() > actor.getWorld().getHeight() - 20)
            return true;
        else
            return false;
    }

    private void turnAtEdge()
    {
        if(atWorldEdge())
        {
            //eastside
            if(actor.getX()>570)
            {
                //resetting image
                actor.setRotation(180);
                actor.getImage().mirrorVertically();
            }
            //westside
            if(actor.getX()<30)
            {
                //resetting image
                actor.setRotation(360);
            }
        }
    }
}