package dev.nyanchuk;

public class Planet {

    // Attributes
    private String name;
    private int numberOfSatellite;
    private double massInKg;
    private double volumeIn3Km;
    private int diameterInKm;
    private double averageDistanceToSunInMillionKm;
    private PlanetType type;
    private boolean isVisible;
    private double orbitalPeriodInYears;
    private double rotationPeriodInDays;

    // Constructor to initialize the attributes
    public Planet(String name, int numberOfSatellite, double massInKg, double volumeIn3Km, int diameterInKm,
            double averageDistanceToSunInMillionKm, PlanetType type, boolean isVisible,
            double orbitalPeriodInYears, double rotationPeriodInDays) {
        this.name = name;
        this.numberOfSatellite = numberOfSatellite;
        this.massInKg = massInKg;
        this.volumeIn3Km = volumeIn3Km;
        this.diameterInKm = diameterInKm;
        this.averageDistanceToSunInMillionKm = averageDistanceToSunInMillionKm;
        this.type = type;
        this.isVisible = isVisible;
        this.orbitalPeriodInYears = orbitalPeriodInYears;
        this.rotationPeriodInDays = rotationPeriodInDays;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSatellite() {
        return numberOfSatellite;
    }

    public void setNumberOfSatellite(int numberOfSatellite) {
        this.numberOfSatellite = numberOfSatellite;
    }

    public double getMassInKg() {
        return massInKg;
    }

    public void setMassInKg(double massInKg) {
        this.massInKg = massInKg;
    }

    public double getVolumeIn3Km() {
        return volumeIn3Km;
    }

    public void setVolumeIn3Km(double volumeIn3Km) {
        this.volumeIn3Km = volumeIn3Km;
    }

    public int getDiameterInKm() {
        return diameterInKm;
    }

    public void setDiameterInKm(int diameterInKm) {
        this.diameterInKm = diameterInKm;
    }

    public double getAverageDistanceToSunInMillionKm() {
        return averageDistanceToSunInMillionKm;
    }

    public void setAverageDistanceToSunInMillionKm(int averageDistanceToSunInMillionKm) {
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

    public void setIsVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }

    public double getOrbitalPeriodInYears() {
        return orbitalPeriodInYears;
    }

    public void setOrbitalPeriodInYears(double orbitalPeriodInYears) {
        this.orbitalPeriodInYears = orbitalPeriodInYears;
    }

    public double getRotationPeriodInDays() {
        return rotationPeriodInDays;
    }

    public void setRotationPeriodInDays(int rotationPeriodInDays) {
        this.rotationPeriodInDays = rotationPeriodInDays;
    }
}
