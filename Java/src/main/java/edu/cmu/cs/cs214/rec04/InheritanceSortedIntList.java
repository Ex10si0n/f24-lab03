package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 */

public class InheritanceSortedIntList extends SortedIntList {

    private int totalAdded;

    public InheritanceSortedIntList() {
        super();
        this.totalAdded = 0;
    }

    /**
     * Adds an integer to the list and increments the totalAdded count
     * @param num an integer to be added to the list
     * @return true if the integer was added to the list, false otherwise
     */
    @Override
    public boolean add(int num) {
        if (super.add(num)) {
            this.totalAdded++;
            return true;
        }
        return false;
    }

    /**
     * Adds all elements from the given IntegerList to the list and increments the totalAdded count
     * @param list IntegerList containing elements to be added to the list
     * @return true if all elements were added to the list, false otherwise
     */
    @Override
    public boolean addAll(IntegerList list) {
//        this.totalAdded += list.size();
        return super.addAll(list);
    }

    /**
     * Get the total number of elements added to the list
     * @return the total number of elements added to the list
     */
    public int getTotalAdded() {
        return this.totalAdded;
    }

}