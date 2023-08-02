import java.util.Scanner;
public class Task11 {
    public static void main() {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter first number: ");
        String first = x.nextLine();
        System.out.println("Enter second number: ");
        String second = x.nextLine();
        int sum = Integer.parseInt(first) * Integer.parseInt(second);
        System.out.println(sum);
    }
}
