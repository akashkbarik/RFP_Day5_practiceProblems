package Day5.Practice;

import java.util.Scanner;

//            sum of three equals 0
public class sumOfThree {
    public static void main(String[] args) {
        sumOfThree();
    }

    public static void sumOfThree() {
        System.out.println("this is sum of three equals 0 code.\n.................................");
        int[] N = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        for (int i = 0; i < N.length; i++) {
            N[i] = sc.nextInt();
        }
        for (int x = 0; x < N.length; x++) {
            for (int y = 0; y < N.length; y++) {
                for (int z = 0; z < N.length; z++) {
                    if (N[x] + N[y] + N[z] == 0) {
                        System.out.println("numbers are : " + N[x] + " , " + N[y] + " , " + N[z]);
                    }

                }
            }
        }
    }


}

