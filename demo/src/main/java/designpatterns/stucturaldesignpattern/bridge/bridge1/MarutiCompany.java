package designpatterns.stucturaldesignpattern.bridge.bridge1;

public class MarutiCompany extends VehicleCompany {

    public MarutiCompany(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void manufacture() {
        System.out.println("Maruti Suzuki");
        vehicle.buildVehile();
        System.out.println("-----------");
    }
}
