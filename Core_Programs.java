package Day5.Practice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
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
            if (N2 % i == 0) {
                N2 /= i;
                System.out.println("prime factors of N is : \n" + i);
            }
            if (N2 > 1)
                System.out.println(N2 + "\n................................");
        }
//      Quotient Reminder code
        System.out.println("this is Quotient Reminder code\n............................ ");
        System.out.println("enter a Dividend");
        int Dividend = sc.nextInt();
        System.out.println("enter a Divisor");
        int Divisor = sc.nextInt();
        float quo = Dividend / Divisor;
        float rem = Dividend % Divisor;
        System.out.println("quotient is : " + quo);
        System.out.println("reminder is : " + rem + "\n............................................");

//      Swap numbers
        System.out.println("this is Swap two numbers code \n.................................");
        System.out.println("enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("enter 2nd number");
        int num2 = sc.nextInt();
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("after swapping value of 1st number : " + num1);
        System.out.println("after swapping value of 2nd number : " + num2 + "\n............................");

//        Even odd
        System.out.println("this is Even odd code \n..................................");
        System.out.println("enter the number");
        int n = sc.nextInt();
        if (n % 2 == 0) System.out.println("even number");
        else System.out.println("odd number");
        System.out.println(".......................................");

//        Vowel_constant
        System.out.println("this is Vowel constant code \n...................................");
        System.out.println("enter a character : ");
        char Ch = sc.next().charAt(0);
        if (Ch == 'a' || Ch == 'e' || Ch == 'i' || Ch == 'o' || Ch == 'u' || Ch == 'A' || Ch == 'E' || Ch == 'I' || Ch == 'O' || Ch == 'U') {
            System.out.println("Given alphabet is a vowel");
        } else {
            System.out.println("Given alphabet is a consonant");
        }
        System.out.println("........................................");

//        Largest number
        System.out.println("this is largest number code \n......................................");
        System.out.println("enter 1st 2nd and 3rd number respectively : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if (n1 > n2 && n2 > n3) {
            System.out.println(n1 + " is greatest of all");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is greatest of all");
        } else System.out.println(n3 + " is greatest of all");
        System.out.println("................................................");

//        Distance
        System.out.println("this is distance code\n.....................................");
        System.out.println("enter the value of x : ");
        int point_x = sc.nextInt();
        System.out.println("enter the value of y : ");
        int point_y = sc.nextInt();
        int distance = (int) Math.sqrt((Math.pow(point_x, 2) + Math.pow(point_y, 2)));
        System.out.println("the Euclidean distance is : " + distance + "\n........................................");

//        Quadratic equation
        System.out.println("this is Quadratic equation \n......................................");
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();
        System.out.println("Enter the value of c :");
        int c = sc.nextInt();

        double delta = b * b - 4 * a * c;
        System.out.println(delta);
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        System.out.println("Value of Root 1 of x :" + root1);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Value of Root 2 of x :" + root2);
        System.out.println(".....................................................");

//        Windchill code
        System.out.println("this is windchill code\n.............................................");
        System.out.println("enter temperature and speed respectively : ");
        double t = sc.nextDouble();
        double v = sc.nextDouble();
        if (t > 50 || v > 120 || v < 3)
            System.out.println("please give valid input : ");
        else {
            int w = (int) (35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * Math.pow(v, 0.16));
            System.out.println("The National Weather Service defines the effective temperature (the wind chill) to be : " + w + " Degree");
        }
        System.out.println("............................................");
//        2D Array with printwriter
        System.out.println("this is 2D Array code\n............................");

        System.out.println("Enter number of rows :");
        int m = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int o = sc.nextInt();
        System.out.println("Rows : " + m + " columns : " + o);

        setArray(m, o);

    }
            public static void setArray(int row, int col) {
                int[][] twoDArr = new int[row][col];
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.println("enter values of " + i + " " + j + " : ");
                        twoDArr[i][j] = sc.nextInt();
                    }
                }
                printArray(twoDArr, row, col);
            }

            public static void printArray(int[][] twoDarr, int row, int col) {
                PrintWriter writer = new PrintWriter(System.out);
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        writer.write(" " + twoDarr[i][j] + "\t");
                        writer.flush();
                    }
                    writer.write("\n");
                    writer.flush();
                }
            }
        }

