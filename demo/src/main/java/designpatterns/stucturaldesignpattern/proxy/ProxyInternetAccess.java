package designpatterns.stucturaldesignpattern.proxy;


import designpatterns.proxy.Internet;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternetAccess implements Internet {
    Internet internetAccess = new RealInternet();
    static List<String> bannedSites = new ArrayList<>();

    static {
        bannedSites.add("abc.com");
        bannedSites.add("xyz.com");
    }

    @Override
    public void connectTo(String serverHost) {
        if (bannedSites.contains(serverHost)) {
            System.out.println("Internet access is blocked for the host :" + serverHost);
        } else {
            internetAccess.connectTo(serverHost);
        }
    }
}
