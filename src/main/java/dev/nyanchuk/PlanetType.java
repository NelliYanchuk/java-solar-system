package dev.nyanchuk;

public enum PlanetType {

    GAS_GIANT("Gas giant"),
    TERRESTRIAL("Terrestrial"),
    DWARF("Dwarf");

    private final String description;

    // Constructor
    PlanetType(String description) {
        this.description = description;
    }

    // Getter
    public String getDescription() {
        return description;
    }
}

