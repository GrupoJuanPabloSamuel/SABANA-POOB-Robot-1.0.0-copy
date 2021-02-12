import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int y=getY();
        
        if(Greenfoot.isKeyDown("right"))
        move(1);
        if(Greenfoot.isKeyDown("left"))
        move(-1);
        if(Greenfoot.isKeyDown("up"))
         y--;
         
        if(Greenfoot.isKeyDown("down"))
         y++;
         setLocation(getX(),y);
        
       
    }    
}
