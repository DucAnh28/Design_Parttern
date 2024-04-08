package org.design.patterns.Creational.Factory_Method;

public class WebButton implements Button{
    @Override
    public String render() {
        return "Web Button";
    }

    @Override
    public String onClick() {
        return "Click on website";
    }
}
