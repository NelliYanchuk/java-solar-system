package dev.nyanchuk;

public class Controller {

    Planet planet;

    // Method to calculate the density of the planet
    public double calculateDensity() {
        return planet.getMassInKg() / planet.getVolumeIn3Km();
    }

    // Method to check if a planet is an outer planet
    public boolean isOuterPlanet() {
        // Outer planet is beyond the asteroid belt (between 2.1 and 3.4 AU)
        return planet.getAverageDistanceToSunInMillionKm() > 2.1 && planet.getAverageDistanceToSunInMillionKm() < 3.4;
    }

}
