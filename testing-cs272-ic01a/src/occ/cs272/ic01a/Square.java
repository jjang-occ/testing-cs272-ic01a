package occ.cs272.ic01a;

public class Square {
    private double side;

    /**
     * @param side
     */
    public Square(double side) {
        super();
        this.side = side;
    }

    /**
     * @return the side
     */
    public double getSide() {
        return side;
    }

    /**
     * @param side the side to set
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     * @return area
     */
    public double getArea() {
        return side * side;
    }
    
    /**
     * @param a area
     */
    public void setArea(double a) {
        side = Math.sqrt(a);
    }
    
    @Override
    public String toString() {
        return "Square [side=" + side + "]";
    }
    
}
