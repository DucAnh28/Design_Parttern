package org.design.patterns.Creational.Singleton;

public class LazyInitialization {
    private static LazyInitialization instance;

    private LazyInitialization(){

    }
    public static LazyInitialization getInstance(){
        if (instance == null){
            instance = new LazyInitialization();
        }
        return instance;
    }

}
