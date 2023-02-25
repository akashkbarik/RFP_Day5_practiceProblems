package Day5.Practice;

import java.util.Scanner;

public class Core_Programs {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //Flip coin code
        System.out.println("enter no of times the random number will execute : ");
        int number = sc.nextInt();
        float head_count = 0;
        float tail_count = 0;
        for (int index = 0; index < number; index++) {
            double result = Math.random();
            if (result < 0.5) tail_count++;
            else head_count++;
        }
        System.out.println("head count is : " + head_count + "\n tail count is : " + tail_count);
        float headCountPercentage = (head_count * 100) / number;
        float tailCountPercentage = (tail_count * 100) / number;

        System.out.println("percentage of head is : " + headCountPercentage + "+\npercentage of tail is : " + tailCountPercentage + "\n...........................................................");

//        Leap year code
        System.out.println("This is Leap year code\n................................");
        System.out.println("enter year you want to check : ");
        int year = sc.nextInt();
        if ((year % 4 == 0 ))
            System.out.println(year+" is a leap year");
        else System.out.println(year+" is not a leap year");
        System.out.println("....................................");
    }
}