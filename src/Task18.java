public class Task18 {
    interface Animal{
        public static void makeSound() {
        }
    }

    static class Dog implements Animal {
        public void makeSound(){
            System.out.println("Bark!");
        }
    }

    static class Cat implements Animal {
        public void makeSound(){
            System.out.println("Meow");
        }
    }

    static class Bird implements Animal {
        public void makeSound(){
            System.out.println("Chirik");
        }
    }
}
