package designpatterns.stucturaldesignpattern.bridge.bridge1;

/**
 * Bridge Pattern we used when we need to create lots of different sub class,
 *
 * let's take example, if we want to create different type of vehicle like suv,hatchbook, truck etc.
 * from diffrent vendor like maruit, mahindra. so we have to create lot''s of object. like
 * MarutiSuv, MarutiHatchbook, Maruti truck etc. same way for mahindra.
 *
 * in that case we have bridle pattern.
 * in our exmaple we are creating a interface for vehicle type and a abstract class for company.
 *
 * see below example.
 *
 * **/
public class BridgePatternMain {

    public static void main(String args[]){

        Mahindra mahindraSuv = new Mahindra(new SuvVehicle());
        mahindraSuv.manufacture();

        Mahindra mahindraHacth =new Mahindra(new HatchBook());
        mahindraHacth.manufacture();

        Mahindra mahindraTruck = new Mahindra(new Truck());
        mahindraTruck.manufacture();

        MarutiCompany marutiSuv = new MarutiCompany(new SuvVehicle());
        marutiSuv.manufacture();

        MarutiCompany marutiHacth =new MarutiCompany(new HatchBook());
        marutiHacth.manufacture();

        MarutiCompany marutiTruck = new MarutiCompany(new Truck());
        marutiTruck.manufacture();
    }
}
