/**Suppose that the items’ prices are given in a sequence. For example:  represents the prices for items on each rack, i.e. item[0] on rack 0 has a price equal to 5, item[1] on rack 1 has a price equal to 2, etc…

Given these prices, suppose that Ahmad’s budget is 10 Riyals, he can afford the items that have the following prices:

Scenario 1: Items with prices = {1, 9}
Scenario 2: Items with prices = {2, 3, 5}
Scenario 3: Items with prices = {2, 8}
.
.
Scenario n.
You are asked to write a program that would print all possible combinations of prices that he could afford. Your program will print the combination of prices that has a summation equal to the provided budget. The combination are ordered from lowest to highest price on each output line.

Input Format

The first line is a sequence of integer numbers separated by spaces which represents the prices of items in the store. It ends with a new line.

The second line is the budget that Ahmad can afford. It is an integer value.

Constraints

The input numbers can only be integers. If the program could not find a combination within the constraints, it would print 0.
The output will be a line for each combination of prices. The total summation of the prices (per line) in the combination should equal to the budget provided in the input.

The order of printing the prices in each line should follow lowest to highest value. */


import java.util.*;

public class Candies 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] prices = new int[input.length];
        
        try
        {
            for (int i = 0; i < input.length; i++) 
            {
                prices[i] = Integer.parseInt(input[i]);
            }
        } 
        catch (Exception e) 
        {
            System.out.println('0');
            System.exit(0);
        }

        int budget = sc.nextInt();
        int[] combination = new int[prices.length];

        int sum = 0;
        int count = 0;
        for (int i = 0; i < prices.length; i++) 
        {
            sum = 0;
            for (int j = i; j < prices.length; j++) 
            {
                sum += prices[j];
                if (sum == budget) 
                {
                    for (int k = i; k <= j; k++) 
                    {
                        System.out.print(prices[k] + " ");
                    }
                    System.out.println();
                    count++;
                }
            }
        }
        if (count == 0) 
        {
            System.out.println(0);
        }
    }
}
