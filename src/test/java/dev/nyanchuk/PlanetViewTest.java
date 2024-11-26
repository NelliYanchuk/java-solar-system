package dev.nyanchuk;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PlanetViewTest {

    static Planet uranus;
    static Planet neptune;

    static ByteArrayOutputStream outputStream;

    @BeforeAll
    static void beforeClass() {
        uranus = new Planet(
                "Uranus",
                27,
                8.681e25,
                6.833e13,
                50724,
                2871,
                PlanetType.GAS_GIANT,
                false,
                84.0,
                17.2);

        neptune = new Planet(
                "Neptune",
                14,
                1.024e26,
                6.254e13,
                49244,
                4495,
                PlanetType.GAS_GIANT,
                false,
                164.8,
                16.1);

        // Redirect System.out to capture printed output
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testGreeting() {
        PlanetView.greeting();

        String output = outputStream.toString();
        assertTrue(output.contains("Hi All!"));
        assertTrue(output.contains("Let's see what planets do we have here!"));
    }

    @Test
    void testPrintDetails() {
        PlanetView.printDetails(uranus);

        String output = outputStream.toString();

        // Check that the output contains the expected details for Mercury
        assertTrue(output.contains("Planet Name: Uranus"));
        assertTrue(output.contains("Number of Satellites: 27"));
        assertTrue(output.contains("Planet Type: Gas giant"));
        assertTrue(output.contains("Visible to the naked eye: false"));
    }

    @Test
    void testPrintDetailsSaturn() {
        PlanetView.printDetails(neptune);

        String output = outputStream.toString();

        // Check that the output contains the expected details for Saturn
        assertTrue(output.contains("Planet Name: Neptune"));
        assertTrue(output.contains("Number of Satellites: 14"));
        assertTrue(output.contains("Planet Type: Gas giant"));
        assertTrue(output.contains("Visible to the naked eye: false"));
    }
}
