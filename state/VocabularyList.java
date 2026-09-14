package state;

/**
 * Keeps track of the grade states and which one the game is using.
 */
public class VocabularyList {

    private State state;
    private FirstGradeState firstGradeState;
    private SecondGradeState secondGradeState;
    private ThirdGradeState thirdGradeState;

    /**
     * Sets up all three grade states and starts on first grade.
     */
    public VocabularyList() {
        firstGradeState = new FirstGradeState(this);
        secondGradeState = new SecondGradeState(this);
        thirdGradeState = new ThirdGradeState(this);

        state = firstGradeState;
    }

    /**
     * Gets the next definition from the current grade.
     *
     * @return the next definition
     */
    public String getNextDefinition() {
        return state.getNextDefinition();
    }

    /**
     * Gets the word that goes with the definition.
     *
     * @param definition the definition being checked
     * @return the matching word
     */
    public String getMatchingWord(String definition) {
        return state.getMatchingWord(definition);
    }

    /**
     * Moves the game up a grade.
     */
    public void increaseGrade() {
        state.increaseGrade();
    }

    /**
     * Moves the game down a grade.
     */
    public void decreaseGrade() {
        state.decreaseGrade();
    }

    /**
     * Gets the first grade state.
     *
     * @return first grade state
     */
    public State getFirstGradeState() {
        return firstGradeState;
    }

    /**
     * Gets the second grade state.
     *
     * @return second grade state
     */
    public State getSecondGradeState() {
        return secondGradeState;
    }

    /**
     * Gets the third grade state.
     *
     * @return third grade state
     */
    public State getThirdGradeState() {
        return thirdGradeState;
    }

    /**
     * Changes which state the game is using.
     *
     * @param state the state to switch to
     */
    public void setState(State state) {
        this.state = state;
    }
}