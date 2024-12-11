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

    /**
     * Trains the character by increasing either strength or endurance based on the activity.
     * Valid activities are:
     * <ul>
     *   <li>"weights" - Increases the character's strength by 10.</li>
     *   <li>"cardio" - Increases the character's endurance by 5.</li>
     * </ul>
     * If an invalid activity is provided, an error message is displayed.
     *
     * @param activity the type of training activity to perform ("weights" or "cardio").
     */
    public void train(String activity) {
        if (activity.equalsIgnoreCase("weights")) {
            this.strength += 10;
        } else if (activity.equalsIgnoreCase("cardio")) {
            this.endurance += 5;
        } else {
            System.out.println("Invalid training activity");
        }
    }

    /**
     * Performs an attack, reducing the character's endurance based on the damage dealt.
     * If the character's strength is greater than the damage, endurance is reduced by half
     * of the damage value; otherwise, endurance is reduced by the full damage value.
     *
     * @param damage the amount of damage to be dealt in the attack.
     */
    public void attack(double damage) {
        if(damage > 0.0){
            if (this.strength > damage) {
                this.endurance -= (endurance / 2);
            } else {
                this.endurance += endurance / 2;
            }
        }
    }
}
