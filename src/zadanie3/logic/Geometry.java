package zadanie3.logic;

import zadanie3.data.Length;
import zadanie3.data.Point;
import zadanie3.data.Section;

public class Geometry {
    public static void main(String[] args) {

        Point point1 = new Point();
        point1.setX(0.0);
        point1.setY(0.0);

        Point point2 = new Point();
        point2.setX(5.0);
        point2.setY(0.0);

        Point point3 = new Point();
        point3.setX(0.0);
        point3.setY(5.0);

        System.out.println("Dane są trzy punkty: (" + point1.getX() + ", " + point1.getY() + ") , ("
                        + point2.getX() + ", " + point2.getY() + ") , (" +
                        point3.getX() + ", " + point3.getY() + ")");

        point2.finalCheck();

        Section section1 = new Section();
        section1.setStart(point1);
        section1.setEnd(point2);

        System.out.print("Długość odcinka pomiędzy punktem (" + section1.getStart().getX() + ", " + section1.getStart().getY() +
                ") i punktem (" + section1.getEnd().getX() + ", " + section1.getEnd().getY() + ") to "
                + section1.sectionLength());

        Length length1 = new Length();
        length1.sectionLength(section1);
        System.out.println(" (dodatkowe sprwadzenie długości: " + length1.sectionLength(section1) + ")");

        length1.isTriangle(point1, point2, point3);
        System.out.println("Czy podane 3 punkty tworzą trójkąt: " + length1.isTriangle(point1, point2, point3));

    }
}