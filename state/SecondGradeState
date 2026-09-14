package state;

/**
 * Handles the second grade state.
 */
public class SecondGradeState extends State {

    /**
     * Sets up the second grade state.
     *
     * @param vocabularyList the vocabulary list being used
     */
    public SecondGradeState(VocabularyList vocabularyList) {
        super(vocabularyList);
        words = FileReader.getWords("state/txt/second.txt");
    }

    /**
     * Moves the game to third grade.
     */
    @Override
    public void increaseGrade() {
        System.out.println("Moving to Third Grade...");
        vocabularyList.setState(vocabularyList.getThirdGradeState());
    }

    /**
     * Moves the game to first grade.
     */
    @Override
    public void decreaseGrade() {
        System.out.println("Moving to First Grade...");
        vocabularyList.setState(vocabularyList.getFirstGradeState());
    }
}