/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lyndachallenge.challengeone.oopstyle;

/**
 *
 * @author carlos
 */
public interface AttributeAreaCalculable extends AreaCalculable {
    /**
     * 
     * @param width 
     */
    public void setWidth(int width);    
    
    /**
     * 
     * @return int
     */
    public int getWidth();
    
    /**
     * 
     * @param width 
     */
    public void setHeight(int height);    
    
    /**
     * 
     * @return int
     */
    public int getHeight();
}
