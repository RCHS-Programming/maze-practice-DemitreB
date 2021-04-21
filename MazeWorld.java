import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeWorld here.
 * 
 * @author Demitre Beltran
 * @version (a version number or a date)
 */
public class MazeWorld extends World
{

    /**
     * Constructor for objects of class MazeWorld.
     * 
     */
    public MazeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        for(int i = 0; i < 16; i++)
        {
            addObject( new Wall ("edge.png"), 25 + 50*i, 12);
        }
        
        for(int i = 0; i < 16; i++)
        {
            addObject( new Wall ("edge.png"), 25 + 50*i, 587);
        }
        
        for(int i = 0; i < 16; i++)
        {
            addObject( new Wall ("edge2.png"), 12, + 25 + 50*i);
        }
        
        for(int i = 0; i < 16; i++)
        {
            addObject( new Wall ("edge2.png"), 788, + 25 + 50*i);
        }
        /*1st wall
         * medium top left wall
         */
        for(int i = 0; i < 7; i++)
        {
            addObject( new Wall ("edge.png"), 25 + 50*i, 150);
        }
        /*2nd wall
         * small vertical top left wall
         */
        for(int i = 0; i < 3; i++)
        {
            addObject( new Wall ("edge2.png"), 350, + 163 + 50*i);
        }
        /*3rd wall
         * medium vertical wall parralel to 2nd wall
         */
        for(int i = 0; i < 8; i++)
        {
            addObject( new Wall ("edge2.png"), 500, + 25 + 50*i);
        }
        
        for(int i = 0; i < 5; i++)
        {
            addObject( new Wall ("edge.png"), 513 + 50*i, 387);
        }
    }
}
