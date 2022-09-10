import java.util.Scanner;

public class Sum {
    public static void main(String args[]) {
        int a, b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the numbers:");
            a = sc.nextInt();
            b = sc.nextInt();
        }
        int c = (a + b);
        System.out.println("the sum is " + c);

    }

}
