import java.util.NoSuchElementException;

/**
 * An parameterized interface for a worklist used by the MazeSolver class.
 *
 * @author Geoff Schmit
 */

public interface Worklist<T> {
    /**
     * Add an item to the worklist
     * @param item the data item to add (of type T)
     */
    void add(T item);

    /**
     * Remove the next item from the worklist
     * @return the next item from the worklist
     * @throws NoSuchElementException if the worklist is empty
     */
    T remove() throws NoSuchElementException;

    /**
     * Return the next item in the worklist without removing it
     * @return the next item in the worklist without removing it
     * @throws NoSuchElementException if the worklist is empty
     */
    T peek() throws NoSuchElementException;

    /**
     * Returns the number of items in the worklist
     * @return the number of items in the worklist
     */
    int size();

    /**
     * Returns true if the worklist is empty
     * @return true if the size is 0, false otherwise
     */
    boolean isEmpty();

    /**
     * Remove all items from the worklist
     */
    void clear();

}
