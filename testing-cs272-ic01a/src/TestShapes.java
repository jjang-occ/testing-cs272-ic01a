/**
 * 
 * @author justi
 * @version 9/4/2019
 */
import occ.cs272.ic01a.*;

public class TestShapes {
    public static final double MAX_CIRCLE_RADIUS = 50;

    public static void main(String[] args) {
        Circle c1 = new Circle(1.5);
        Circle c2 = new Circle(5.0);
        int numCircles = 100;
        Circle[] circles = new Circle[numCircles];
        for (int i = 0; i < numCircles; ++i)
            circles[i] = new Circle(Math.random() * MAX_CIRCLE_RADIUS);
        
        double areaSum = 0.0;
        double largest = 0.0;
        double smallest = MAX_CIRCLE_RADIUS;
        for (int i = 0; i < numCircles; ++i)
        {
            areaSum += circles[i].getArea();
            double r = circles[i].getRadius();
            if (r > largest)
                largest = r;
            else if (r < smallest)
                smallest = r;
        }
        System.out.println("Sum of all " + numCircles + " circle areas: " + areaSum);
        System.out.println("Smallest radius = " + smallest);
        System.out.println("Largest radius = " + largest);
        
        

    }

}
