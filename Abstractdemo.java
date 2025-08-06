abstract class Shape {
    abstract void draw();

    void info() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Abstractdemo {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        s.info();
    }
}
