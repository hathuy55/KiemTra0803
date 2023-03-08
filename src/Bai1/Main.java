package Bai1;

public class Main {
    public static void main(String[] args) {
        Circle h1 = new Circle();
        Circle h2 = new Circle(3);

        System.out.println("Diện tích hình 1: "+ h1.getArea() +
                ", Chu vi hình 1: " + h1.getCircumference());

        System.out.println("Diện tích hình 2: "+ h2.getArea() +
                ", Chu vi hình 2: " + h2.getCircumference());
    }
}
