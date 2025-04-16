package com.xworkz.inheritance.communication;

public class WhatsappRunner {
    public static void main(String[] args) {

        CommunicationPlatform parent = new CommunicationPlatform();
        parent.methodOne();
        parent.methodTwo();
        parent.methodThree();
        parent.methodFour();
        parent.methodFive();

        CommunicationPlatform parentRef = new Whatsapp();
        parentRef.methodOne();
        parentRef.methodTwo();
        parentRef.methodThree();
        parentRef.methodFour();
        parentRef.methodFive();

        Whatsapp child = new Whatsapp();
        child.methodOne();
        child.methodTwo();
        child.childMethodOne();
        child.childMethodTwo();
        child.childMethodThree();
    }
}
