package Day5.Practice;

import java.util.Scanner;

public class Flip_coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of times the random number will execute : ");
        int number = sc.nextInt();
        int head_count = 0;
        int tail_count = 0;
        for(int index=0; index<number;index++){
            double result=Math.random();
            if (result<0.5){
                tail_count++;
            }
            else {
                head_count++;
            }

        }
        System.out.println("head count is : "+head_count+"\n tail count is : "+tail_count);
        float headCountPercentage=(head_count*100)/number;
        float tailCountPercentage=(tail_count*100)/number;

        System.out.println("percentage of head is : "+headCountPercentage+"+\npercentage of tail is : "+tailCountPercentage);

    }
}