import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (+, -, *, /): ");
        char op = sc.next().charAt(0);
        double res;
        switch (op) {
            case '+': res = a + b; break;
            case '-': res = a - b; break;
            case '*': res = a * b; break;
            case '/':
                if (b == 0) { System.out.println("Error: divide by zero"); sc.close(); return; }
                res = a / b; break;
            default: System.out.println("Invalid operation"); sc.close(); return;
        }
        System.out.println("Result: " + res);
        sc.close();
    }
}