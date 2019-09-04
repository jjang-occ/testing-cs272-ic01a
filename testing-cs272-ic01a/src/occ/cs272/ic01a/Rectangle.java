package occ.cs272.ic01a;

public class Rectangle {
    private double width;
    private double height;
    /**
     * @param width
     * @param height
     */
    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }
    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }
    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }
    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }
    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    /**
     * @return area
     */
    public double getArea() {
        return width * height;
    }
    
    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }
    

}
