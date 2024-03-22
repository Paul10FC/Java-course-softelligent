package GeometryProgram;

import GeometryProgram.Entities.Rectangle;
import GeometryProgram.Entities.Square;
import GeometryProgram.Entities.Triangle;

import java.util.Scanner;

public class Geometry {
    // GeometryProgram.Entities.Triangle GeometryProgram.Entities.Square GeometryProgram.Entities.Rectangle
    public static void areaCalculator(){
        System.out.println("Please select one figure");
        System.out.println("1.-Triangle\t 2.-Square\t 3.-Rectangle");
        Scanner sc = new Scanner(System.in);
        int figureSelected = sc.nextInt();

        switch (figureSelected){
            case 1:
                triangleAreaCalculator();
                break;
            case 2:
                squareAreaCalculator();
                break;
            case 3:
                rectangleAreaCalculator();
                break;
        }
        sc.close();
    }

    public static void triangleAreaCalculator(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Write the base");
        int base = sc.nextInt();

        System.out.println("Write the height");
        int height = sc.nextInt();

        Triangle triangle = new Triangle(base, height);
        triangle.calculateArea();
    }

    public static void squareAreaCalculator(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Write the side");
        int side = sc.nextInt();

        Square square = new Square(side);
        square.calculateArea();
    }

    public static void rectangleAreaCalculator(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Write the side");
        int side = sc.nextInt();

        System.out.println("Write the height");
        int height = sc.nextInt();

        Rectangle rectangle = new Rectangle(side, height);
        rectangle.calculateArea();
    }
}
