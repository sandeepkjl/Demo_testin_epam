package designpatterns.stucturaldesignpattern.proxy;

/**
 * proxy pattern is act as a placeholder for actual server. it serves the request behalf of the actual server.
 *
 * Proxy is of different type.
 *
 *Protection Proxy:- this proxy control the access of the actual service, it performs check operation like
 * authentication or authorization.
 *
 * Remote Proxy :- This Proxy gives the local representation of the remote server.
 *
 * Virtual Proxy:- this proxy delay the object intialization, until the object is asked for,
 * it provide lazy loading of the object, like in hibernate for one many relationship we have.
 *
 *
 * below is the example of protection proxy class.
 * **/
public class ProxyTest {
    public static void main(String args[]){

        ProxyInternetAccess proxyInternetAccess = new ProxyInternetAccess();

        proxyInternetAccess.connectTo("abc.com");
        proxyInternetAccess.connectTo("sandeep.com");
    }
}
