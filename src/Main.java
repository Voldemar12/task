import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int N = 0;
        while (N*N <= input) {
            System.out.println(N*N);
            N++;
        }
    }
}