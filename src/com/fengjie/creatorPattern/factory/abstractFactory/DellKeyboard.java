package com.fengjie.creatorPattern.factory.abstractFactory;

import java.security.Key;

/**
 * @author fengjie
 * @date 2018:10:06
 */
public class DellKeyboard implements Keyboard{
    @Override
    public void sayHi() {
        System.out.println("dellKeyboard");
    }
}
