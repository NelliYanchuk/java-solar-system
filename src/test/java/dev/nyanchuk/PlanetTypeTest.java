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
    void testValues() {
        // Test that the enum contains the correct values
        assertTrue(PlanetType.GAS_GIANT instanceof PlanetType);
        assertTrue(PlanetType.TERRESTRIAL instanceof PlanetType);
        assertTrue(PlanetType.DWARF instanceof PlanetType);
    }

}
