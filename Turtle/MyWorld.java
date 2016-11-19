import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int score;
    private int wormNumber = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(800, 600, 1);
        addWorm();
        addObject(new turtle(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
    }
    
    public void addWorm(){
        while(wormNumber <= 10){
            addObject(new worm(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
            wormNumber++;
        }
    }
}
