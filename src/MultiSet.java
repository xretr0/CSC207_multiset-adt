/**
 * Abstract class representing a MultiSet ADT.
 */
public abstract class MultiSet {

    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    abstract void add(int item);
    abstract void remove(Integer item);
    abstract boolean contains(Integer item);
    abstract boolean isEmpty();
    abstract int count(Integer item);
    abstract int size();
    // TODO finish adding abstract methods to fully describe what it means to be a MultiSet.

    public static void main(String[] args) {
        System.out.println("hi");
    }
}
