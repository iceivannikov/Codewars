/**
 *  You have access to the ship "draft" and "crew". "Draft" is the total ship weight and "crew" is the number of humans on the ship.
 *  Each crew member adds 1.5 units to the ship draft.
 *  If after removing the weight of the crew, the draft is still more than 20, then the ship is worth looting.
 *  Any ship weighing that much must have a lot of booty!
 */

public class Ship {
    public static final double WEIGHT_PER_PERSON_IN_UNITS = 1.5;
    public static final int DRAFT_AFTER_REMOVAL_OF_CREW_WEIGHT = 20;
    private final double draft;
    private final int crew;

    public Ship(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }

    public boolean isWorthIt() {
        double crewWeight = crew * WEIGHT_PER_PERSON_IN_UNITS;
        return (draft - crewWeight) > DRAFT_AFTER_REMOVAL_OF_CREW_WEIGHT;
    }

}
