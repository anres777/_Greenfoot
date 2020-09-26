import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bee extends Actor
{
    /**
     * Act - do whatever the bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int o = 3;
    // 12 para norte, 3 oeste, 6 sur, 9 este
    public void act() 
    {
        mover(2);        
    }
    public void mover(int c){
        int OA = getRotation();
        int OF = 0;
        int OR = 0;
        if(Greenfoot.isKeyDown("down")){
            OF = 90;
            calcularAngulo(OA,OF, c);
        }else{
            if(Greenfoot.isKeyDown("left")){
                OF = 180;
                calcularAngulo(OA,OF, c);
            }else{
                if(Greenfoot.isKeyDown("up")){
                    OF = 270;
                    calcularAngulo(OA,OF, c);
                }else{
                    if(Greenfoot.isKeyDown("right")){
                        OF = 360;
                        calcularAngulo(OA,OF, c);
                    }
                }
            }
        } 
    }
    public void calcularAngulo(int OA, int OF, int c){
        int OR=0;
        if(OA < OF){
            OR = OF - OA;
        }else{
            OR = OA - OF;
        }
        turn(OR);
        move(c);
    }
}
