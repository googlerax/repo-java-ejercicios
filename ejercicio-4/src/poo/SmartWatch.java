package poo;

public class SmartWatch extends SmartDevice{

    //clase hija

    //atributos
    private String maker;
    private String model;

    private Boolean stepCounter;
    private Boolean heartRateSensor;
    private Integer battery;
    private String waterproof;


    //constructores
    public SmartWatch() {}

    public SmartWatch(Boolean wifi, Boolean touchScreen, Boolean bluetooth, String maker, String model, Boolean stepCounter, Boolean heartRateSensor, Integer battery, String waterproof) {
        super(wifi, touchScreen, bluetooth);
        this.maker = maker;
        this.model = model;
        this.stepCounter = stepCounter;
        this.heartRateSensor = heartRateSensor;
        this.battery = battery;
        this.waterproof = waterproof;
    }


    //getter y setter


    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getStepCounter() {
        return stepCounter;
    }

    public void setStepCounter(Boolean stepCounter) {
        this.stepCounter = stepCounter;
    }

    public Boolean getHeartRateSensor() {
        return heartRateSensor;
    }

    public void setHeartRateSensor(Boolean heartRateSensor) {
        this.heartRateSensor = heartRateSensor;
    }

    public Integer getBattery() {
        return battery;
    }

    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    public String getWaterproof() {
        return waterproof;
    }

    public void setWaterproof(String waterproof) {
        this.waterproof = waterproof;
    }

    //toString()


    @Override
    public String toString() {
        return "SmartWatch{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", stepCounter=" + stepCounter +
                ", heartRateSensor=" + heartRateSensor +
                ", battery=" + battery +
                ", waterproof='" + waterproof + '\'' +
                '}';
    }
}
