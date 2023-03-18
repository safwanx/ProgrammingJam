/**You will write a program to help navigate my autonomous car through roundabouts. 
 * A roundabout is a type of circular intersection or junction in which road traffic is permitted to flow in one direction around a central island, and priority is typically given to traffic already in the junction. 
 * Cars usually enter the roundabout from an exit points and moves aways using another exit point. 
 * There can be various exit-points in a round about.

Your program reads input from console, processes the information and prints the coordinates for the exit. 
For the sake of simplicity, we assume that my autonomous car will always take the first exit from the point of entry. 
Assume standard traffic direction for Saudi Arabia.

Input Format:

The first line has the  coordinates of the roundabout and an integer  representing the number of exits in the roundabout.
The second line as  coordinates for the point of entry in the roundabout.

Output Format
The coordinates of the exit destination corresponding to the first exit of the roundabout. For any invalid input, the program prints -1. */

import java.util.*;
public class AutonomousCar 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] roundabout = new int[input.length];
        try
        {
            for (int i = 0; i < input.length; i++) 
            {
                roundabout[i] = Integer.parseInt(input[i]);
            }
        } 
        catch (Exception e) 
        {
            System.out.println("-1");
            System.exit(0);
        }
        int[] entry = new int[3];
        input = sc.nextLine().split(" ");
        try
        {
            for (int i = 0; i < input.length; i++) 
            {
                entry[i] = Integer.parseInt(input[i]);
            }
        } 
        catch (Exception e) 
        {
            System.out.println("-1");
            System.exit(0);
        }
        int exit = sc.nextInt();
        int[] exitPoint = new int[2];
        if (entry[0] == roundabout[0] && entry[1] == roundabout[1]) 
        {
            exitPoint[0] = roundabout[0];
            exitPoint[1] = roundabout[1] + exit;
        }
        else if (entry[0] == roundabout[0] && entry[1] == roundabout[3]) 
        {
            exitPoint[0] = roundabout[0];
            exitPoint[1] = roundabout[3] - exit;
        }
        else if (entry[0] == roundabout[2] && entry[1] == roundabout[1]) 
        {
            exitPoint[0] = roundabout[2];
            exitPoint[1] = roundabout[1] + exit;
        }
        else if (entry[0] == roundabout[2] && entry[1] == roundabout[3]) 
        {
            exitPoint[0] = roundabout[2];
            exitPoint[1] = roundabout[3] - exit;
        }
        else if (entry[0] == roundabout[0] && entry[1] > roundabout[1] && entry[1] < roundabout[3]) 
        {
            exitPoint[0] = roundabout[0] + exit;
            exitPoint[1] = entry[1];
        }

        sc.close();
    }
}
