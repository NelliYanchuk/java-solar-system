package dev.nyanchuk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PlanetControllerTest {
    // Declare jupiter and mars as static variables
    static Planet jupiter;
    static Planet mars;

    @BeforeAll
    static void beforeClass() {
        jupiter = new Planet(
                "Jupiter",
                79,
                1.898e27,
                1.43128e15,
                139820,
                778.3,
                PlanetType.GAS_GIANT,
                true,
                11.86,
                9.93);
        mars = new Planet(
                "Mars",
                2,
                6.417e23,
                1.6318e11,
                6779,
                227.9,
                PlanetType.TERRESTRIAL,
                true,
                1.88,
                24.6);

    }

    @Test
    void testCalculateDensity() {
        double densityJupiter = PlanetController.calculateDensity(jupiter);
        double densityMars = PlanetController.calculateDensity(mars);

        double expectedDensityJupiter = 1.898e27 / 1.43128e15;
        double expectedDensityMars = 6.417e23 / 1.6318e11;

        assertEquals(expectedDensityJupiter, densityJupiter);
        assertEquals(expectedDensityMars, densityMars);

    }

    @Test
    void testIsOuterPlanet() {
        assertFalse(PlanetController.isOuterPlanet(mars));
        assertTrue(PlanetController.isOuterPlanet(jupiter));
    }
}
