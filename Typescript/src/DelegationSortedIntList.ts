/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */
import {SortedIntList} from "./hidden/SortedIntListLibrary";
import {IntegerList} from "./IntegerList";

class DelegationSortedIntList implements IntegerList {

  // The SortedIntList object that this class delegates to.
  private sortedIntList: SortedIntList;

  // The total number of elements added to the list.
  private totalAdded: number;

  /**
   * Construct a new DelegationSortedIntList object.
   */
  constructor() {
    this.sortedIntList = new SortedIntList();
    this.totalAdded = 0;
  }

  /**
   * Add a number to the list.
   * @param num the number to add to the list
   * @return true if the number was added to the list, false otherwise
   */
  add(num: number): boolean {
    if (this.sortedIntList.add(num)) {
      this.totalAdded++;
      return true;
    }
    return false;
  }

  /**
   * Add all numbers from the given list to this list.
   * @param list the list of numbers to add to this list
   * @return true if all numbers were added to the list, false otherwise
   */
  addAll(list: IntegerList): boolean {
    if (this.sortedIntList.addAll(list)) {
      this.totalAdded += list.size();
      return true;
    }
    return false;
  }

  /**
   * Get the number at the given index.
   * @param index the index of the number to get
   * @return the number at the given index
   */
  get(index: number): number {
    return this.sortedIntList.get(index);
  }

  /**
   * Remove the number at the given index.
   * @param num the number to remove
   * @return true if the number was removed, false otherwise
   */
  remove(num: number): boolean {
    return this.sortedIntList.remove(num);
  }


  /**
   * Remove all numbers from the given list from this list.
   * @param list the list of numbers to remove from this list
   * @return true if all numbers were removed from the list, false otherwise
   */
  removeAll(list: IntegerList): boolean {
    return this.sortedIntList.removeAll(list);
  }

  /**
   * Get the size of the list.
   * @return the size of the list
   */
  size(): number {
    return this.sortedIntList.size();
  }

  /**
   * Get the total number of elements added to the list.
   * @return the total number of elements added to the list
   */
  getTotalAdded(): number {
    return this.totalAdded;
  }

}

export {DelegationSortedIntList}
