package designpatterns.stucturaldesignpattern.bridge.bridge1;

public class Mahindra extends VehicleCompany {

    public Mahindra(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void manufacture() {
        System.out.println("Mahindra Company");
        vehicle.buildVehile();
        System.out.println("--------------");
    }
}
