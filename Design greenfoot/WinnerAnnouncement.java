import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class WinnerAnnouncement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinnerAnnouncement  extends Actor
{
    // instance variables - replace the example below with your own
    private int score;
    public static final int WIDTH = 300;
    public static final int HEIGHT = 300;
    public static final float FONTSIZE = 60.0f;
    public static final int TRANSPARENCY = 128;
    public static final int RED = 255;
    public static final int GREEN = 255;
    public static final int BLUE = 255;

    /**
     * Constructor for objects of class WinnerAnnouncement
     */
    public WinnerAnnouncement()
    {
        makeWinner();
      
    }

    public void makeWinner()
    {
        Color color = new Color (RED,GREEN,BLUE,TRANSPARENCY);
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);
        image.setColor(new Color(RED,0,0,TRANSPARENCY+30));
        image.fillRect(0, 0, WIDTH, HEIGHT);
        setImage(image); 
        image.setColor(new Color(0,0,0,TRANSPARENCY+100));
        Font font = image.getFont();
        image.setFont(font);
        image.setFont(image.getFont().deriveFont(20f));
        font = font.deriveFont(FONTSIZE+1000);
        image.drawString("You win", 115 , 150);
        image.setColor(new Color(204,102,0,TRANSPARENCY+30));
        image.fillRect(15, 15, WIDTH-30, HEIGHT-30);
        image.setColor(new Color(255,255,51,TRANSPARENCY-70));
        image.fillRect(30, 30 ,WIDTH-60, HEIGHT-60);
    }

  
}
