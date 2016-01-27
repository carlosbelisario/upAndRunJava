package lyndachallenge.challengeone.oopstyle;

/**
 *
 * @author carlos belisario <carlos.belisario.gonzalez@gmail.com>
 */
public interface AttributeAreaCalculable extends AreaCalculable {
    /**
     * set the width of the object
     * @param width 
     */
    public void setWidth(int width);    
    
    /**
     * get the with of the object
     * @return int
     */
    public int getWidth();
    
    /**
     * set the height of a object
     * @param height 
     */
    public void setHeight(int height);    
    
    /**
     * get the height ob a object
     * @return int
     */
    public int getHeight();
}
