package src.builder;

public class Power {
    private String mainPower;
    private String subPower;
    private String battery;

    public Power(String mainPower, String subPower, String battery) {
        this.mainPower = mainPower;
        this.subPower = subPower;
        this.battery = battery;
    }

    public String toString() {
        return "{ mainPower: " + this.mainPower + ", subPower: " + this.subPower + ", battery: " + this.battery + "}";
    }
}
