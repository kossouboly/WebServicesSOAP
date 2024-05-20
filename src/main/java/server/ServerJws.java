package server;

import jakarta.xml.ws.Endpoint;
import service.Bankservice;

public class ServerJws {

    public static void main(String[] args) {
        String url = "http://0.0.0.0:8787/";
        Endpoint.publish(url, new Bankservice());
        System.out.println("Web service deployé sur" + url);
    }


}
