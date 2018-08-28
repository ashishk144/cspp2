import java.util.Scanner;
class Areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println("Area: " + area(radius));
    }
    public static double area(double radius) {
        double area = pi()*radius*radius;
        return area;
    }
    public static double pi() {
        return 22.0/7.0;
    }
}