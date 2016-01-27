package lyndachallenge.challengeone.oopstyle;

/**
 *
 * @author carlos belisario <carlos.belisario.gonzalez@gmail.com>
 */
public class Window implements AttributeAreaCalculable {
    /**
     * @var int
     */
    private int width;
    
    /**
     * @var int
     */
    private int height;
    
    public Window() {        
    }
    
    /**
     * 
     * @param width
     * @param height 
     */
    public Window(int width, int height) {
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
    public void setHeight(int heigth) {
        this.height = heigth;
    }    

    @Override
    public int calculateArea() {
        return width * height;
    }
    
    @Override
    public String toString() {
        return "Window";
    }
    
}
