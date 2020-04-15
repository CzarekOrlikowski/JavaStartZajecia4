package zadanie2.data;

public class Room {
    double area;
    double temperature;
    boolean isAirCondition;

    public Room (){

    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean getIsAirCondition() {
        return isAirCondition;
    }

    public void setAirCondition(boolean airCondition) {
        isAirCondition = airCondition;
    }

    public boolean setDownTemperature (double minTemperature){
        if (temperature > minTemperature && isAirCondition){
            --temperature;
            return true;
        }
        else {
            return false;
        }
    }

}
