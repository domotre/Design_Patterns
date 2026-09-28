package iterator;

import java.util.Iterator;

/**
 * Goes through the tickets in a task list
 */
public class TaskListIterator implements Iterator<Ticket> {
    private Ticket[] tickets;
    private int position;

    /**
     * Creates the iterator
     */
    public TaskListIterator(Ticket[] tickets) {
        this.tickets = tickets;
        this.position = 0;
    }

    /**
     * Checks if there is another ticket
     */
    public boolean hasNext() {
        return position < tickets.length && tickets[position] != null;
    }

    /**
     * Gets the next ticket
     */
    public Ticket next() {
        return tickets[position++];
    }
}