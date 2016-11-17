import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    private int speed = 4;
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        lookForWorm();
        checkKeypress();
    }
    
    public void lookForWorm(){
        if (isTouching(Worm.class)){
            removeTouching(Worm.class);
            
            MyWorld Myworld = (MyWorld)getWorld();
            Myworld.addScore(10);
        }
    }
    
    public void checkKeypress(){
        if(Greenfoot.isKeyDown("up")) {
            turn(5);
        }  
        
        if(Greenfoot.isKeyDown("down")) {
            turn(-5);
        }
        
        if(Greenfoot.isKeyDown("left")) {
            move(-5);
        }
         
        if (Greenfoot.isKeyDown("right")) {
            move(5);
        }
    }
}
