package com.pnc.book.store.app;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2021-04-08T12:15:56.227-05:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "BookStorePortService", 
                  wsdlLocation = "file:/C:/Workspace/pnc-book-store-app/src/main/resources/bookstore.wsdl",
                  targetNamespace = "http://www.pnc.com/book/store/app") 
public class BookStorePortService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.pnc.com/book/store/app", "BookStorePortService");
    public final static QName BookStorePortSoap11 = new QName("http://www.pnc.com/book/store/app", "BookStorePortSoap11");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Workspace/pnc-book-store-app/src/main/resources/bookstore.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BookStorePortService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Workspace/pnc-book-store-app/src/main/resources/bookstore.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BookStorePortService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BookStorePortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookStorePortService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public BookStorePortService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public BookStorePortService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public BookStorePortService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns BookStorePort
     */
    @WebEndpoint(name = "BookStorePortSoap11")
    public BookStorePort getBookStorePortSoap11() {
        return super.getPort(BookStorePortSoap11, BookStorePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BookStorePort
     */
    @WebEndpoint(name = "BookStorePortSoap11")
    public BookStorePort getBookStorePortSoap11(WebServiceFeature... features) {
        return super.getPort(BookStorePortSoap11, BookStorePort.class, features);
    }

}