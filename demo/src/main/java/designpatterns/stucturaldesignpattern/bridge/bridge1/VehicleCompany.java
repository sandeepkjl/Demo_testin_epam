package designpatterns.stucturaldesignpattern.bridge.bridge1;

public abstract class VehicleCompany {

    Vehicle vehicle;

    public VehicleCompany(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public abstract void manufacture();
}
