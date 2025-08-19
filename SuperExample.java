class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    Dog() {
        super(); 
        System.out.println("Dog constructor called");
    }

    void sound() {
        super.sound();
        System.out.println("Dog barks");
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
