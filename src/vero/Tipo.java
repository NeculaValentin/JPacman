package vero;

import java.util.Vector;

class Tipo {
    boolean wall = false;
    boolean dot = false;
    boolean bigDot = false;
    boolean eaten = false;
    Vector pos;
    //-------------------------------------------------------------------------------------------------------------------------------------------
    //constructor
    Tipo(int x, int y) {
        pos = new Vector(x, y);
    }
    //-----------------------------------------------------------------------------------------------------------------------------------------------
//draw a dot if there is one in this tile

}