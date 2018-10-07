package com.fengjie.creatorPattern.factory.abstractFactory;

/**
 * @author fengjie
 * @date 2018:10:06
 */
public class HpFactory implements PcFactory{
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keyboard createKeyborad() {
        return new HpKeyBoard();
    }
}
