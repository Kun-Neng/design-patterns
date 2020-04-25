package src.facade;

public class Electronics {
    private boolean power = false;
    
    public void powerOn() {
        this.power = true;
    }

    public void powerOff() {
        this.power = false;
    }

    public boolean isPowerOn() {
        return this.power;
    }

    protected void showStatus() {
        if (this.power) {
            System.out.println(this.getClass().getSimpleName() + " power is on.");
        } else {
            System.out.println(this.getClass().getSimpleName() + " power is off.");
        }
    }
}
