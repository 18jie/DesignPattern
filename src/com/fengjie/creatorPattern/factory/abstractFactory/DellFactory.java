package com.fengjie.creatorPattern.factory.abstractFactory;

/**
 * @author fengjie
 * @date 2018:10:06
 */
public class DellFactory implements PcFactory{
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard createKeyborad() {
        return new DellKeyboard();
    }
}
