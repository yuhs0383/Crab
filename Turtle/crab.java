import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class crab extends Actor
{
    private int number = 0;
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        lookForWorm();
        newWorm();
    }
    
    public void lookForWorm(){
        if (isTouching(worm.class)){
            removeTouching(worm.class);
            number++;
            
            World Myworld = getWorld();
            if(Myworld.score%100 == 0){
                getWorld().addObject(new Lobster(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
            }
        }
    }
    
    public void newWorm(){
        if(number == 1){
            getWorld().addObject(new worm(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
            number = 0;
        }
    }

}
