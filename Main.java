package GradedAssignment3DataStructuresB01;

import java.util.Scanner;

public class Main {
    static int countWays(int N) {
        if (N == 1)
            return N;

        int countB=1, countS=1, prev_countB, prev_countS;

        for (int i=2; i<N; i++){
            prev_countB = countB;
            prev_countS = countS;
            countS = prev_countB + prev_countS;
            countB = prev_countS;
        }
        int result = countS + countB;
        return (result*result);
    }
    public static void main(String[] args) {
        System.out.print("Enter the total no of floors in the building");
        Scanner sc =new Scanner(System.in);
        int N;
        N= sc.nextInt();

        System.out.println("The order of the construction is follow" + " "+ N+" "+ countWays(N));
    }
}
