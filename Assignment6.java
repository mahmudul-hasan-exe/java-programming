import java.util.Scanner;

public class Assignment6 {
    public static void main(String []arge){

        Scanner input = new Scanner(System.in);

        double radius, area;

        System.out.print("Enter radiur: ");
        radius = input.nextDouble();

        area = 3.1416 * radius * radius;

        System.out.println("Area of Circle: "+area);
    }

    
}