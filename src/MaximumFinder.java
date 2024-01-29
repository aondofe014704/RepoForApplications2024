
import java.util.Scanner;
public class MaximumFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three floating - point values separated by spaces:");
        double number1 = scanner.nextDouble();

        double number2 = scanner.nextDouble();

        double number3 = scanner.nextDouble();

        double result = maximum(number1, number2, number3);

        System.out.println("Maximum is: " + result);

    }
    public static double maximum(double x, double y, double z){

        double maximumValue = 0;

        if(y > x && y > z){
            maximumValue = y;
        }
        if(z > y && z > x){
            maximumValue = z;
        }
        if(x > y && x > z){
            maximumValue = x;
        }

    return maximumValue;
    }
}
