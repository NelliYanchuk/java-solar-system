**Solar System (*67)**  
A program is required to model the concept of a planet in the solar system.

A planet has the following attributes:
- A name of type `String` with an initial value of `null`.
- Number of satellites of type `int` with an initial value of zero.
- Mass in kilograms of type `double` with an initial value of zero.
- Volume in cubic kilometers of type `double` with an initial value of zero.
- Diameter in kilometers of type `int` with an initial value of zero.
- Average distance to the Sun in millions of kilometers, of type `int`, with an initial value of zero.
- Type of planet according to its size, of an enumerated type with the following possible values: GAS GIANT, TERRESTRIAL, and DWARF.
- Observable with the naked eye, of type `boolean` with an initial value of `false`.

The class should include the following methods:
- The class should have a constructor that initializes the values of its respective attributes.
- Define a method that returns the values of the planet's attributes.
- Calculate the density of the planet as the quotient of its mass and volume.
- Determine if a planet in the solar system is considered an outer planet.
  - An outer planet is located beyond the asteroid belt. The asteroid belt lies between 2.1 and 3.4 AU. One astronomical unit (AU) is the distance between the Earth and the Sun = 149,597,870 km.
- In the `main` method of the `App` class, create two planets and display the values of their attributes on screen. Additionally, print the density of each planet and whether the planet is an outer planet in the solar system.

**Extension:**
- Add two attributes to the `Planet` class. The first should represent the planet's orbital period (in years). The second attribute represents the planet's rotation period (in days).
- Modify the class constructor to initialize the values of these two new attributes.
- Modify the `print` method to display the values of the new attributes on the screen.

**Requirements:**
- The `Planet` class must be tested (Minimum 70% coverage).
- The Readme should include the class diagram.

**Deliverables:**
- Link to the GitHub repository
- Screenshot of the "Testing" section in Visual Studio Code showing the test coverage