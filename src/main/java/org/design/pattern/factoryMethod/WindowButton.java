package org.design.pattern.factoryMethod;

public class WindowButton implements Button{
    @Override
    public String render() {
        return "Window Button";
    }

    @Override
    public String onClick() {
        return "Click on window";
    }
}
