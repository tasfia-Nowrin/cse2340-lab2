import java.util.Scanner;
public class Sum1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int sum = n * (n + 1) / 2; 
        System.out.println("Sum 1 to " + n + " = " + sum);
        sc.close();
    }
}