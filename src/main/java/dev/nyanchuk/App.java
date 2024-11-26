package dev.nyanchuk;

public final class App {

    public static void main(String[] args) {

        Planet mercury = new Planet(
                "Mercury",
                0,
                3.3e23,
                6.083e13,
                4880,
                57.9,
                PlanetType.TERRESTRIAL,
                true,
                0.24,
                58.6);
    }

    Planet saturn = new Planet(
            "Saturn",
            82,
            5.683e26,
            8.2713e14,
            116460,
            1427,
            PlanetType.GAS_GIANT,
            false,
            29.5,
            10.7);

    

}
