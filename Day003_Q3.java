public class Day003_Q3 {
    public static void main(String[] args) {
        Animal_D3Q3 a;
        a = new Dog_D3Q3();
        a.shout();
        a = new Horse_D3Q3();
        a.shout();
        a = new Cat_D3Q3();
        a.shout();
    }
}

class Animal_D3Q3 {
    void shout() {
        
    }
}

class Dog_D3Q3 extends Animal_D3Q3 {
    void shout() {
        System.out.println("I can bark.");
    }
}

class Horse_D3Q3 extends Animal_D3Q3 {
    void shout() {
        System.out.println("I can neigh.");
    }
}

class Cat_D3Q3 extends Animal_D3Q3 {
    void shout() {
        System.out.println("I can meow.");
    }
}