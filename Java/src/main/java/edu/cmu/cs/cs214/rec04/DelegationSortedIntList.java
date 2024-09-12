package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 */

public class DelegationSortedIntList implements IntegerList {

    /**
     * sortedIntList -- a SortedIntList object to delegate to
     */
    private final SortedIntList sortedIntList;

    /**
     * totalAdded -- the total number of elements added to the list
     */
    private int totalAdded;

    /**
     * Constructor for the DelegationSortedIntList class
     */
    public DelegationSortedIntList() {
        this.sortedIntList = new SortedIntList();
        this.totalAdded = 0;
    }

    /**
     * Delegate the constructor to a SortedIntList object
     *
     * @param num an integer to be added to the list
     * @return true if the integer was added to the list, false otherwise
     */
    @Override
    public boolean add(int num) {
        if (this.sortedIntList.add(num)) {
            this.totalAdded++;
            return true;
        }
        return false;
    }

    /**
     * Delegate the constructor to a SortedIntList object
     *
     * @param list IntegerList containing elements to be added to the list
     * @return true if all elements were added to the list, false otherwise
     */
    @Override
    public boolean addAll(IntegerList list) {
        if (this.sortedIntList.addAll(list)) {
            this.totalAdded += list.size();
            return true;
        }
        return false;
    }

    /**
     * Delegate the constructor to a SortedIntList object
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     */
    @Override
    public int get(int index) {
        return this.sortedIntList.get(index);
    }

    /**
     * Delegate the constructor to a SortedIntList object
     *
     * @param num an integer to be added to the list
     * @return the index of the element in the list
     */
    @Override
    public boolean remove(int num) {
        return this.sortedIntList.remove(num);
    }

    /**
     * Delegate the constructor to a SortedIntList object
     *
     * @param list IntegerList containing elements to be removed from the list
     * @return true if all elements were removed from the list, false otherwise
     */
    @Override
    public boolean removeAll(IntegerList list) {
        return this.sortedIntList.removeAll(list);
    }

    /**
     * Delegate the constructor to a SortedIntList object
     *
     * @return the number of elements in the list
     */
    @Override
    public int size() {
        return this.sortedIntList.size();
    }

    /**
     * Get the total number of elements added to the list
     *
     * @return the total number of elements added to the list
     */
    public int getTotalAdded() {
        return this.totalAdded;
    }

}