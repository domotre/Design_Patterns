package singleton;

import java.util.Random;
import java.util.ArrayList;

public class FlashCards {
    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words;

    /**
     * Makes the flash cards
     */
    private FlashCards() {
        rand = new Random();
        words = FileReader.getWords();
    }

    /**
     * Gets the flash cards object
     *
     * @return the FlashCards object
     */
    public static FlashCards getInstance() {
        if (flashCards == null) {
            flashCards = new FlashCards();
        }

        return flashCards;
    }

    /**
     * Gets a random word
     *
     * @return a random word
     */
    public Word getWord() {
        int index = rand.nextInt(words.size());
        return words.get(index);
    }
}