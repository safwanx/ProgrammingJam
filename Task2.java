/**Years could be any value greater than or equal to zero.
Season would be any of the four seasons, Spring 0, Summer 1, Autumn 2 and Winter 3.
Days could be any value greater than zero.
Hours should be: 0 ≤ h < 24
Minutes should be: 0 ≤ m < 60
Seconds should be: 0 ≤ s < 60

You are asked to write a program that will read the sequence of numbers 
and convert it into a valid time representation.

The program reads a sequence of numbers (integer values) from the console.
The first number is the number of test cases.
Each test case is a sequence of 6 numbers separated by a space.
The first 5 numbers are the time components in the order: years, season, days, hours, minutes.
The last number is the number of seconds.
The output will be a line giving the correct time representation with six integer values seperated by spaces.
*/

import java.util.*;

public class Task2 
{
    public static void main(String[] args) 
    {
        int years = 0, season = 0, days = 0, hours = 0, minutes = 0, seconds = 0;
        Scanner input = new Scanner(System.in);
        int testCases = 6;
        int i = 0;
        int[] seasonDays = {194, 154, 142, 178};
        
        while (i < testCases && !(years < 0 || season < 0 || season > 3 || days < 0 || hours < 0 || hours > 24 || minutes < 0 || minutes > 60 || seconds < 0 || seconds > 60) ) 
        {
            years = input.nextInt();
            i++;
            season = input.nextInt();
            i++;
            days = input.nextInt();
            i++;
            hours = input.nextInt();
            i++;
            minutes = input.nextInt();
            i++;
            seconds = input.nextInt();
            i++;
        }

        int seconds1  = seconds % 60;
        int minutes1 = minutes + ((seconds - (seconds % 60)) / 60);
        int hours1 = hours % 24;
        int days0 = days + ((hours - (hours % 24)) / 24);
        

        if (days0 >= seasonDays[0])
        {
            days = days0 - 194;
        }
        else if (seasonDays[1] <= days0 || days0 <= seasonDays[3])
        {
            days = days0 - 154;
        }
        else if (days0 > seasonDays[2] || days0 <= seasonDays[1])
        {
            days = days0 - 142;
        }
        else if (days0 > seasonDays[3] || days0 <= seasonDays[0])
        {
            days = days0 - 178;
        }


        if (days0 > seasonDays[0])
        {
            season = 1;
        }
        else if (days0 >= seasonDays[1] || days0 <= seasonDays[0])
        {
            season = 0;
        }
        else if (seasonDays[1] < days0 || days0 <= seasonDays[3])
        {
            season = 2;
        }
        else if (days0 > seasonDays[2] || days0 <= seasonDays[1])
        {
            season = 3;
        }
        else if (days0 > seasonDays[3] || days0 <= seasonDays[0])
        {
            season = 0;
        }
        System.out.println(years + " " + season + " " + days + " " + hours1 + " " + minutes1 + " " + seconds1);
        input.close();
    }
}
