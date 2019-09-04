/**
 * @author justi
 * @version 9/4/2019
 */
package occ.cs272.ic01a;
import java.util.Random;

public class RandomArray {

    public static final int NUM = 100;
    public static final int BOTTOM = 25;
    public static final int RANGE = 50;
    public static final int NUMS_PER_ROW = 15;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        double[] a = new double[NUM];
        Random rand = new Random();
        for (int i = 0; i < NUM; ++i)
            a[i] = BOTTOM + rand.nextInt(RANGE);
        for (int i = 0; i < NUM; ++i)
        {
            if (i % NUMS_PER_ROW == 0) // first "fence post"
                System.out.print(a[i]);
            else
                System.out.print(" " + a[i]);
            if ((i + 1) % NUMS_PER_ROW == 0)
                System.out.println();
        }
    }

}
