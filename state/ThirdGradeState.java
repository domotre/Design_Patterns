package state;

/**
 * Handles the third grade state.
 */
public class ThirdGradeState extends State {

    /**
     * Sets up the third grade state.
     *
     * @param vocabularyList the vocabulary list being used
     */
    public ThirdGradeState(VocabularyList vocabularyList) {
        super(vocabularyList);
        words = FileReader.getWords("state/txt/third.txt");
    }

    /**
     * Keeps the game in third grade.
     */
    @Override
    public void increaseGrade() {
    }

    /**
     * Moves the game to second grade.
     */
    @Override
    public void decreaseGrade() {
        System.out.println("Moving to Second Grade...");
        vocabularyList.setState(vocabularyList.getSecondGradeState());
    }
}