import java.util.Scanner;

public class FibonacciRekursif {

    static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah deret Fibonacci: ");
        int jumlah = input.nextInt();

        System.out.print("Deret Fibonacci: ");
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            int fib = fibonacci(i);
            System.out.print(fib);
            if (i < jumlah - 1) System.out.print(" + ");
            total += fib;
        }

        System.out.println(" = " + total);

        input.close();
    }
}