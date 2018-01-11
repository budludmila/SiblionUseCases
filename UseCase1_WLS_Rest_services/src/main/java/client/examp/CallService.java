package client.examp;

//import example.service.*;
import client.examp.impl.*;

// нужно, чтобы получить wsdl описание и через него дотянуться до самого веб-сервиса
//import java.net.URL;
// такой эксепшн возникнет при работе с объектом URL
import java.rmi.RemoteException;

// классы, чтобы пропарсить xml-ку c wsdl описанием и дотянуться до тега service в нем
//import javax.xml.namespace.QName;
//import javax.xml.ws.Service;

public class CallService {
    public static void main(String[] args) throws RemoteException {
//    ЕСЛИ СЕРВИС БЫЛ РЕАЛИЗОВАН ЧЕРЕЗ ИНТЕРФЕЙС
//    // создаем ссылку на wsdl описание
//    URL url = new URL("http://127.0.0.1:8080/echo?wsdl");
//    // Параметры следующего конструктора смотрим в самом первом теге WSDL описания - definitions
//    //  1-ый аргумент смотрим в атрибуте targetNamespace
//    //  2-ой аргумент смотрим в атрибуте name
//    QName qname = new QName("http://service.example/", "EchoService");
//    // Теперь мы можем дотянуться до тега service в wsdl описании,
//    Service service = Service.create(url, qname);
//    // а далее и до вложенного в него тега port, чтобы получить ссылку на удаленный от нас объект веб-сервиса
//    Echo ws = service.getPort(Echo.class);
//    // Теперь можно вызывать удаленный метод
//    System.out.println(ws.echoString ("Hello, this's web service"));
//  ==================================================================
/*  в командной строке выполнить:
        >cd C:\Users\myinc\IdeaProjects\SiblionUseCases\UseCase1_WLS_Rest_services\src\main\java
        >wsimport -p client.examp.impl -keep http://127.0.0.1:8080/echo?wsdl
    после чего будет создан пакет client.examp.impl с классами сервиса
 */
    Echo service = new EchoService().getEchoPort();
    System.out.println(service.echoString("Hello, it's web service!"));


    }
}

