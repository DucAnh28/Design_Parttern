package org.design.patterns.Creational.Factory_Method;

public class ButtonFactory {

    public static Button generateButton(ButtonType type) {
        return switch (type) {
            case WEB_BUTTON -> new WebButton();
            case WINDOWS_BUTTON -> new WindowButton();
        };
    }
}
