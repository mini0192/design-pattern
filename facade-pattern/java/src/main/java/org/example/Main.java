package org.example;

import org.example.home.SmartHome;
import org.example.home.object.CoffeeMaker;
import org.example.home.object.Light;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        SmartHome smartHome = new SmartHome(light, coffeeMaker);
        smartHome.wakeUp();
        smartHome.leaveHome();
    }
}