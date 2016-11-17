import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobstar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobstar extends Actor
{
    /**
     * Act - do whatever the Lobstar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isAtEdge() ){
            turn(17);
        }    
        
        if (Greenfoot.getRandomNumber(100) < 10){
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        move(5);
        lookForCrab();
        lookForWorm();
    }
    
    public void lookForCrab(){
        if (isTouching(Crab.class)){
            removeTouching(Crab.class);
            
            Greenfoot.stop();
            getWorld().addObject(new Game_Over(),300,200);
        }
    }
    
        public void lookForWorm(){
        if (isTouching(Worm.class)){
            removeTouching(Worm.class);
            
            MyWorld Myworld = (MyWorld)getWorld();
            Myworld.addScore(-10);
        }
    }
}
