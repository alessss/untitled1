import java.util.Scanner;

public class Task13 {
    public static void main() {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter number: ");
        String entered = x.nextLine();
        for (Integer y = 1; y < 11; y++) {
            Integer mult = Integer.parseInt(entered) * y;
            System.out.println(y+ " * " + entered + " = " + mult);

        }

    }
}
