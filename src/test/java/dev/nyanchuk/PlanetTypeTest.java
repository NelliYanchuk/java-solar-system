package dev.nyanchuk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlanetTypeTest {
    @Test
    void testValueOf() {
        // Test that the enum names are correct
        assertEquals("GAS_GIANT", PlanetType.GAS_GIANT.name());
        assertEquals("TERRESTRIAL", PlanetType.TERRESTRIAL.name());
        assertEquals("DWARF", PlanetType.DWARF.name());
    }

    @Test
    void testGetDescriptionGasGiant() {
        assertEquals("Gas giant", PlanetType.GAS_GIANT.getDescription());
    }

    @Test
    void testGetDescriptionTerrestrial() {
        assertEquals("Terrestrial", PlanetType.TERRESTRIAL.getDescription());
    }

    @Test
    void testGetDescriptionDwarf() {
        assertEquals("Dwarf", PlanetType.DWARF.getDescription());
    }

}
