package state;

/**
 * Handles the first grade state.
 */
public class FirstGradeState extends State {

    /**
     * Sets up the first grade state.
     *
     * @param vocabularyList the vocabulary list being used
     */
    public FirstGradeState(VocabularyList vocabularyList) {
        super(vocabularyList);
        words = FileReader.getWords("state/txt/first.txt");
    }

    /**
     * Moves the game to second grade.
     */
    @Override
    public void increaseGrade() {
        System.out.println("Moving to Second Grade...");
        vocabularyList.setState(vocabularyList.getSecondGradeState());
    }

    /**
     * Keeps the game in first grade.
     */
    @Override
    public void decreaseGrade() {
    }
}