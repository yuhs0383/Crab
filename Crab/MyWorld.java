import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int score;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        score = 0;
        showScore();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,306,198);
        Lobstar lobstar = new Lobstar();
        addObject(lobstar,132,292);
    }
    
    public void addScore(int points)
    {
        score = score + points;
        showScore();
    }
    
        public int getScore()
    {
        return score;
    }
    
        private void showScore()
    {
        showText("Score:" + score, 80, 25);
    }
}
