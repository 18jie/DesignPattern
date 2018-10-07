package com.fengjie.creatorPattern.factory.factoryMethod;

/**
 * @author fengjie
 * @date 2018:10:06
 */
public class EmailSender implements Sender{
    @Override
    public void send() {
        System.out.println("EmailSender");
    }
}
