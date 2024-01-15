import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dolphin here.
 * 
 * @author (Avery) 
 * @version (12/20/23)
 */
public class dolphin extends Actor
{
    /**
     * Act - do whatever the dolphin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
        eatFish();
    }
    public void eatFish()
    {
        if(isTouching(fish.class))
        {
            removeTouching(fish.class);
        }
    }
    
    
}
