package ss06_inheritance.point_and_moveablepoint;

public class Main {
    public static void main(String[] args) {
        Point p1 = new MoveablePoint(1, 3, 5, 2);
        Point p2 = new MoveablePoint(-4, 2, 1, 1);
        System.out.println("p1 -> " + p1.toString());
        System.out.println("p2 -> " + p2.toString());
        ((MoveablePoint) p1).move();
        ((MoveablePoint) p2).move();
        System.out.println("p1 -> " + p1.toString());
        System.out.println("p2 -> " + p2.toString());
    }
}
