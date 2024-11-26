package dev.nyanchuk;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class PlanetTest {

    // venera is an instance variable
    private Planet venera;

    @BeforeEach
    void beforeEach() {
        // Initialize venera before each test method
        venera = new Planet(
            "Venus",
            0,
            4.87e24,   // Mass in kg (4.87 × 10^24 kg)
            9.28e11,   // Volume in cubic kilometers (9.28 × 10^11 km³)
            12104,
            108,
            PlanetType.TERRESTRIAL,
            false, // Not visible to the naked eye
            0.615,
            243
        );
    }

    @Test
    void testGetName() {
        venera.setName("Earth");
        assertEquals("Earth", venera.getName());
    }

    @Test
    void testGetNumberOfSatellite() {
        venera.setNumberOfSatellite(1);
        assertEquals(1, venera.getNumberOfSatellite());
    }

    @Test
    void testGetMassInKg() {
        venera.setMassInKg(5.97e24);
        assertEquals(5.97e24, venera.getMassInKg());
    }

    @Test
    void testGetVolumeIn3Km() {
        venera.setVolumeIn3Km(1.08321e12);
        assertEquals(1.08321e12, venera.getVolumeIn3Km());
    }

    @Test
    void testGetDiameterInKm() {
        venera.setDiameterInKm(12742);
        assertEquals(12742, venera.getDiameterInKm());
    }

    @Test
    void testGetAverageDistanceToSunInMillionKm() {
        venera.setAverageDistanceToSunInMillionKm(150);
        assertEquals(150, venera.getAverageDistanceToSunInMillionKm());
    }

    @Test
    void testGetType() {
        venera.setType(PlanetType.TERRESTRIAL);
        assertEquals(PlanetType.TERRESTRIAL, venera.getType());
    }

    @Test
    void testGetIsVisible() {
        venera.setIsVisible(true);
        assertTrue(venera.getIsVisible());
    }

    @Test
    void testGetOrbitalPeriodInYears() {
        venera.setOrbitalPeriodInYears(1);
        assertEquals(1, venera.getOrbitalPeriodInYears());
    }

    @Test
    void testGetRotationPeriodInDays() {
        venera.setRotationPeriodInDays(365);
        assertEquals(365, venera.getRotationPeriodInDays());
    }

    @Test
    void testSetName() {
        venera.setName("Mars");
        assertEquals("Mars", venera.getName());
    }

    @Test
    void testSetNumberOfSatellite() {
        venera.setNumberOfSatellite(2);
        assertEquals(2, venera.getNumberOfSatellite());
    }

    @Test
    void testSetMassInKg() {
        venera.setMassInKg(6.42e23);
        assertEquals(6.42e23, venera.getMassInKg());
    }

    @Test
    void testSetVolumeIn3Km() {
        venera.setVolumeIn3Km(1.63e11);
        assertEquals(1.63e11, venera.getVolumeIn3Km());
    }

    @Test
    void testSetDiameterInKm() {
        venera.setDiameterInKm(6792);
        assertEquals(6792, venera.getDiameterInKm());
    }

    @Test
    void testSetAverageDistanceToSunInMillionKm() {
        venera.setAverageDistanceToSunInMillionKm(228);
        assertEquals(228, venera.getAverageDistanceToSunInMillionKm());
    }

    @Test
    void testSetType() {
        venera.setType(PlanetType.GAS_GIANT);
        assertEquals(PlanetType.GAS_GIANT, venera.getType());
    }

    @Test
    void testSetIsVisible() {
        venera.setIsVisible(false);
        assertFalse(venera.getIsVisible());
    }

    @Test
    void testSetOrbitalPeriodInYears() {
        venera.setOrbitalPeriodInYears(2);
        assertEquals(2, venera.getOrbitalPeriodInYears());
    }

    @Test
    void testSetRotationPeriodInDays() {
        venera.setRotationPeriodInDays(687);
        assertEquals(687, venera.getRotationPeriodInDays());
    }
}
