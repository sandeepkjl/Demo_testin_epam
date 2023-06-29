package designpatterns.stucturaldesignpattern.proxy;

import designpatterns.proxy.Internet;

public class RealInternet implements Internet {

    @Override
    public void connectTo(String serverHost) {
        System.out.println("Connected to "+serverHost);
    }
}
