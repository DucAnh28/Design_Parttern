package org.design.patterns.Creational.Factory_Method;

public class Application {

    public static void main(String[] args) {
        Button button = ButtonFactory.generateButton(ButtonType.WEB_BUTTON);
        System.out.println("-------------------------");
        System.out.println(button.render());
        System.out.println(button.onClick());
    }
}
