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
        if ((year % 4 == 0))
            System.out.println(year + " is a leap year");
        else System.out.println(year + " is not a leap year");
        System.out.println("....................................");

//        Power_of_two code
        System.out.println("This is power of 2 code\n................................");
        System.out.println("enter the power of two : ");
        int N = sc.nextInt();

        if (N < 0 || N > 31) {
            System.out.println("please enter no between 0 and 31");
        } else {
            for (int i = 0; i <= N; i++) {
                System.out.println(i + " power of 2 is : " + Math.pow(2, i) + "\n..................................");
            }
        }
//      harmonic number code
        System.out.println("this is harmonic program code\n............................");
        System.out.println("enter the value of N : ");
        int N1 = sc.nextInt();
        float Harmonic_num = 0;
        if (N1 <= 0)
            System.out.println("N value cannot be 0.");
        else {
            for (float i = 1; i <= N1; i++) {
                Harmonic_num += (1 / i);
            }
            System.out.println("Nth harmonic value of (1/" + N1 + ") is : " + Harmonic_num + "\n.........................................");
        }
//      Factors code
        System.out.println("this is Factors code\n..............................");
        System.out.println("enter a number : ");
        int N2 = sc.nextInt();
        for (int i = 2; i * i <= N2; i++) {
            if (N2 % i == 0){
                N2/=i;
                System.out.println("prime factors of N is : \n"+i);
            }
            if(N2>1)
                System.out.println(N2);
        }
    }
}