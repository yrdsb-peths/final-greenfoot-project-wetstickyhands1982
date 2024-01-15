import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ship extends Actor
{
    /**
     * Act - do whatever the ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        if(Greenfoot.getRandomNumber(100) <10)
        {
            turn(Greenfoot.getRandomNumber(15) -30);
        }
        captureDolphin();
    }
    public void captureDolphin()
    {
      if(isTouching(dolphin.class))
      {
          removeTouching(dolphin.class);
          getWorld().showText("Game Over",300,200);
          
      }
    }
    
    
    
    
}
