import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        oruga oruga = new oruga();
        addObject(oruga,285,106);
        oruga.setLocation(441,83);
        oruga.setLocation(468,101);
        bee bee = new bee();
        addObject(bee,215,199);
        fly fly = new fly();
        addObject(fly,377,297);
        fly fly2 = new fly();
        addObject(fly2,88,74);
        fly.setLocation(365,310);
        fly.setLocation(370,293);
        fly.setLocation(370,293);
        fly.turn(180);
        fly.getRotation();
    }
}
