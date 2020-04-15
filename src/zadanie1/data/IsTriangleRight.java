package zadanie1.data;

public class IsTriangleRight {

    public boolean checkIsTriangleRight (Triangle triangle){
        double sideA = triangle.getSideA() * triangle.getSideA();
        double sideB = triangle.getSideB() * triangle.getSideB();
        double sideC = triangle.getSideC() * triangle.getSideC();

        if ((sideA == sideB + sideC) ||  (sideB == sideA + sideC) || (sideC == sideB + sideA)){
            return true;
        }
//        else if (sideB == sideA + sideC){
//            return true;
//        }
//        else if (sideC == sideB + sideA){
//            return true;
//        }
        else return false;

        }
}

