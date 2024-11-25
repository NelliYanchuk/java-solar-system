package dev.nyanchuk;

public class Planet {

    // Attributes
    private String name = null;
    private int numberOfSatellite = 0;
    private double massInKg = 0.0; 
    private double volumeIn3Km = 0.0;
    private int diameterInKm = 0; 
    private int averageDistanceToSunInMillionKm = 0;
    private PlanetType type = PlanetType.TERRESTRIAL;
    private boolean isVisible = false;

    

    // Constructor to initialize the attributes
    public Planet(String name, int numberOfSatellite, double massInKg, double volumeIn3Km, int diameterInKm,
                  int averageDistanceToSunInMillionKm, PlanetType type, boolean isVisible) {
        this.name = name;
        this.numberOfSatellite = numberOfSatellite;
        this.massInKg = massInKg;
        this.volumeIn3Km = volumeIn3Km;
        this.diameterInKm = diameterInKm;
        this.averageDistanceToSunInMillionKm = averageDistanceToSunInMillionKm;
        this.type = type;
        this.isVisible = isVisible;
    }

    // Default constructor
    public Planet() {}

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getnumberOfSatellite() {
        return numberOfSatellite;
    }

    public void setnumberOfSatellite(int numberOfSatellite) {
        this.numberOfSatellite = numberOfSatellite;
    }

    public double getmassInKg() {
        return massInKg;
    }

    public void setmassInKg(double massInKg) {
        this.massInKg = massInKg;
    }

    public double getvolumeIn3Km() {
        return volumeIn3Km;
    }

    public void setvolumeIn3Km(double volumeIn3Km) {
        this.volumeIn3Km = volumeIn3Km;
    }

    public int getdiameterInKm() {
        return diameterInKm;
    }

    public void setdiameterInKm(int diameterInKm) {
        this.diameterInKm = diameterInKm;
    }

    public int getaverageDistanceToSunInMillionKm() {
        return averageDistanceToSunInMillionKm;
    }

    public void setaverageDistanceToSunInMillionKm(int averageDistanceToSunInMillionKm) {
        this.averageDistanceToSunInMillionKm = averageDistanceToSunInMillionKm;
    }

    public PlanetType getType() {
        return type;
    }

    public void setType(PlanetType type) {
        this.type = type;
    }

    public boolean getIsVisible() {
        return isVisible;
    }

    public void setisVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }

    // Method to calculate the density of the planet
    public double calculateDensity() {
        if (volumeIn3Km == 0) {
            return 0;
        }
        return massInKg / volumeIn3Km;
    }

    // Method to check if a planet is an outer planet
    public boolean isOuterPlanet() {
        // Outer planet is beyond the asteroid belt (between 2.1 and 3.4 AU)
        return averageDistanceToSunInMillionKm > 2.1 && averageDistanceToSunInMillionKm < 3.4;
    }

    // Method to display the planet's details
    public void printDetails() {
        System.out.println("Planet Name: " + name);
        System.out.println("Number of Satellites: " + numberOfSatellite);
        System.out.println("Mass: " + massInKg + " kg");
        System.out.println("Volume: " + volumeIn3Km + " km³");
        System.out.println("Diameter: " + diameterInKm + " km");
        System.out.println("Average Distance to Sun: " + averageDistanceToSunInMillionKm + " million km");
        System.out.println("Planet Type: " + type);
        System.out.println("Observable: " + isVisible);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 1, 5.972E24, 1.08321E12, 12742, 1, PlanetType.TERRESTRIAL, true);
        earth.printDetails();
        System.out.println("Density: " + earth.calculateDensity() + " kg/km³");
        System.out.println("Is Outer Planet: " + earth.isOuterPlanet());
    }
}
