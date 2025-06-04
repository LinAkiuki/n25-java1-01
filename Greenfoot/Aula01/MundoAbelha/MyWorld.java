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
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,30,34);
        Abelha abelha = new Abelha();
        addObject(abelha,28,208);
        Mosca mosca = new Mosca();
        addObject(mosca,28,380);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,27,328);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,91,330);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,85,382);
    }
}
