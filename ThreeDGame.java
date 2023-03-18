import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ThreeDGame 
{

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sn = new Scanner(System.in);
        int ans = 0;
        try
        {
            int n = sn.nextInt();
            if (n < 1 || n > 100000)
            {
                System.out.print(0);
            }
            int[] bids = new int[n];
       
            for(int i = 0 ; i < n; i++)
            {
                int v = sn.nextInt();
                bids[i] = v;
            }
       
            Arrays.sort(bids);
            for(int i = 0; i < n; i++)
            {
                int sum = bids[i] * (n-i);
                // System.out.println(bids[i]);
                // System.out.println("n is" + (n - i));
                // System.out.println(sum);
                if(sum > ans)
                {
                    ans = sum;
                }
            }

          System.out.println(ans);
        } 
        catch(Exception e)
        {
            System.out.print(0);
        }
        
    }
}