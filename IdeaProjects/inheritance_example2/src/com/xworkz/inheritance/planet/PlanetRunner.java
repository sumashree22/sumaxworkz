package com.xworkz.task.planet;

public class PlanetRunner {
    public static void main(String[] args) {
        Planet planet = new Planet();
        planet.rotate();
        planet.revolve();
        planet.reflectLight();
        planet.supportLife();
        planet.maintainOrbit();

        Earth earth = new Earth();
        earth.rotate();
        earth.revolve();
        earth.reflectLight();
        earth.supportLife();
        earth.maintainOrbit();

        Planet planet1 = new Earth();
        planet1.rotate();
        planet1.revolve();
        planet1.reflectLight();
        planet1.supportLife();
        planet1.maintainOrbit();
    }
}