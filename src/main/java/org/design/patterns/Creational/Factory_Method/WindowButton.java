package org.design.patterns.Creational.Factory_Method;

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
