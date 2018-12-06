package hari.edu.hibernate.pojo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Engine {

    @Column(name = "fuelType")
    String fuelType;

    @Column(name="engineType")
    String engineType;

    public Engine() {
    }

    public Engine(String fuelType, String engineType) {
        this.fuelType = fuelType;
        this.engineType = engineType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
