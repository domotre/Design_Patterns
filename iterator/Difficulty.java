package iterator;

/**
 * Difficulty levels for a ticket
 */
public enum Difficulty {
    HARD("\u001B[31m"),
    MEDIUM("\u001B[32m"),
    EASY("\u001B[33m");

    public final String ASCII;

    /**
     * Creates a difficulty
     * @param ascii color for the difficulty
     */
    private Difficulty(String ascii) {
        this.ASCII = ascii;
    }
}