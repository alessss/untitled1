public class Task16 {
    interface Shape{
        public static void getArea() {
        }
    }

    static class Rectangle implements Shape {
        public void getArea(){
            System.out.println("Area = x * y");
        }
    }

    static class Circle implements Shape {
        public void getArea(){
            System.out.println("pi*rˆ2");
        }
    }

    static class Triangle implements Shape {
        public void getArea(){
            System.out.println("(a · h)/2");
        }
    }
}
