package zadanie3.data;

public class Point {
    private Double x;
    private Double y;

    public Point() {

    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public boolean firstQuarter() {
        if (x > 0.0 && y > 0.0) {
            return true;
        } else return false;
    }

    public boolean secondQuarter() {
        if (x < 0.0 && y > 0.0) {
            return true;
        } else return false;
    }

    public boolean thirdQuarter() {
        if (x < 0.0 && y < 0.0) {
            return true;
        } else return false;
    }

    public boolean fourthQuarter() {
        if (x > 0.0 && y < 0.0) {
            return true;
        } else return false;

    }

    public boolean axisX() {
        if (x != 0.0 && y == 0.0) {
            return true;
        } else return false;
    }

    public boolean axisY() {
        if (y != 0.0 && x == 0.0) {
            return true;
        } else return false;
    }

    public boolean center() {
        if (axisX() && axisY()) {
            return true;
        } else return false;
    }

    public void finalCheck() {
        if (firstQuarter()) {
            System.out.println("Punkt (" + getX() + ", " + getY() + ") leży w I ćwiartce.");
        } else if (secondQuarter()) {
            System.out.println("Punkt (" + getX() + ", " + getY() + ") leży w II ćwiartce.");
        } else if (thirdQuarter()) {
            System.out.println("Punkt (" + getX() + ", " + getY() + ") leży w III ćwiartce.");
        } else if (fourthQuarter()) {
            System.out.println("Punkt (" + getX() + ", " + getY() + ") leży w IV ćwiartce.");
        } else if (axisY()) {
            System.out.println("Punkt (" + getX() + ", " + getY() + ") leży na osi Y.");
        } else if (axisX()) {
            System.out.println("Punkt (" + getX() + ", " + getY() + ") leży na osi X.");
        } else
            System.out.println("Punkt (" + getX() + ", " + getY() + ") leży w środku układu współrzędnych.");
    }
}