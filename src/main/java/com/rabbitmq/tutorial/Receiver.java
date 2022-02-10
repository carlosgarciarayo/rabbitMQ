package com.rabbitmq.tutorial;

public class Receiver {

//    public static final String RECEIVE_METHOD_NAME = "receiveMessage";

    //hola que tal
    public void receiveMessage(String message) {
        System.out.println("[Receiver] ha recibido el mensaje \"" + message + '"');
    }
}
