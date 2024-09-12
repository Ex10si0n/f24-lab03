import {SortedIntList} from './hidden/SortedIntListLibrary.js'
import {IntegerList} from "./IntegerList";

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

class InheritanceSortedIntList extends SortedIntList {

  // The total number of elements added to the list.
  private totalAdded: number

  /**
   * Construct a new InheritanceSortedIntList object.
   */
  constructor() {
    super();
    this.totalAdded = 0
  }

  /**
   * Adds a number to the list and increments totalAdded if successful.
   * @param num a number to be added
   * @return true if the number was added, false otherwise
   */
  add(num: number): boolean {
    if (super.add(num)) {
      this.totalAdded++
      return true
    }
    return false
  }

  /**
   * Adds all elements from the given list and increments totalAdded accordingly.
   * @param list
   * @return true if all elements were added, false otherwise
   */
  addAll(list: IntegerList): boolean {
    return super.addAll(list);
  }

  /**
   * Get the total number of elements added to the list.
   * @return the total number of elements added to the list
   */
  getTotalAdded(): number {
    return this.totalAdded;
  }
}

export {InheritanceSortedIntList}
