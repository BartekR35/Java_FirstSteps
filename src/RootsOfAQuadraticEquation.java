import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class RootsOfAQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie wartości a, b, c od użytkownika
        System.out.print("Enter value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter value of c: ");
        double c = scanner.nextDouble();

        // Check is this equation is quadric
        if (a == 0) {
            System.out.println("It is not a quadratic equation.");
            if (b != 0) {
                double x = -c / b;
                System.out.printf("linear equation, x = %.2f\n", x);
            } else {
                System.out.println("No solution.");
            }
        } else {
            // delta's counting
            double delta = b * b - 4 * a * c;

            // switch use based on delta value
            switch ((delta > 0) ? 1 : (delta == 0 ? 0 : -1)) {
                case 1: // Two different roots
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.printf("Two different roots: x1 = %.2f, x2 = %.2f\n", x1, x2);
                    break;
                case 0: // One double root
                    double x = -b / (2 * a);
                    System.out.printf("One double root: x = %.2f\n", x);
                    break;
                case -1: // No real roots
                    System.out.println("No real roots.");
                    break;
                default:
                    System.out.println("Enexpected error.");
            }
        }
    }
}
