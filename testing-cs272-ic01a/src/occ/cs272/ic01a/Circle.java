package occ.cs272.ic01a;

public class Circle {

    private double radius;
    public Circle() { radius = 0.0; }
    public Circle(double r) { radius = r; }
    public void setRadius(double r) { radius = r; }
    public double getRadius() { return radius; }
    
    /**
     * @return area of circle
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    /**
     * @param a area
     */
    public void setArea(double a) {
        radius = Math.sqrt(a / Math.PI);
    }
    
    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
    

}
