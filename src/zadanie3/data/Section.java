package zadanie3.data;

import static java.lang.Math.*;

public class Section {
    private Point start;
    private Point end;

    public Section (){

    }

    public Point getStart() {
        return start;

    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double sectionLength(){
        double x1 = start.getX();
        double x2 = end.getX();
        double y1 = start.getY();
        double y2 = end.getY();

        return  sqrt (pow((x2-x1), 2.0)+pow((y2-y1), 2.0));
    }
}

