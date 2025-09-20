import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();
        if (n < 0) { System.out.println("Invalid input"); sc.close(); return; }
        long fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        System.out.println(n + "! = " + fact);
        sc.close();
    }
}