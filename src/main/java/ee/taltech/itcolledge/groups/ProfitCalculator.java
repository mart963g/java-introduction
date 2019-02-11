package ee.taltech.itcolledge.groups;

import java.util.Scanner;

public class ProfitCalculator {

    public static void main(String[] args) {
        // todo using example in group divisor create a program to calculate return on investment (ROI)
        Scanner input = new Scanner(System.in);
        System.out.println("Insert the initial investment");
        int investment = input.nextInt();
        System.out.println("Insert the expected return a year %");
        int percentage = input.nextInt();

        System.out.println(String.format("You get %.2f money back, out of which %.2f. is pure profit",
                (investment*(1+ ((double)percentage/100))), (investment*((double)percentage/100))));
    }
}
