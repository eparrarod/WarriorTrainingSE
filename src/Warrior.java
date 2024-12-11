/**
 * A warrior with the ability to attack and train.
 * Training modifies their attributes
 */
public class Warrior {
    private double strength;
    private double endurance;

    /**
     * Constructor to create a new warrior with the specified
     * values for their strength and endurance attibutes
     *
     * @param strength The strength of the character
     * @param endurance The endurance of the character
     */
    public Warrior(double strength, double endurance) {
        this.strength = strength;
        this.endurance = endurance;
    }

    /**
     * Retrieves the current strength of the character
     *
     * @return the character's strength as a double.
     */
    public double getStrength() {
        return this.strength;
    }

    /**
     * Retrieves the current endurance of the character
     *
     * @return the character's endurance as a double.
     */
    public double getEndurance() {
        return this.endurance;
    }
}

