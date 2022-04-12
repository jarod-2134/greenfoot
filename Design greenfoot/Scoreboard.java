    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{   private static int score;
    public static final float FONTSIZE = 24.0f;
    public static final int WIDTH = 150;
    public static final int HEIGHT = 50;
    public static final int TRANSPARENCY = 128;
    public static final int RED = 255;
    public static final int GREEN = 255;
    public static final int BLUE = 255;
    
    public Scoreboard(int scoreParameter) 
    {
        score=scoreParameter;    
        makeScoreBoard();

    } 
    

    public void makeScoreBoard()
    {
          Color color = new Color (RED,GREEN,BLUE,TRANSPARENCY);
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT); //creates a new image with java
        image.setColor(new Color(0,0,0,TRANSPARENCY+100)); //set the color of the image
        image.fillRect(0, 0, WIDTH, HEIGHT); //fill the rectangle
        setImage(image); //create the image
        image.setColor(new Color(51,0,102,TRANSPARENCY+70));
        image.fillRect(5, 5, WIDTH-10, HEIGHT-10);
        image.setColor(new Color(0,0,102,TRANSPARENCY-20));
        image.fillRect(10,10 ,WIDTH-20, HEIGHT-20);
        Font font = image.getFont();
        font = font.deriveFont(FONTSIZE);
        image.setFont(font);
        image.setColor(new Color(255,255,255,TRANSPARENCY+100));
        image.drawString("score: " + score , 30, 32);
        setImage(image); //create the image

    }
    
    public static int getScore()
    {
        return score;
    }
}
