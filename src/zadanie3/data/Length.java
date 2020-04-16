package zadanie3.data;

import static java.lang.Math.*;

public class Length {

    public  double sectionLength (Section section){
            double x1 = section.getStart().getX();
            double x2 = section.getEnd().getX();
            double y1 = section.getStart().getY();
            double y2 = section.getEnd().getY();

        return  sqrt (pow((x2-x1), 2.0)+pow((y2-y1), 2.0));

        }

     public  boolean isTriangle (Point point1, Point point2, Point point3){
         double x1 = point1.getX();
         double x2 = point2.getX();
         double x3 = point3.getX();
         double y1 = point1.getY();
         double y2 = point2.getY();
         double y3 = point3.getY();

         double section1 = sqrt (pow((x1-x3), 2.0)+pow((y1-y3), 2.0));
         double section2 = sqrt (pow((x2-x3), 2.0)+pow((y2-y3), 2.0));
         double section3 = sqrt (pow((x1-x2), 2.0)+pow((y1-y2), 2.0));

         if (section1 < section2 + section3 && section2 < section1 + section3 && section3 < section1 + section2) {
             return true;
         } else
             return false;

     }

    }
