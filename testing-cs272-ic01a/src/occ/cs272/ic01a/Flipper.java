/**
 * Experimenting with a from-scratch project:
 * 1) Create a blank project in Eclipse. Add a class w main method.
 * 2) Create a blank repo in GitHub with no README file or anything, i.e. completely blank. Copy it's URI link.
 * 3) In Eclipse, Clone a Git Repository and add the clone to this view (Use the Git perspective.)
 * 4) Right click on the Eclipse project in the Package Explorer or Navigator --> Team --> Share P

How to link your local Eclipse project with a GitHub repository.  
1. Go to github create new repository (make sure it is completely blank with no README).
2. Copy http URL from github
3. Go to Eclipse --> Right click on project --> Team--> Share Project--> Create new Git Repo. (Choose a local folder where you keep all your git repos locally.)
4. Go to Git Staging--> add to index --> commit and push
5. Right click on Git Repositories push to up stream
6. It will ask you for Remote. Paste your http URL of github which you copy in step 2
7. Enter username and password of github -- > Finish

 * @author justi
 * @version 9/4/2019
 */
package occ.cs272.ic01a;
import java.util.Scanner;

public class Flipper {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many times to flip? ");
        int n = input.nextInt();
        String word;
        for (int i = 0; i < n; ++i)
        {
            if (Math.random() < 0.5)
                word = "heads";
            else
                word = "tails";
            System.out.printf("%-7s", word);
            if (i % 10 == 9) System.out.println();
        }
        System.out.println();
        
        input.close();
    }

}
