import java.util.Scanner;
final class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, i = 1;
        for(; i<=n; i++) {
            sum = sum + i;
        }
    System.out.println(sum);
    }
}