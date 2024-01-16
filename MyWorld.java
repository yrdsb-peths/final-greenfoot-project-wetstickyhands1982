import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A dolphin that jumps over ships
 * 
 * @author (Avery Li) 
 * @version (13/12/23)
 */
public class MyWorld extends World
{
    public static int score = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        dolphin dolphin = new dolphin();
        addObject(dolphin, 300, 300);
        diver diver = new diver();
        
        
        
        
        
    }
    public void act()
    {
        showText("Score: " + score, 50, 25);
    }
    private void prepare()
    {
        score = 0;
        showText("Score: " + score, 50, 25);
    }
}
