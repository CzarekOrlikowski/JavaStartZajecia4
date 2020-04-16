package zadanie2.data;

public class Room {
    private double area;
    private double temperature;
    private boolean isAirCondition;

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
        if (this.temperature > minTemperature && this.isAirCondition){
            --this.temperature;
            return true;
        }
        else {
            return false;
        }
    }

}
