/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lyndachallenge.challengeone.oopstyle;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author carlos belisario <carlos.belisario.gonzalez@gmail.com>
 */
public class House implements AreaCalculable {
    
    /**
     * @var int length
     */
    private int length;    
    
    /**
     * @var int width
     */
    private int width;
    
    /**
     * @var int hegth;
     */
    private int height;    
    
    private ArrayList<Window> window;
    
    private ArrayList<Door> door;
    
    /**
     * 
     * @param length
     * @param width
     * @param height 
     */
    public House(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.window = new ArrayList<>();
        this.door = new ArrayList<>();
    }
    
    /**
     * 
     * @param window
     * @return 
     */
    public House addWindow(Window window) {        
        this.window.add(window);
        return this;
    }
    
    /**
     * 
     * @return ArrayList
     */
    public ArrayList<Window> getWindow() {
        return window;
    }
    
    public House addDoor(Door door) {
        this.door.add(door);
        return this;
    }
    
    public ArrayList<Door> getDoor() {
        return door;
    }    
    
    /**
     * 
     * @return 
     */
    public int surfaceArea() {
        Iterator<Window> windowIterator = window.iterator();
        Iterator<Door> doorIterator = door.iterator();        
        int windowArea = 0;
        int doorArea = 0;
        while(windowIterator.hasNext()) {            
            windowArea += windowIterator.next().calculateArea();
        }
        windowArea *= window.size();
        
        while(doorIterator.hasNext()) {            
            doorArea += doorIterator.next().calculateArea();
        }
        doorArea *= window.size();
        return calculateArea() - (windowArea + doorArea);
    }
    
    @Override
    public int calculateArea() {        
        return width * height * 2 + length * height * 2;
    }
            
}
