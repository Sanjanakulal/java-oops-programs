interface A {
    void showA();
}

interface B {
    void showB();
}

class MyClass implements A, B {
    public void showA() {
        System.out.println("A method called");
    }

    public void showB() {
        System.out.println("B method called");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showA();
        obj.showB();
    }
}
