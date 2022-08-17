package poo;


// clase hija.
public class SmartPhone extends SmartDevice{

    private String maker;
    private String model;

    private Boolean calls;
    private Boolean NFC;
    private Boolean fingerprint;
    private Float megapixels;

    private Integer battery;

    public SmartPhone() {}

    public SmartPhone(Boolean wifi, Boolean touchScreen, Boolean bluetooth, String maker, String model, Boolean calls, Boolean NFC, Boolean fingerprint, Float megapixels,Integer battery) {
        super(wifi, touchScreen, bluetooth);
        this.maker = maker;
        this.model = model;
        this.calls = calls;
        this.NFC = NFC;
        this.fingerprint = fingerprint;
        this.megapixels = megapixels;
        this.battery = battery;
    }


    //getter y setter.


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

    public Boolean getCalls() {
        return calls;
    }

    public void setCalls(Boolean calls) {
        this.calls = calls;
    }

    public Boolean getNFC() {
        return NFC;
    }

    public void setNFC(Boolean NFC) {
        this.NFC = NFC;
    }

    public Boolean getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(Boolean fingerprint) {
        this.fingerprint = fingerprint;
    }

    public Float getMegapixels() {
        return megapixels;
    }

    public void setMegapixels(Float megapixels) {
        this.megapixels = megapixels;
    }

    //toString()


    @Override
    public String toString() {
        return "SmartPhone{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", calls=" + calls +
                ", NFC=" + NFC +
                ", fingerprint=" + fingerprint +
                ", megapixels=" + megapixels +
                '}';
    }
}
