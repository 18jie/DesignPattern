package com.fengjie.creatorPattern.factory.factoryMethod;

/**
 * @author fengjie
 * @date 2018:10:06
 */
public class SenderFactory {

    public static Sender emainSender(){
        return new EmailSender();
    }

    public static Sender smsSender(){
        return new SmsSender();
    }

}
