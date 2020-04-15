package zadanie1.logic;

import zadanie1.data.IsTriangleRight;
import zadanie1.data.Triangle;

public class Test {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle();
                triangle1.setSideA(4.0);
                triangle1.setSideB(5.0);
                triangle1.setSideC(8.0);
        System.out.print("Czy trójkąt o bokach A= " + triangle1.getSideA() + " B= " + triangle1.getSideB()
                + " C= " + triangle1.getSideC() + " jest prostokątny: ");

        IsTriangleRight check1 = new IsTriangleRight();
        System.out.println(check1.checkIsTriangleRight(triangle1));

    }
}
