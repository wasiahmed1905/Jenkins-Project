import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for radius input
        System.out.print("Enter the radius of the circle: ");
        double rad = scanner.nextDouble();

        // Perform calculations using standard Math formulas
        double area = Math.PI * Math.pow(rad, 2);
        double circumference = 2 * Math.PI * rad; // Circumference is the perimeter of a circle

        // Display results rounded to 2 decimal places
        System.out.printf("Radius: %.2f%n", rad);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Circumference (Perimeter): %.2f%n", circumference);

        scanner.close();
    }
}
