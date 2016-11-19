import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
     /**
     * Act - do whatever the Lobstar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        lookForCrab();
    }
    
    public void lookForCrab(){
        if (isTouching(crab.class)){
            removeTouching(crab.class);
            getWorld().addObject(new restart(), 400, 400);
        }
    }
}
