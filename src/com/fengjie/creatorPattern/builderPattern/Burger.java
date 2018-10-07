package com.fengjie.creatorPattern.builderPattern;

/**
 * @author fengjie
 * @date 2018:10:06
 */
public class Burger implements Item{
    @Override
    public String name() {
        return null;
    }

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public float price() {
        return 0;
    }
}
