package Struct.Brige;

public class Application {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new Red());
        redCircle.draw();
    }
}
