package JavaAssignments;


class Animal1 {
    void eat() {
        System.out.println("Animal is eating...");
    }
}


class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Dog is barking...");
    }
}


class Labrador extends Dog1 {
    void color() {
        System.out.println("Labrador is brown...");
    }
}


public class MultilevelInheritance {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.eat();
        labrador.bark();
        labrador.color();
    }
}

