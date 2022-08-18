package poo;

public class SmartDevice {


    //atributos
   private Boolean wifi;
   private Boolean touchScreen;
   private Boolean bluetooth;

   //constructores


    public SmartDevice() {
    }

    public SmartDevice(Boolean wifi, Boolean touchScreen, Boolean bluetooth) {
        this.wifi = wifi;
        this.touchScreen = touchScreen;
        this.bluetooth = bluetooth;
    }


    //getter y setter

    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public Boolean getTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(Boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    //toString()

    @Override
    public String toString() {
        return "SmartDevice{" +
                "wifi=" + wifi +
                ", touchScreen=" + touchScreen +
                ", bluetooth=" + bluetooth +
                '}';
    }
}
