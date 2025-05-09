package Struct.Brige;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
        // TODO Auto-generated constructor stub
    }

    @Override
    void draw() {
        System.out.println("正在画一个" + this.color.fill() + "的圆");
    }

}
