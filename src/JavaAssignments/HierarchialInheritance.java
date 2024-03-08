package JavaAssignments;


class Animal2 {
    void eat() {
        System.out.println("Animal is eating...");
    }
}


class Dog2 extends Animal2 {
    void bark() {
        System.out.println("Dog is barking...");
    }
}


class Cat extends Animal2 {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}


public class HierarchialInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}

