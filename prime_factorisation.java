
/*1. You are required to display the prime factorization of a number.
2. Take as input a number n.
3. Print all its prime factors from smallest to largest.

Input Format:
n, an integer

Output Format:
p1  p2  p3  p4.. all prime factors of n */
import java.util.Scanner;

public class prime_factorisation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // for (int div = 2; div < n; div++) {
        // while (n%div==0) {
        // System.out.print(div+" ");
        // n=n/div;

        // ************optimised solution************
        for (int div = 2; div <= n; div++)
    {
      while (n % div == 0)
      {
        System.out.print(div + " ");
        n = n / div;
      }
    }
    if (n != 1)
    {
      System.out.print(n);
    }

    }

}
