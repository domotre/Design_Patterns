package singleton;

public class Word {
    private String word;
    private String type;
    private String definition;
    private String sentence;

    /**
     * Makes a word for a flash card
     *
     * @param word the word
     * @param type the part of speech
     * @param definition the definition of the word
     * @param sentence an example sentence
     */
    public Word(String word, String type, String definition, String sentence) {
        this.word = word;
        this.type = type;
        this.definition = definition;
        this.sentence = sentence;
    }

    /**
     * Shows the front of the flash card
     *
     * @return the word
     */
    public String getFlashCardFront() {
        String line = "+" + "-".repeat(118) + "+";

        return line + "\n"
                + String.format("| %-116s |\n", "Word: " + word.toUpperCase())
                + String.format("| %-116s |\n", "")
                + String.format("| %-116s |\n", "")
                + line + "\n";
    }

    /**
     * Shows the back of the flash card
     *
     * @return the word information
     */
    public String getFlashCardBack() {
        String line = "+" + "-".repeat(118) + "+";

        return line + "\n"
                + String.format("| %-116s |\n", "Word: " + word.toUpperCase())
                + String.format("| %-116s |\n", "Part of Speech: " + type)
                + String.format("| %-116s |\n", "Definition: " + definition)
                + String.format("| %-116s |\n", "Example: " + sentence)
                + line + "\n";
    }
}