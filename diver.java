import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class diver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class diver extends Actor
{
    /**
     * Act - do whatever the ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
        if(Greenfoot.getRandomNumber(100) <10)
        {
            turn(Greenfoot.getRandomNumber(10) -20);
        }
        captureDolphin();
    }
    public void captureDolphin()
    {
      if(isTouching(dolphin.class))
      {
          removeTouching(dolphin.class);
          
      }
    }
    
    
    
    
}


