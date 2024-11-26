package dev.nyanchuk;

public class PlanetView {

    public static void greeting() {
        System.out.println("\nHi All!");
        System.out.println("Let's see what planets do we have here!");
    }

    public static void printDetails(Planet planet) {
        System.out.println("\nPlanet Name: " + planet.getName());
        System.out.println("Number of Satellites: " + planet.getNumberOfSatellite());
        System.out.println("Mass: " + planet.getMassInKg() + " kg");
        System.out.println("Volume: " + planet.getVolumeIn3Km() + " km3");
        System.out.println("Diameter: " + planet.getDiameterInKm() + " km");
        System.out.println("Average Distance to Sun: " + planet.getAverageDistanceToSunInMillionKm() + " million km");
        System.out.println("Planet Type: " + planet.getType().getDescription());
        System.out.println("Visible to the naked eye: " + planet.getIsVisible());
        System.out.println("Orbital Period: " + planet.getOrbitalPeriodInYears() + " Earth years");
        System.out.println("Rotation Period: " + planet.getRotationPeriodInDays() + " days");
        System.out.println("Density: " + PlanetController.calculateDensity(planet ));
        System.out.println("Is Outer Planet: " + PlanetController.isOuterPlanet(planet));
    }
}
