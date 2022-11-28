package ss07_abstract_interface.resizeable;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Circle(5.0, "Green", true);
        Shape shape3 = new Rectangle();
        Shape shape4 = new Rectangle(3.0, 4.0);
        System.out.println(((Circle)shape1).toString());
        System.out.println(((Circle)shape2).toString());
        System.out.println(((Rectangle) shape3).toString());
        System.out.println(((Rectangle) shape4).toString());
        ((Circle) shape1).resize(50);
        ((Circle) shape2).resize(30);
        System.out.println(((Circle)shape1).toString());
        System.out.println(((Circle)shape2).toString());
        ((Rectangle) shape3).resize(50);
        ((Rectangle) shape4).resize(30);
        System.out.println(((Rectangle) shape3).toString());
        System.out.println(((Rectangle) shape4).toString());
    }
}
