package web.model;

public class Car {

    String manufacturer;
    String model;
    Double engineVolume;

    public Car(String manufacturer, String model, Double engineVolume) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }
}
