import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;

    void setDim (double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    double getArea (){
        return length * breadth;
    }
}


public class Area {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of rectangles: ");
        double length = scanner.nextDouble();
        System.out.println("Enter breadth of rectangles: ");
        double breadth = scanner.nextDouble();

        rectangle.setDim(length, breadth);

        double area = rectangle.getArea();
        System.out.println("Area of the rectangle: " + area);
    }
}