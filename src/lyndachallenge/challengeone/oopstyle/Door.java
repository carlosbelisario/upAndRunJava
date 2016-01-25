/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lyndachallenge.challengeone.oopstyle;

/**
 *
 * @author carlos belisario <carlos.belisario.gonzalez@gmail.com>
 */
public class Door implements AttributeAreaCalculable {
     /**
     * @var int
     */
    private int width;
    
    /**
     * @var int
     */
    private int height;
    
    public Door() {        
    }
    
    public Door(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return width * height;
    }
    
    @Override
    public String toString() {
        return "Door";
    }
}
