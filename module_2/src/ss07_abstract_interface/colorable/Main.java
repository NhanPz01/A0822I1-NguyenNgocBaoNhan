package ss07_abstract_interface.colorable;

import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        ((Circle) shape1).howToColor();
        ((Rectangle) shape2).howToColor();
    }
}
