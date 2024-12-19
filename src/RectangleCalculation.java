import java.util.Scanner;

public class RectangleCalculation {

        double width, length, area;

        Scanner sc = new Scanner(System.in);

        public void DataCollection() {
            System.out.print("Enter width: ");
            width = sc.nextDouble();
            System.out.print("Enter length: ");
            length = sc.nextDouble();
        }

        public void AreaCalculating() {
            area = width * length;
        }

        public void ShowArea() {
            System.out.println("Area: " + area);
        }

}
