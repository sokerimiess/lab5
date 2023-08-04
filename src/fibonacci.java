import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        scanner.close();

        int nthFibonacci = fibonacci(n);
        System.out.println(nthFibonacci);
    }
    public static int fibonacci(int n)
    {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}