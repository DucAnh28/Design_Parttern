package org.design.pattern.factoryMethod;

public class Application {
    public static Button initialize(boolean whatIf) {
        if (whatIf) return new WebButton();
        else return new WindowButton();
    }

    public static void main(String[] args) {
        Button button = Application.initialize(false);
        System.out.println("-------------------------");
        System.out.println(button.render());
        System.out.println(button.onClick());
    }
}
