package state;

import java.util.HashMap;
import java.util.Random;

/**
 * Represents the current grade state of the vocabulary game.
 */
public abstract class State {

    protected VocabularyList vocabularyList;
    protected HashMap<String, String> words;
    private Random rand;

    /**
     * Creates a state for the vocabulary game.
     * 
     * @param vocabularyList the vocabulary list using this state
     */
    public State(VocabularyList vocabularyList) {
        this.vocabularyList = vocabularyList;
        this.rand = new Random();
    }

    /**
     * Gets a random definition from the current list of words.
     * 
     * @return a random definition
     */
    public String getNextDefinition() {
        Object[] definitions = words.keySet().toArray();
        return (String) definitions[rand.nextInt(definitions.length)];
    }

    /**
     * Gets the word that matches a definition.
     * 
     * @param definition the definition to match
     * @return the matching word
     */
    public String getMatchingWord(String definition) {
        return words.get(definition);
    }

    /**
     * Moves the game up one grade.
     */
    public abstract void increaseGrade();

    /**
     * Moves the game down one grade.
     */
    public abstract void decreaseGrade();
}