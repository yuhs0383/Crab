import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turtle extends Actor implements Freezable
{
    private int counter;
    public turtle(){
        counter = 100;
    }
    /**
     * Act - do whatever the turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move();
        turnAtEdge();
        lookForLobster();
    }
    
    public void move()
    {
        counter --;
        if(counter<=50)
        {
            move(2);
                if (Greenfoot.getRandomNumber(100) < 10)
                {   
                    turn(Greenfoot.getRandomNumber(90)-45);
                }
        }
        if(counter == -40)
        {
            counter = 100;
        }
        
    }
    
    public void freeze(int count){
        counter = count;
    }
    
    public void turnAtEdge(){
        if(isAtEdge()){
            turn(5);
        }
    }
   
    public void lookForLobster(){
        if( isTouching(Lobster.class) ) {
            removeTouching(Lobster.class);
        }
    }
}