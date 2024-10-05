package org.example.home;

import org.example.home.object.CoffeeMaker;
import org.example.home.object.Light;

public class SmartHome {
    private Light light;
    private CoffeeMaker coffeeMaker;

    public SmartHome(Light light, CoffeeMaker coffeeMaker) {
        this.light = light;
        this.coffeeMaker = coffeeMaker;
    }
    public void wakeUp() {
        light.on();
        coffeeMaker.make();
    }

    public void leaveHome() {
        light.off();
    }
}
