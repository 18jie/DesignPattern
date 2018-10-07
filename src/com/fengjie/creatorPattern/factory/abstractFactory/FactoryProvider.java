package com.fengjie.creatorPattern.factory.abstractFactory;

/**
 * @author fengjie
 * @date 2018:10:06
 */
public class FactoryProvider {

    public PcFactory hpFactory(){
        return new HpFactory();
    }

    public PcFactory dellFacroty(){
        return new DellFactory();
    }

}
