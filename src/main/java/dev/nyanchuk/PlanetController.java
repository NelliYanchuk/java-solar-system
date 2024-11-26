package dev.nyanchuk;

public class PlanetController {

    Planet planet;

    // Method to calculate the density of the planet
    public static double calculateDensity( Planet planet) {
        return planet.getMassInKg() / planet.getVolumeIn3Km();
    }

    // Method to check if a planet is an outer planet
    public static boolean isOuterPlanet(Planet planet) {
        // Convert distance to AU
    double distanceInAU = planet.getAverageDistanceToSunInMillionKm() / 149.59787;
    return distanceInAU > 3.4;
    }

}
