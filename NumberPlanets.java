/*
* The number planets program finds the location of the planet in the
* solar system. 
*
* @author Cameron Teed
* @version 1.0
* @since   2021-05-04
* Class NumberPlanets.
*/


// Import the Scanner class
import java.util.Scanner;

final class NumberPlanets {

  private NumberPlanets() {
    // Prevent instantiation
    // Optional: throw an exception e.g. AssertionError
    // if this ever *is* called
     throw new IllegalStateException("Cannot be instantiated");
  }

  /**
  * Creates enumeration of the planets
  *
  * @param
  * @return planetNum
  */
  enum PlanetsEnum {
    /**
    * The first planet.
    */
    MERCURY(1),
    /**
    * The second planet.
    */
    VENUS(2),
    /**
    * The third planet.
    */
    EARTH(3),
    /**
    * The fourth planet.
    */
    MARS(4),
    /**
    * The fifth planet.
    */
    JUPITER(5),
    /**
    * The sicth planet.
    */
    SATURN(6),
    /**
    * The seventh planet.
    */
    URANUS(7),
    /**
    * The eigth planet.
    */
    NEPTUNE(8);
    /**
    * Setting planet number to 0.
    */
    private int planetNum = 0;

    /**
    * Finds where the planet is located
    *
    * @param enumIndex
    */
    PlanetsEnum(final int enumNum) {
      // Finds the coresponding number to the planet
      this.planetNum = enumNum;
    }

    // Returns planet position
    public int showPlanet() {
      return planetNum;
    }
  }

  /**
  * Finds the location of the inputted planet in our solar system
  *
  * @param args
  */
  public static void main(final String[] args) {
    try {
      // states variables
      String planetInput = "";

      // create scanner object
      Scanner scan = new Scanner(System.in);

      // Asks user to input planet
      System.out.println("Enter the planet name: ");
      String userInput = scan.nextLine();

      // Converts string to uppercase
      planetInput = userInput.toUpperCase();
      // Call on the function and creates the enumerator
      PlanetsEnum planetName = PlanetsEnum.valueOf(planetInput);
      // Receives the planet posision
      int planetPosition = planetName.showPlanet();

      // Prints out the planet numbers
      System.out.println();
      System.out.println(userInput + " is planet number " + planetPosition
      + " in the solar system.");
      System.out.println();
      System.out.println("Done.");

    // Catches inputs other than the planet names
    } catch (Exception e) {
      System.out.println();
      System.out.println("Invalid Input. Try again.");
    }
  }
}
