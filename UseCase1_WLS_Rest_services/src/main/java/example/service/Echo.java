package example.service;

import javax.jws.*;
import javax.xml.ws.Endpoint;
//import javax.servlet.*;

@WebService
public class Echo {
    @WebMethod
    public int echoInt(int value) { return value; }
    @WebMethod
    public String echoString(String value) { return value; }
    @WebMethod
    public MyObject echoMyObject(MyObject value) { return value; }

    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:8080/echo", new Echo());
    }
}
